import java.util.ArrayList;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

class ImpactTest {
ImpactDem impactDem;


Object WrongResults= IntStream.of(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
Object[] ExpectedResults = {1, 3, 6-8, 12-15, 21-24, 31};

	@BeforeEach
	 void setUp()  {
		impactDem = new ImpactDem();
	}

	@Test
	
	void testResults() {
		// Assertions.assertNotNull(impactDem.result);
		 Assertions.assertEquals(impactDem.result, ExpectedResults);
	}
	
	
}