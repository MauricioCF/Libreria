package com.example.libreria;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@PropertySource("classpath:libreria.properties")
public class LibreriaApplication {

	private static final Logger LOG = LogManager.getLogger(LibreriaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}

	@EventListener
    public void handleEvent(ApplicationReadyEvent event) {
        
        LOG.info("iniciando...");
}

}
