package org.petgo.jingyuan.petgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.petgo.jingyuan.petgo")
public class PetgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetgoApplication.class, args);
	}

}
