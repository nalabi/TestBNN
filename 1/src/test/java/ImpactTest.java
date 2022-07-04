import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ImpactTest {
ImpactDem impactDem;


Object WrongResults= IntStream.of(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
Object[] ExpectedResults = {1, 3, 6-8, 12-15, 21-24, 31};
Object[] ActualResults = {1,3,-2,-3, -3,31};

	@BeforeEach
	 void setUp()  {
		impactDem = new ImpactDem();
	}

	@Test
		void testNotEqualResults() {
		// Assertions.assertNotNull(impactDem.result);
		 Assertions.assertEquals(impactDem.result, ActualResults);
	}
	
	@Test
	void testEqual() {
		Assertions.assertEquals(impactDem.result, ExpectedResults);
	
}
	
	@Test
	void testNull() {
		Assertions.assertNotNull(impactDem.result);
	
}
	

}