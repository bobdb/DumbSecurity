package net.bobdb.ReallyDumbSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    public TokenService tokenService;

    @PostMapping("/auth")
    public DumbToken getAuthToken(@RequestBody Account account, @RequestHeader("Api-Key") String apiKey) {
        return tokenService.getToken(apiKey,  account.getAccount());
    }

}
