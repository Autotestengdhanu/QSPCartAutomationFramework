package colTests;

import org.testng.annotations.Test;

public class SampleTest {
	public class AddToCartTest {
		
		@Test
		 public void addToCartTest()
		 {
			System.out.println("Cart is added successfully");
		 }

		@Test
		public void deleteCartTest()
		{
			System.out.println("Cart deleted ");
		}
	}


}
