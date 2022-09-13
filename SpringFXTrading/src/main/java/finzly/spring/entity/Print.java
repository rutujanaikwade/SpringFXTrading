package finzly.spring.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "print" , catalog = "fxtrading")
public class Print {
	
    int tradeNo;
	String Name;
	String CurrencyPair;
	double Amount;    
	double Rate;

	@Id
	@Column
		public int getTradeNo() {
			return tradeNo;
		}

		public void setTradeNo(int tradeNo) {
			this.tradeNo = tradeNo;
		}

		@Column
		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		@Column
		public String getCurrencyPair() {
			return CurrencyPair;
		}

		public void setCurrencyPair(String currencyPair) {
			CurrencyPair = currencyPair;
		}

		@Column
		public double getAmount() {
			return Amount;
		}

		public void setAmount(double d) {
			Amount = d;
		}

		@Column
		public double getRate() {
			return Rate;
		}

		public void setRate(double iNR) {
			Rate = iNR;
		}

		@Override
		public String toString() {
			return "BookTrades [tradeNo=" + tradeNo + ", Name=" + Name + ", CurrencyPair=" + CurrencyPair + ", Amount="
					+ Amount + ", Rate=" + Rate + "]";
		
		}


	}

