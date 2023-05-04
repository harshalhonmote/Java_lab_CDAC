package pojo;

import oop.Category;

public class Product {
    private int id;
    private String name;
    private Category category;
    private double price;
    private boolean instock;
    
    public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, Category category, double price, boolean instock) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.instock = instock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getInstock() {
		return instock;
	}

	public void setInstock(boolean instock) {
		this.instock = instock;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", instock="
				+ instock + "]";
	}
    
}
