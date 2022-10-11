package finzly.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import finzly.spring.entity.Book;
import finzly.spring.entity.Print;
import finzly.spring.service.FXTradingService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/FXTrading")
public class Springcontroller {
	
		@Autowired
		FXTradingService	services ;
		
		@PostMapping("booktrade")
		public String boketrade(@RequestBody Book data) {

			String msg = services.booktrades(data);
			return msg;
		}	
		
		@GetMapping("printtrade")
		public List<Print> printtrade() {
			List<Print> list =	services.printtrade();
			return list;
		}
		static void comfirmation() {
			
		} 

}
