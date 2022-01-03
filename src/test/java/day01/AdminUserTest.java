package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    User adminUser = new AdminUser("jd@email.com", "password");

    @Test
    void getUserEmailTest() {
        assertEquals("jd@email.com", adminUser.getUserEmail());
    }

    @Test
    void getPasswordTest() {
        assertEquals("********", adminUser.getPassword());
    }
}