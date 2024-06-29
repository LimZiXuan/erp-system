package dev.erp_system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpSystemApplication {
	private static final Logger log = LoggerFactory.getLogger(ErpSystemApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ErpSystemApplication.class, args);

		log.info("Someething changes");
		
	}

}
