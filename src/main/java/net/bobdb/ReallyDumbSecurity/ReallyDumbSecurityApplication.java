package net.bobdb.ReallyDumbSecurity;

import net.bobdb.ReallyDumbSecurity.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReallyDumbSecurityApplication {

	@Autowired
	static TokenService tokenService;

	public static void main(String[] args) {
		SpringApplication.run(ReallyDumbSecurityApplication.class, args);
	}

}
