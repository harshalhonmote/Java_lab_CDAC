package assignment;

public class Book {
    private  String isbn;
    private double price;
    private String aName;
    private int qty;
    
    public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String isbn, double price, String aName, int qty) {
		this.isbn = isbn;
		this.price = price;
		this.aName = aName;
		this.qty = qty;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", aName=" + aName + ", qty=" + qty + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Book b = (Book)obj;
		return this.getIsbn().equals(b.getIsbn());
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
    
}
