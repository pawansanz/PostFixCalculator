package com.bitwise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostfixApplicationTests{

	@Test (expected=NumberFormatException.class)
	public void checkForNull() throws Exception {
		
		int result=PostfixApplication.eval("1   +");
		
	}
	
	
	@Test
	public void checkAddition() throws Exception {
		
		int result=PostfixApplication.eval("1 2 +");
		assertEquals(3,result);
		
	}
	
	@Test
	public void checkSubstraction() throws Exception {
		
		int result=PostfixApplication.eval("3 2 -");
		assertEquals(1,result);
		
	}
	@Test
	public void checkMulti() throws Exception {
		
		int result=PostfixApplication.eval("2 2 *");
		assertEquals(4,result);
		
	}
	@Test
	public void checkDiv() throws Exception {
		
		int result=PostfixApplication.eval("4 2 /");
		assertEquals(2,result);
		
	}

}
