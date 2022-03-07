package devops.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingClass {

	@Test
	public void test() {
		TestClass object = new TestClass();
		
		assertEquals(15,object.sum(15, 0));
		
	}

}
