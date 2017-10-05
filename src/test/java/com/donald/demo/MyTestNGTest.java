package com.donald.demo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTestNGTest {	
	@Test
	public void MyFirstTestNGTest() throws Exception{
		Assert.assertEquals(1, 1);
		System.out.println("My first test.");
	}
}