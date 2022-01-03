package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    User normalUser = new NormalUser("jd@email.com", "password");

    @Test
    void getUserEmailTest() {
        assertEquals("jd@email.com", normalUser.getUserEmail());
    }

    @Test
    void getPasswordTest() {
        assertEquals("password", normalUser.getPassword());
    }
}