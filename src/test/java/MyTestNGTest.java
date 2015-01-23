

import junit.framework.Assert;

import org.testng.annotations.Test;

public class MyTestNGTest {	
	@Test
	public void MyFirstTestNGTest() throws Exception{
		Assert.assertEquals(1, 1);
		System.out.println("My first test.");
	}
}