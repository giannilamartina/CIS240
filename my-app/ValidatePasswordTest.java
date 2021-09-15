package com.mycompany.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidatePasswordTest {
	@Test
    public void shouldBeEqualto8True()
    {
		ValidatePassword validatePassword = new ValidatePassword();
        assertTrue( validatePassword.isValidPassword("12345678") );
    }
	
	@Test
	public void shouldBeGreaterto8True()
    {
		ValidatePassword validatePassword = new ValidatePassword();
        assertTrue( validatePassword.isValidPassword("123456789") );
    }
	
	@Test
	public void shouldBeLessThan8True()
    {
		ValidatePassword validatePassword = new ValidatePassword();
        assertFalse( validatePassword.isValidPassword("1234567") );
    }
	
	@Test
	public void shouldHaveAtLeastTwoDigitsTrue()
    {
		ValidatePassword validatePassword = new ValidatePassword();
        assertTrue( validatePassword.isValidPassword("12345678") );
    }
	
	@Test
	public void shouldHaveTwoDigitsTrue()
    {
		ValidatePassword validatePassword = new ValidatePassword();
        assertTrue( validatePassword.isValidPassword("12asdfkj") );
    }
	
	@Test
	public void shouldHaveLessThanTwoDigitsFalse()
    {
		ValidatePassword validatePassword = new ValidatePassword();
        assertFalse( validatePassword.isValidPassword("asdfghjkl") );
    }
}
