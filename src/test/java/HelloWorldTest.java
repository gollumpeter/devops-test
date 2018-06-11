import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HelloWorldTest {

	@Test
	public void test() {
		assertEquals(1, HelloWorld.getNumber());
	}
}
