package in.mgp.rest.springmongo.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@XmlRootElement
public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7979774316381202417L;
	@Id
	private int orderId;
	private String orderFor;
	private String orderBy;
	private int inventory;
	@Persistent
	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Order() {
		super();
	}

	public Order(int orderId, String orderFor, String orderBy, int inventory) {
		super();
		this.orderId = orderId;
		this.orderFor = orderFor;
		this.orderBy = orderBy;
		inventory = inventory;
	}

	public Order(int orderId, String orderFor, String orderBy) {
		super();
		this.orderId = orderId;
		this.orderFor = orderFor;
		this.orderBy = orderBy;
	}

	public Order(int orderId, String orderFor, String orderBy, int iinventory,
			Customer customer) {
		super();
		this.orderId = orderId;
		this.orderFor = orderFor;
		this.orderBy = orderBy;
		inventory = iinventory;
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderFor() {
		return orderFor;
	}

	public void setOrderFor(String orderFor) {
		this.orderFor = orderFor;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public int getIinventory() {
		return inventory;
	}

	public void setIinventory(int iinventory) {
		inventory = iinventory;

	}
}
