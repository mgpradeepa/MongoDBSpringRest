package in.mgp.rest.springmongo.repository;

import in.mgp.rest.springmongo.domain.Order;

import java.util.List;

public interface OrderRepo {
	public List<Order> findAllOrders();

	public Order findById(String id);

	Order findByName(String nameCriteria);

	public void create(Order order);

	public void create(List<Order> orders, Class clazz);

	public void update(Order order);

	public void delete(Order order);

	public void createOrderCollection();

	public void dropOrderCollection();
}
