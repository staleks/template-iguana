package rs.in.staleks.template.iguana.domain;

import org.junit.jupiter.api.Test;

import rs.in.staleks.template.iguana.domain.management.Account;
import rs.in.staleks.template.iguana.domain.management.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {

    @Test
    void testConstructor() {
        Account testAccount = Account.create("Dummy Name");
        var testUser = User.of(1L, "username", "john.doe@test.com", testAccount);
        assertNotNull(testUser);
    }

    @Test
    void testGetId() {
        Account testAccount = Account.create("Dummy Name");
        var testUser = User.of(1L, "username", "john.doe@test.com", testAccount);
        assertNotNull(testUser.getId());
        assertEquals(1L, testUser.getId());
    }

    @Test
    void testGetUsername() {
        Account testAccount = Account.create("Dummy Name");
        var testUser = User.of(1L, "username", "john.doe@test.com", testAccount);
        assertNotNull(testUser.getUsername());
        assertEquals("username", testUser.getUsername());
    }

    @Test
    void testGetEmail() {
        Account testAccount = Account.create("Dummy Name");
        var testUser = User.of(1L, "username", "john.doe@test.com", testAccount);
        assertNotNull(testUser.getEmail());
        assertEquals("john.doe@test.com", testUser.getEmail());
    }

    @Test
    void testEquals() {
        Account testAccount = Account.create("Dummy Name");
        var testUser1 = User.of(1L, "username", "john.doe@test.com", testAccount);
        var testUser2 = User.of(1L, "username", "john.doe@test.com", testAccount);
        assertEquals(testUser1, testUser2);
    }

    @Test
    void testEquals_notEqual() {
        Account testAccount = Account.create("Dummy Name");
        var testUser1 = User.of(1L, "username", "john.doe@test.com", testAccount);
        var testUser2 = User.of(1L, "username", "jahne.doe@test.com", testAccount);
        assertNotEquals(testUser1, testUser2);
    }

}
