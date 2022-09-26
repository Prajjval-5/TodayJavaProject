package com.springboot.project.assignment.order;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {


	// data-members / variables/fields/data
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="order_Name")
	private String orderName;
	@Column(name="order_date")
	private String date;
	@Column(name="order_TransactionId")
	private long orderTransactionId;
	
	// para constructor
	public Order(long id, String orderName, String date, long orderTransactionId) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.date = date;
		this.orderTransactionId = orderTransactionId;
	}

	// default constructor
	public Order() {
		super();
	}

	public long getOrderId() {
		return id;
	}

	public void setOrderId(int id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getOrderTransactionId() {
		return orderTransactionId;
	}

	public void setOrderTransactionId(long orderTransactionId) {
		this.orderTransactionId = orderTransactionId;
	}	
}
