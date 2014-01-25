package in.mgp.rest.springmongo.service;

import in.mgp.rest.springmongo.domain.Order;

import java.util.List;

public interface OrderService {
	public List<Order> findAllOrders();

	public List<Order> findByName(String query);

	public Order findById(String id);

	public void create(Order order);

	public void create(List<Order> orders);

	public void update(Order order);

	public void delete(Order order);

	public void createOrderCollection();

	public void dropOrderCollection();
}
