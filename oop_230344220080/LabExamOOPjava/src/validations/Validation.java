package validations;

import exceptionClasses.NegativePriceException;
import exceptionClasses.ProductCategoryException;
import exceptionClasses.ProductNameException;
import oop.Category;

public class Validation {
    
	public static boolean productCategory(Category category ) {
		Category arr[] =  Category.values();
		int flag=0;
		for(Category c : arr) {
			if(category.toString().equals(c.toString()))flag = 1;
		}
		if(flag != 1)throw new ProductCategoryException();
			
		return true;	
	}
	public static boolean productName(String name) {
		if(name.length()<5) {
			throw new ProductNameException("aa");
		}
		else {
			return true;
		}
	}
    public static boolean priceNegative(double price) {
    	if(price < 0) {
    		throw new NegativePriceException();
    	}
    	else return true;
    }
}
