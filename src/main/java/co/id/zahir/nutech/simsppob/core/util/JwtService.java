package co.id.zahir.nutech.simsppob.core.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;

@Service
@AllArgsConstructor
public class JwtService {
    private final Environment env;

    private Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(env.getProperty("spring.jwt.key"));
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public String generateToken(String email) {
        String getExpMillis = env.getProperty("spring.jwt.expired.millis");
        int expiredMillis = Integer.parseInt(getExpMillis != null ? getExpMillis : "0");
        return Jwts
                .builder()
                .setClaims(new HashMap<>())
                .setSubject(email)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiredMillis))
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public String isTokenValid(String token,String email) {


        return null;
    }
}
