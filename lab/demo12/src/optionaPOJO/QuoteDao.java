package optionaPOJO;

import java.util.ArrayList;
import java.util.List;

public class QuoteDao {

	
	public Quote findById(int quoteId) {
	    return null;
	}
	
	public List<Quote> findByUserId(int userId) {
		List<Quote>temp = new ArrayList<>();
		for(Quote q :Dbutil.qlist) {
			if(q.getUserId() == userId) {
				temp.add(q);
			}
		}
	   return temp;
	}
	
	public List<Quote> findAll() {
		List<Quote>temp = new ArrayList<>();
		for(Quote q :Dbutil.qlist) {
				temp.add(q);
		}
	   return temp;
	  
	}
	
	public void addQuote(Quote q) {
	
	}
	
	public void updateQuote(Quote q) {
	// replace new quote on index of quote of given id (q.id)
	
	}
}
