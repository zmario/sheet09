import static org.junit.Assert.*;

import org.junit.Test;

public class GradleTest {

	@Test
	public void test() {
		String s1 = "test";
		String s2 = "gradle";
		
		Gradle gradle = new Gradle();
		String s = gradle.joinStrings(s1, null, s2);
		String expected = "test; gradle";
		
		assertEquals(expected, s);
	}
}