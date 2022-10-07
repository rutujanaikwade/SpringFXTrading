package finzly.spring.springfxtrading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("finzly.spring.dao")
@ComponentScan("finzly.spring.controller")
@ComponentScan("finzly.spring.service")
public class SpringFxTradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFxTradingApplication.class, args);
	}

}
