package finzly.spring.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import finzly.spring.entity.Print;

@Repository
public class Printdao {
	static ArrayList<Print> bookedlist = new ArrayList<>();
	static void add(int tradeNo, String Name, String CurrencyPair, double Amount, double rate)
	{
		bookedlist.add(new  Print());
		
	}
	
	public  ArrayList<Print> printtrade() {
		return bookedlist;
		}


}
