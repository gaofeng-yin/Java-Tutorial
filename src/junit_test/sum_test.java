package junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sum_test {

	@Test
	void test() {
		Unit_test a = new Unit_test();
		int output = a.sum(2, 2);
		
		assertEquals(4, output);
	}

}
