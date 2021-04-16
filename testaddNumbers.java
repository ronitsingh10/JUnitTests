package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddNumbers {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(200, 100);
		assertEquals(300, result);


	}

}
