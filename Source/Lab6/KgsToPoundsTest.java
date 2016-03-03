import static org.junit.Assert.*;

import org.junit.Test;

public class KgsToPoundsTest {

	
		KgsToPounds ktpTest = new KgsToPounds();
		Double pounds=ktpTest.convertKgtoPfromInput(36.8);
		Double poundsTest= 81.12928;
		
		@Test
		public void test() {
			System.out.println("@Test pounds(): " +pounds+"="+ poundsTest);
			assertEquals(poundsTest, pounds);
	}

}
