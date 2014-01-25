package in.mgp.rest.springmongo.repository.impl;

import in.mgp.rest.springmongo.domain.Order;
import in.mgp.rest.springmongo.repository.OrderRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
@Scope("singleton")
public class OrderRepoImpl implements OrderRepo {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public List<Order> findAllOrders() {
		// return mongoTemplate.find(
		// new Query(
		// Criteria.where("orderFor")
		// .is("Software")
		// .andOperator(
		// Criteria.where("customerName").regex(
		// "^[a-z]*"))), Order.class);

		return mongoTemplate.findAll(Order.class);

	}

	@Override
	public Order findById(String id) {

		return null;
	}

	@Override
	public Order findByName(String nameCriteria) {
		Order order = new Order();

		if (mongoTemplate.collectionExists(Order.class)) {

			order = mongoTemplate.findOne(new Query(Criteria.where("orderFor")
					.is(nameCriteria)), Order.class);

		}

		return order;

	}

	@Override
	public void create(Order order) {
		mongoTemplate.insert(order);
	}

	@Override
	public void create(List<Order> orders, Class clazz) {
		mongoTemplate.insert(orders, clazz);

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

		if (!mongoTemplate.collectionExists(Order.class)) {
			mongoTemplate.createCollection(Order.class);
		}
	}

	@Override
	public void dropOrderCollection() {

		if (mongoTemplate.collectionExists(Order.class)) {
			mongoTemplate.dropCollection(Order.class);
		}

	}

}
