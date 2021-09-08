package Lab17_Priorities;

import org.testng.annotations.Test;

public class Priority_1 {
	
	
	 static String a="a",b="b",c="c",d="d";
	
	
	
		
	
	@Test(priority=0)
	public static void Test1_OpenChromeBrowser()
	{
		System.out.println("c value Result is : " +c);
	}
	


	@Test(priority=-1)
	public static  void Test2_OpenOrangeHRM() throws Exception
	{

		System.out.println("b value Result is : "  +b);
	}
	

	@Test
	public static void Test3_Login() throws Exception
	{
	
		
		System.out.println("d value Result is : "  +d);
		
		
	}
	

	
	@Test(priority=-1)
	public static void Test4_Addnatialities() throws Exception
	{
	
		System.out.println("a value Result is : "  +a);
	}
	
	
	

}
