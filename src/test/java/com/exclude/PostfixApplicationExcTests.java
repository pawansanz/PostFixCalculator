package com.exclude;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bitwise.PostfixApplication;

public class PostfixApplicationExcTests {

	@Test
	public void checkDiv() throws Exception {
		
		int result=PostfixApplication.eval("8 2 /");
		assertEquals(1,result);
		
	}

}
