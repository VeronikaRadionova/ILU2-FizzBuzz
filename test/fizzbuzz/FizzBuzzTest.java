package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void fizz_un() {
	}
	
	@Test
	void fizz_deux() {
		assertEquals(FizzBuzz.fizzbuzz(2), "2");
	}

}
