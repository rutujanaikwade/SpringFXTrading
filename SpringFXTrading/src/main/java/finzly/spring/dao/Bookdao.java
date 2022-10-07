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
	

	public String bookedtrades(Book details) {
		
		final double rate = 66.00;

		 int count = 0;
		//currencyPair check
		if(details.getCurrencypair().equalsIgnoreCase("usdinr")) {
			//checking client want to get rate or not
			if(details.getrate().equalsIgnoreCase("yes") ) {
				//checking confirmation of client to book trade
				 if(details.getBookingConfirmation().equalsIgnoreCase("yes")) {
							count++;
		
							SessionFactory factory = Config.getSession();
							Session session = factory.openSession();
							Transaction tr = session.beginTransaction();
							Print data = new Print();
							data.setName(details.getName());
							data.setAmount(Conversion.USDTOINR(details.getAmount()));
							data.setCurrencypair(details.getCurrencypair());
							data.setrate(rate);
							data.setTradeno(count);
							session.save(data);
							tr.commit();
							session.close();
					
							return "Trade for USDINR has been booked with rate 66.00 , The amount of Rs " + data.getAmount() +" will  be transferred in 2 working days to " +details.getName(); 
					}
				 else if(details.getBookingConfirmation().equalsIgnoreCase("no"))
						return "booking cancelled";		
				 else
					 return "invalid input (bookingconfirmation) " + details.getBookingConfirmation() + " please give input as yes or no";
					
			}
			
			else if(details.getrate().equalsIgnoreCase("no"))  {
				if(details.getBookingConfirmation().equalsIgnoreCase("yes")) {
				
					SessionFactory factory = Config.getSession();
					Session session = factory.openSession();
					Transaction tr = session.beginTransaction();
					Print data = new Print();
					data.setName(details.getName());
					data.setAmount(Conversion.USDTOINR(details.getAmount()));
					data.setCurrencypair(details.getCurrencypair());
					data.setrate(rate);
					data.setTradeno(count);
					session.save(data);
					tr.commit();
					session.close();
			

				return "Trade for USDINR has been booked with rate 66.00 , The amount of Rs " + data.getAmount() +" will  be transferred in 2 working days to " +data.getName(); 
				}
				else if(details.getBookingConfirmation().equalsIgnoreCase("no"))
						return "booking cancelled";		
				else
						return "invalid input (bookingconfirmation) " + details.getBookingConfirmation() + " please give input as yes or no";
			}	
			else
				return "invalid choice " + details.getrate() + " plese enter yes or no";
				
			}
			else 
				return "invalid input "+ details.getCurrencypair() + " only usdinr is allowed";
	}

			
		public List<Print> printtrades() {
		SessionFactory factory = Config.getSession();
		Session session =factory.openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Print.class);
		List<Print> trades = criteria.list();
		return trades;
	}
	
	
}

