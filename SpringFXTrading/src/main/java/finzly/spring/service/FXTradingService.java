package finzly.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finzly.spring.dao.Bookdao;
import finzly.spring.dao.Printdao;
import finzly.spring.entity.Book;
import finzly.spring.entity.Print;

@Service
public class FXTradingService {
	@Autowired
	Bookdao B;
	
	@Autowired
	Printdao P;
	
	public String bookTrade(Book details) {
		return B.bookTrade(details);
		
	}

	public ArrayList<Print> printtrade() {
		ArrayList<Print> list =P.printtrade();
		return list;
	}


}
