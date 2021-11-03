import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IPvalidatorTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void ShouldReturnFalse_GivebEmptyStringParameter() {
		IPvalidator validator = new IPvalidator();
		assertTrue(validator.ValidateIp4Address(""));
	}
	
	@Test
	void ShouldBe_True_GivenStringWithThreeDots() {
		IPvalidator validator = new IPvalidator();
		assertTrue(validator.ValidateIp4Address("1.2.3.1"));
	}
	@Test
	void ShouldReturnFourNumbersGivenStringWithThreeDots() {
		IPvalidator validator = new IPvalidator();
		int[] expected = {1,2,3,4};
		assertArrayEquals(expected,validator.getNumbers("1.2.3.4"));
	}
	@Test
	void ShouldBe_False_GivenIpstartingwithzero() {
		IPvalidator validator = new IPvalidator();
		assertFalse(validator.ValidateIp4Address("0.2.3.4"));
	}
	@Test
	void ShouldBe_False_GivenStringWithFourNumbersNotInRange0_255(){
		IPvalidator validator = new IPvalidator();
		assertFalse(validator.ValidateIp4Address("1.2.3.257"));
		assertFalse(validator.ValidateIp4Address("1.2.300.4"));
		assertFalse(validator.ValidateIp4Address("1.256.3.4"));
		assertFalse(validator.ValidateIp4Address("312.2.3.4"));
	}
	@Test
	void ShouldBe_False_GivenIPendingWith255() {

		IPvalidator validator= new IPvalidator();
		assertFalse(validator.ValidateIp4Address("1.2.3.255"));
	}
	@Test
	void ShouldBe_False_GivenIPendingWithZero() {

		IPvalidator validator= new IPvalidator();
		assertTrue(validator.ValidateIp4Address("1.2.3.0"));
}
