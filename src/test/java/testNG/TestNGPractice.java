package testNG;

import org.testng.annotations.Test;

public class TestNGPractice {
	@Test(invocationCount=-2)
	public void createCustomer()
	{
		System.out.println("Customer created");
	}
	
	@Test
	public void modifyCustomer()
	{
		System.out.println("Customer modified");
	}
	@Test
	public void deleteCustomer()
	{
		System.out.println("Customer deleted");
	}
}
