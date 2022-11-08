package testngexample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_example {
	
	@BeforeTest
	public void Execute()
	{
		System.out.println("execute before each test");
	}
	@Test
	public void Finction1()
	{
}
	@Test(dependsOnMethods= {"Finction1"})
	public void ninction11()
	{
		System.out.println("Depends on methods annotation");
	}
	@AfterTest
	public void Executee()
	{
		System.out.println("execute after each test");
	}
	@Test(groups= {"smoke"})
	public void mobiletest()
	{
		System.out.println("Mobile testing");
	}
	@BeforeSuite
	public void Exeecuteee()
	{
		System.out.println("execute before suite");
	}
	@AfterSuite
	public void Executeee()
	{
		System.out.println("execute after suite");
	}
	@BeforeMethod
	public void Exeecuteeee()
	{
		System.out.println("execute before method");
	}
	@AfterMethod
	public void Execcuteee()
	{
		System.out.println("execute after method");
	}
}
