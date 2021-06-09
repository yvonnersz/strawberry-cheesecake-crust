package com.galvanize.useraccounts;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateUserRequestTest {
    @MockBean
    UpdateUserRequest updateUserRequest;

    @Test
    void setMethods_work (){
        UpdateUserRequest updateUserRequest = new UpdateUserRequest("Bob", "baker", "password123", "bobbaker@gmail.com", "11123 Bob Street", "ajdsfkl12312", true);

        updateUserRequest.setFirstName("Sally");
        updateUserRequest.setLastName("Smith");
        updateUserRequest.setPassword("121password");
        updateUserRequest.setEmail("ajskfdl@gmail.com");
        updateUserRequest.setCreditCard("asdfjk12123");
        updateUserRequest.setVerify(false);

        assertEquals("Sally", updateUserRequest.getFirstName());
        assertEquals("Smith", updateUserRequest.getLastName());

    }
}
