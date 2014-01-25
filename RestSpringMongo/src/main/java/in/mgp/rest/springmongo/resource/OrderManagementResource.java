package in.mgp.rest.springmongo.resource;

import in.mgp.rest.springmongo.domain.Order;

import java.util.List;

import javax.ws.rs.core.Response;

public interface OrderManagementResource {
	public List<Order> findAllOrders();

	public List<Order> findByOrders(String query);

	public Response createNewOrder(String orderId, String orderFor,
			String orderBy, String customerName);

	public Order updateExistingOrder(Order order);

	public Order deleteOrder(Order order);
}
