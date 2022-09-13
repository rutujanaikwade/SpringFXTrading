package finzly.spring.hibernateconfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import finzly.spring.entity.Print;

public class Config {
	
	public static  SessionFactory getSession() {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Print.class);
			SessionFactory sf = cfg.buildSessionFactory();
			return sf;
		}


}
