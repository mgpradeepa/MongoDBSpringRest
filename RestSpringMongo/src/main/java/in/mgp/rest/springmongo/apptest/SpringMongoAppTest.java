package in.mgp.rest.springmongo.apptest;

import in.mgp.rest.springmongo.domain.Customer;
import in.mgp.rest.springmongo.domain.Order;
import in.mgp.rest.springmongo.service.OrderService;
import in.mgp.rest.springmongo.service.impl.OrderServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMongoAppTest {
	public static Integer randomInteger = 0;
	static final Logger logger = LoggerFactory
			.getLogger(SpringMongoAppTest.class);

	public static void main(String[] args) {
		logger.info("Bootstrapping Rest-Spring-Mongo application");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		OrderService orderService = context.getBean(OrderServiceImpl.class);
		Order order = null;

		// cleanup order collection before insertion
		orderService.dropOrderCollection();

		// create order collection
		orderService.createOrderCollection();

		List<Order> batchOrders = new ArrayList<Order>();
		for (int i = 0; i < 10000; i++) {
			randomInteger = (int) Math.random() * 125 + i;
			order = new Order(randomInteger, "OrderFor_Type " + randomInteger,
					"OrderBY_Data " + randomInteger, 100, new Customer(
							randomInteger * 2, "Namaha " + randomInteger * 2,
							"Namaha " + randomInteger * 3 + " @adaha.com",
							new Date()));
			batchOrders.add(order);
		}

		List<Order> orderResults = orderService.findAllOrders();
		for (Order ordere : orderResults) {
			List<Order> details = orderService.findByName(ordere.getCustomer()
					.getCustomerEmailId());
			for (Order detailOrder : details) {
				Order subOrder = (Order) orderService.findByName(detailOrder

				.getOrderFor());
				subOrder.getOrderBy();
			}
		}

		OrderServiceImpl impl = context.getBean(OrderServiceImpl.class);
		// impl.create(new Order(007, "Camera", "online", 12));
		// impl.create(batchOrders);
		logger.info("Order created");
		logger.info("Finished MongoDemo application");

	}
}
