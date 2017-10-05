package com.donald.demo;



import org.junit.Test;

import junit.framework.Assert;

public class MyJUnitTest {	
	@Test
	public void MyFirstJunitTest() throws Exception{
		Assert.assertEquals(1, 1);
		System.out.println("My first test.");
	}
}