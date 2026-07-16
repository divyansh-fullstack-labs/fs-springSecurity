package com.divyansh.fullstacklabs.springSecurityApplication;

import com.divyansh.fullstacklabs.springSecurityApplication.entities.User;
import com.divyansh.fullstacklabs.springSecurityApplication.services.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSecurityApplicationTests {

    @Autowired
    private JwtService jwtService;

	@Test
	void contextLoads() {
//        User user = new User(1L,"div@gmail.com","1234");
//
//        String token = jwtService.generateJwtToken(user);
//
//        System.out.println(token);
//
//        Long id = jwtService.getUserIdFromJwtToken(token);
//        System.out.println(id);
	}

}
