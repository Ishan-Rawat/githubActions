package devops.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tester2 {

	@Test
	public void test() {
		lab2_P2 object2= new lab2_P2();
		assertEquals(345,object2.number_reverser(543));
	}

}
