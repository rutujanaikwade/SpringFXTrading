package finzly.spring.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "print" , catalog = "fxtrading")
public class Print {
	
	private String name;
	int tradeno=0;
	private String currencypair;
	private double amount;
	private double rate;
	
	@Id
	@Column
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column
	public int getTradeno() {
		return tradeno;
	}
	public void setTradeno(int tradeno) {
		this.tradeno = tradeno;
	}
	
	
	@Column
	public String getCurrencypair() {
		return currencypair;
	}
	public void setCurrencypair(String currencypair) {
		this.currencypair = currencypair;
	}
	
	@Column
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Column
	public double getrate() {
		return rate;
	}
	public void setrate(double rate) {
		this.rate = rate;
	}
	


	}

