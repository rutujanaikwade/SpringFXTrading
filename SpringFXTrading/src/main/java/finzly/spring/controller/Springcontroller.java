package finzly.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import finzly.spring.entity.Book;
import finzly.spring.entity.Print;
import finzly.spring.service.FXTradingService;

@RestController
@RequestMapping("FXTrading")
public class Springcontroller {
	@Autowired
		FXTradingService fs;
		
		@PostMapping("booktrade")
		public String bookTrade(@RequestBody  Book details ) {
		
		return fs.bookTrade(details);
		}
		
		
		@GetMapping("Printtrade")
		public ArrayList<Print> Printtrade(){	
			ArrayList<Print>list = fs.printtrade();
		 return list;
		}

}
