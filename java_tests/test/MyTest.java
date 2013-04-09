package test;

import org.junit.Test;

import junit.framework.Assert;

public class MyTest {	
	@Test
	public void MyFirstTest() throws Exception{
		Assert.assertEquals(1, 1);
		System.out.println("My first test.");
	}
}