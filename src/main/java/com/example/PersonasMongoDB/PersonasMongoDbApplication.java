package com.example.PersonasMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("src/main/java/com/PersonasMongoDB")
public class PersonasMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonasMongoDbApplication.class, args);
	}

}
