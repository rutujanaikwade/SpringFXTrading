package finzly.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import finzly.spring.dao.Bookdao;

import finzly.spring.entity.Book;
import finzly.spring.entity.Print;

@Service
public class FXTradingService {
	@Autowired
	Bookdao dao;
	
	public String booktrades(Book cd) {
		
		String msg =dao.bookedtrades(cd);
		return msg;
	}
	
	

	public List<Print> printtrade() {
		List<Print> list = dao.printtrades();
		return list;
	}
}
