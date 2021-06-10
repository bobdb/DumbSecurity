package net.bobdb.ReallyDumbSecurity.services;

import net.bobdb.ReallyDumbSecurity.entities.DumbToken;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TokenService {
    private Map<String, DumbToken> map = new HashMap<>();

    public TokenService() {
        addToken("sadf","asdf");
    }

    public boolean isOk(DumbToken token) {
        return true; //TODO
    }
    public void addToken(String key, String value) {
        map.put(key,new DumbToken(value));
    }

    public DumbToken getToken(String apiKey, String accountId) {
        return map.getOrDefault(apiKey+accountId,null);
    }
}
