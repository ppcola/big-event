package com.example.bigevent;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xi
 * @create 2024/3/4 21:13
 */
public class JwtTest {

    //TODO 拦截器统一验证
    @Test
    public void testGen() {
        Map<String,Object> claims = new HashMap<>();
        claims.put("id",1);
        claims.put("username","张三");
        //生成jwt代码
        String token =JWT.create()
                .withClaim("user",claims)
                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60*60*12))//添加过期时间(1000是1秒;60是一分钟;60是1h;12h)
                .sign(Algorithm.HMAC256("itheima"));//指定算法,配置密钥

        System.out.println(token);
    }
    @Test
    public void testParse(){
        //模拟传过来的token
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE3MDk2MDcwMjEsInVzZXIiOnsiaWQiOjEsInVzZXJuYW1lIjoi5byg5LiJIn19.yAvdY8s6JBEV5SXXGddZqWF3DEfUecknllazg7pfUyY";
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("itheima")).build();

        DecodedJWT decodedJWT = jwtVerifier.verify(token);//验证token生成解析后的JWT对象
        Map<String, Claim> claims = decodedJWT.getClaims();
        System.out.println(claims.get("user"));
    }
}
