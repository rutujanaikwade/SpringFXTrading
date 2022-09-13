package finzly.spring.entity;

public class Book {

	int tradeNo;
	String Name;
	String CurrencyPair;
	String Amount;    
	String Rate;
	String BookingConformation ;
	
	
	
	public String getBookingConformation() {
		return BookingConformation;
	}

	public void setBookingConformation(String bookingConformation) {
		BookingConformation = bookingConformation;
	}

	public int getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(int tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCurrencyPair() {
		return CurrencyPair;
	}

	public void setCurrencyPair(String currencyPair) {
		CurrencyPair = currencyPair;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public String getRate() {
		return Rate;
	}

	public void setRate(String rate) {
		Rate = rate;
	}
}
