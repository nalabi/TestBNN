import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Assert;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {

	
	private Object results;

	@Test
	public void test1() {
		Impact impact = new Impact();
		org.junit.Assert.assertEquals(results, 555555);
		
	}
	
		
	private void assertEquals(Object results2, int i) {
		// TODO Auto-generated method stub
		
	}
}
