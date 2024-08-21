package java8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {
	
	Customer c=new Customer();

	@Test
	void test() {
		assertEquals(c.withdraw(),1000);
//		fail("Not yet implemented");
	}

}
