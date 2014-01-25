package in.mgp.rest.springmongo.service.impl;

import in.mgp.rest.springmongo.domain.Order;
import in.mgp.rest.springmongo.repository.OrderRepo;
import in.mgp.rest.springmongo.service.OrderService;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class OrderServiceImpl implements OrderService {
	static final Logger logger = LoggerFactory
			.getLogger(OrderServiceImpl.class);
	@Autowired
	OrderRepo orderRepo;

	@Override
	public List<Order> findAllOrders() {
		return orderRepo.findAllOrders();
	}

	@Override
	public List<Order> findByName(String query) {
		logger.debug("Query String : " + query);

		List<Order> list = new ArrayList<Order>();

		list.add(orderRepo.findByName(query));
		logger.debug("result list : " + list);
		return list;
	}

	@Override
	public Order findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Order order) {
		logger.info("Creating Order" + order);
		orderRepo.create(order);
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createOrderCollection() {
		orderRepo.createOrderCollection();

	}

	@Override
	public void dropOrderCollection() {
		orderRepo.dropOrderCollection();
	}

	@Override
	public void create(List<Order> orders) {

		orderRepo.create(orders, Order.class);
	}
}
