package testngexample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testnftwo {
	@Parameters({"URL"})
	@Test
	
public void g(String URL)
{
		System.out.println("this for the helper annotations"+URL);
		System.out.println("this for the helper annotations"+URL);
		System.out.println("this for the helper annotations"+URL);
}
	@Test(dependsOnMethods= {"g"})
	
	public void b()
	{
			System.out.println("this for the helper annotations-murali");
			System.out.println("this for the helper annotations");
	}
	@Test(enabled=true)
	
	public void a()
	{
			System.out.println("this for the helper annotations--nandu");
	}
@Test
	
	public void aa()
	{
			System.out.println("this for the helper annotations--bujji");
	}
@Test(enabled=true)

public void aaa()
{
		System.out.println("this for the helper annotations--prasanna");
}
@Test(dataProvider="getdata")
public void aaag(String s,String ss)
{
		System.out.println("this for the helper annotations--prasanna");
		System.out.println(s);
		System.out.println(ss);
}
@DataProvider
public Object getdata()
{
	Object[][] obj=new Object[3][2];
	
	obj[0][0]="Murali";
	obj[0][1]="Dhulipala";
	obj[1][0]="Nandu";
	obj[1][1]="Dhulipala";
	obj[2][0]="Prasanna";
	obj[2][1]="Dhulipala";
	return obj;
}
}
