package exceptionClasses;

public class ProductNameException extends RuntimeException {
	public ProductNameException(String s) {
		System.err.println("Product Name Should be Greater Than 5 Char");
		
	}
}
