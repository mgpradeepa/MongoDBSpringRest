package in.mgp.rest.springmongo.resource.impl;

import in.mgp.rest.springmongo.domain.Customer;
import in.mgp.rest.springmongo.domain.Order;
import in.mgp.rest.springmongo.resource.OrderManagementResource;
import in.mgp.rest.springmongo.service.OrderService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/orders")
public class OrderManagementResourceImpl implements OrderManagementResource {
	static final Logger logger = LoggerFactory
			.getLogger(OrderManagementResourceImpl.class);

	@Autowired
	OrderService orderService;

	@Override
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public List<Order> findAllOrders() {
		logger.info("Fetching all the orders");
		return orderService.findAllOrders();

	}

	@Override
	@GET
	@Path("/{orderFor}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Order> findByOrders(@PathParam("orderFor") String orderFor) {
		return orderService.findByName(orderFor);
	}

	@Override
	@POST
	@Path("/{id}/{orderFor}/{orderBy}/customer/{customerName}")
	// @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response createNewOrder(@PathParam("id") String id,
			@PathParam("orderFor") String orderFor,
			@PathParam("orderBy") String orderBy,
			@PathParam("customerName") String customerName) {
		Order order = new Order(Integer.parseInt(id), orderFor, orderBy, 100);
		Customer c = new Customer();
		c.setCustomerName(customerName);
		order.setCustomer(c);
		logger.debug("Order object " + order);
		orderService.create(order);

		ResponseBuilder builder = Response.ok(order).status(201);
		Response res = builder.build();
		logger.debug("Response : " + res);
		return res;
	}

	@Override
	public Order updateExistingOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order deleteOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
