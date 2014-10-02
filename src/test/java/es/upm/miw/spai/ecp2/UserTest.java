package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    
    private User user;
    
    @Before
    public void before() {
        user = new User(1, "Carlos", "Palacios");
    }   

    @Test
    public void testUser() {
       assertEquals(1, user.getNumber());
       assertEquals("Carlos", user.getName());
       assertEquals("Palacios", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Carlos Palacios", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("C.", user.initials());
    }
    
}
