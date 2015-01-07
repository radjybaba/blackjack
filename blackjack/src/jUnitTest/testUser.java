package jUnitTest;

import static org.junit.Assert.*;
import model.User;

import org.junit.Test;

public class testUser {

	@Test
	public void testSignUp() {
		
		// the user a already in the data base
		User usr = new User("a","a");
		boolean flag = (boolean) User.signUp(usr);
		
		assertEquals(flag, false);
	}
	/*
	@Test
	public void testSignUp1() {
		
		// the user x is not in the data base
		User usr = new User("x","x");
		boolean flag = (boolean) User.signUp(usr);
		
		assertEquals(flag, true);
	}
*/
	@Test
	public void testLogin() {
		User usr = User.login("a", "a");
		
		assertNotNull("not null", usr);
	}

}
