package optionaPOJO;

public class Quote {
    private int id;
    private String author;
    private String quote;
    private int userId;
    private static int idNo;
    
    static {
    	idNo=0;
    }
    public Quote() {
		this.id=++idNo;
	}
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", author=" + author + ", quote=" + quote + ", userId=" + userId + "]";
	}
    
    
}
