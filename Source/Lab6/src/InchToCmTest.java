import static org.junit.Assert.*;

import org.junit.Test;

public class InchToCmTest {

	
		InchToCm itcTest = new InchToCm();
		Double cm=itcTest.convertInchToCmfromInput(10.00);
		Double cmTest= 25.4;
		
		@Test
		public void test() {
			System.out.println("@Test pounds(): " +cm+"="+ cmTest);
			assertEquals(cmTest, cm);
	}
	}


