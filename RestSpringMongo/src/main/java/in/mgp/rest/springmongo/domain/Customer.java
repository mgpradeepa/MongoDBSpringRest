package in.mgp.rest.springmongo.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Indexed
	private int customerId;

	private String customerName;
	private String customerEmailId;
	private Date dob;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName,
			String customerEmailId, Date dob) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.dob = dob;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
