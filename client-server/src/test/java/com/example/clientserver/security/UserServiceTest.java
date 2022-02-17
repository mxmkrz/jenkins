package com.example.clientserver.security;

import com.example.clientserver.entity.User;
import com.example.clientserver.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {
    @Mock
    private UserServiceImpl userService;


    @Test
    public void registrationUser() {
        User user = new User();
        user.setId(1L);
        user.setName("user");
        user.setPassword("qwerty123");
        user.setEmail("user@mail.ru");


//        when(user)


    }


}
