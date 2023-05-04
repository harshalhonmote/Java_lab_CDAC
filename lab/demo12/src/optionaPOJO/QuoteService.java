package optionaPOJO;

import java.util.ArrayList;
import java.util.List;

public class QuoteService {
    QuoteDao qd = new QuoteDao();
	
	public void displayUserQuotes() {
		// input user id
		List<Quote>temp = new ArrayList<>();
		temp = qd.findByUserId(UserService.current.getId());
        temp.forEach((e)-> System.out.println(e));
        
	}

	public void displayAllQuotes() {
		List<Quote>temp = new ArrayList<>();
		temp = qd.findAll();
        temp.forEach((e)-> System.out.println(e));
	}

	public void addNewQuote() {
		// call acceptNewQuote() to get new quote and then use QuoteDao to add it
	}

	public void editQuote() {
		// call acceptModifiedQuote() to get new quote and then use QuoteDao to update
		// it
	}

	public void deleteQuote() {
		// input quote id and then delete quote by id
	}

	public void acceptModifiedQuote(Quote quote) {
	}

	public void acceptNewQuote(Quote quote) {
	}
}
