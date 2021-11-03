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
}
