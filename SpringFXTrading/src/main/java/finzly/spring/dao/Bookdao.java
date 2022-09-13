package finzly.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import finzly.spring.entity.Book;
import finzly.spring.entity.Print;
import finzly.spring.hibernateconfig.Config;

@Repository
public class Bookdao {
	
static int count =0;
	
	public static double Conversion(String string) {
		final double INR = 66.00;
		double USDINR;
		double Amount = 0;
		USDINR = INR * Amount;
		return USDINR;
	}

	public String bookTrade(Book book) {
		final double INR = 66.00;
		
		if(book.getCurrencyPair().equalsIgnoreCase("usdinr")) {
			//checking client want to get rate or not
			if(book.getRate().equalsIgnoreCase("yes") ) {
				//checking confirmation of client to book trade
				 if(book.getBookingConformation().equalsIgnoreCase("yes")) {
							count++;
							
							SessionFactory factory = Config.getSession();
					        Session session=factory.openSession();
							Transaction transaction = session.beginTransaction();
							Print data = new Print();
							data.setName(book.getName());
							data.setAmount(Bookdao.Conversion(book.getAmount()));
							data.setCurrencyPair(book.getCurrencyPair());
							data.setRate(INR);
							data.setTradeNo(count);
							session.save(data);
							transaction.commit();
							session.close();
							return "Trade for USDINR has been booked with rate 66.00 , The amount of Rs " + data.getAmount() +" will  be transferred in 2 working days to " +book.getName(); 
					}
				 else if(book.getBookingConformation().equalsIgnoreCase("no"))
						return "booking cancelled";		
				 else
					 return "invalid input (bookingconfirmation) " + book.getBookingConformation() + " please give input as yes or no";
					
			}
			
			else if(book.getRate().equalsIgnoreCase("no"))  {
				if(book.getBookingConformation().equalsIgnoreCase("yes")) {
				
					SessionFactory factory =  Config.getSession();
					Session session = factory.openSession();
					Transaction tr = session.beginTransaction();
					Print data = new Print();
					data.setName(book.getName());
					data.setAmount(Bookdao.Conversion(book.getAmount()));
					data.setCurrencyPair(book.getCurrencyPair());
					data.setRate(INR);
					data.setTradeNo(count);
					session.save(data);
					tr.commit();
					session.close();
			

				return "Trade for USDINR has been booked with rate 66.00 , The amount of Rs " + data.getAmount() +" will  be transferred in 2 working days to " +data.getName(); 
				}
				else if(book.getBookingConformation().equalsIgnoreCase("no"))
						return "booking cancelled";		
				else
						return "invalid input (bookingconfirmation) " + book.getBookingConformation() + " please give input as yes or no";
			}	
			else
				return "invalid choice " + book.getRate() + " plese enter yes or no";
				
			}
			else 
				return "invalid input "+ book.getCurrencyPair() + " only usdinr is allowed";
	}

			
		public List<Print> printTrades() {
		SessionFactory factory = Config.getSession();
		Session session =factory.openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Print.class);
		List<Print> trades = criteria.list();
		return trades;
	}

	
	
}

