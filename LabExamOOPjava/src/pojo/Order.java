package pojo;

import java.time.LocalDate;

public class Order {
	private int id;
	private int quantity;
	private String status;
	private LocalDate date;
	private int productId;
	private int customerId;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, int quantity, String status, LocalDate date, int productId, int customerId) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.status = status;
		this.date = date;
		this.productId = productId;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", quantity=" + quantity + ", status=" + status + ", date=" + date + ", productId="
				+ productId + ", customerId=" + customerId + "]";
	}
	
	
}
