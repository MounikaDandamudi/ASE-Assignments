import static org.junit.Assert.*;

import org.junit.Test;

public class PoundstoKgsTest {

	PoundsToKgs ktpTest = new PoundsToKgs();
	Double kgs=ktpTest.convertPoundtoKgfromInput(10.000);
	Double kgsTest= 4.54;
	
	@Test
	public void test() {
		System.out.println("@Test pounds(): " +kgs+"="+ kgsTest);
		assertEquals(kgsTest, kgs);
}
}
