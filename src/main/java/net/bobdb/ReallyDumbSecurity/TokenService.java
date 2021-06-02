package net.bobdb.ReallyDumbSecurity;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TokenService {
    private Map<String,DumbToken> map = new HashMap<>();

    public TokenService() {
        map.put("abc12331415",new DumbToken("MYTOKEN!@#"));
    }

    public DumbToken getToken(String apiKey, String accountId) {
        return map.getOrDefault(apiKey+accountId,null);
    }
}
