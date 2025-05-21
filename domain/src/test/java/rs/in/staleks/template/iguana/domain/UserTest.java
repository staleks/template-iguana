package rs.in.staleks.template.iguana.domain;

import org.junit.jupiter.api.Test;
import rs.in.staleks.template.iguana.domain.management.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {

    @Test
    void testConstructor() {
        var user = User.of(1L, "username", "john.doe@test.com");
        assertNotNull(user);
    }

    @Test
    void testGetId() {
        var user = User.of(1L, "username", "john.doe@test.com");
        assertNotNull(user.getId());
        assertEquals(1L, user.getId());
    }

    @Test
    void testGetUsername() {
        var user = User.of(1L, "username", "john.doe@test.com");
        assertNotNull(user.getUsername());
        assertEquals("username", user.getUsername());
    }

    @Test
    void testGetEmail() {
        var user = User.of(1L, "username", "john.doe@test.com");
        assertNotNull(user.getEmail());
        assertEquals("john.doe@test.com", user.getEmail());
    }

    @Test
    void testHashCode() {
        var user = User.of(1L, "username", "john.doe@test.com");
        assertEquals(1909437560, user.hashCode());
    }

    @Test
    void testEquals() {
        var user = User.of(1L, "username", "john.doe@test.com");
        var user2 = User.of(1L, "username", "john.doe@test.com");
        assertEquals(user, user2);
    }

    @Test
    void testEquals_notEqual() {
        var user = User.of(1L, "username", "jahne.doe@test.com");
        var user2 = User.of(1L, "username", "john.doe@test.com");
        assertNotEquals(user, user2);
    }

}
