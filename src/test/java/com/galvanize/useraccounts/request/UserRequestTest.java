package com.galvanize.useraccounts.request;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRequestTest {
    @MockBean
    UserRequest userRequest;

    @Test
    void setMethods_work (){
        UserRequest userRequest = new UserRequest("Bob", "baker", "password123", "bobbaker@gmail.com",  "ajdsfkl12312", true);

        userRequest.setFirstName("Sally");
        userRequest.setLastName("Smith");
        userRequest.setPassword("121password");
        userRequest.setEmail("ajskfdl@gmail.com");
        userRequest.setCreditCard("asdfjk12123");
        userRequest.setVerify(false);

        assertEquals("Sally", userRequest.getFirstName());
        assertEquals("Smith", userRequest.getLastName());
        assertEquals("121password", userRequest.getPassword());
        assertEquals("ajskfdl@gmail.com", userRequest.getEmail());
        assertEquals("asdfjk12123", userRequest.getCreditCard());
        assertEquals(false, userRequest.isVerify());


    }
}