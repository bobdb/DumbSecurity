package net.bobdb.ReallyDumbSecurity;

import org.apache.el.parser.Token;
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
