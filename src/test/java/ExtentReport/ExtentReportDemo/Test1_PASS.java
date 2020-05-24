package ExtentReport.ExtentReportDemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import report.Utility.ExtentTestManager;

public class Test1_PASS {
	
	@BeforeClass
	public void beforeClassM()
	{
		
		 Assert.assertTrue(true,"in before class");
		 //ExtentTestManager.getTest().log(Status.INFO, "Before class");
	}

	@BeforeMethod
	public void beforeMethodM()
	{
		if(2<4)
		{
			Assert.assertTrue(true,"in before method");
			//ExtentTestManager.getTest().log(Status.INFO, "Before Method");
		}
	}
	
	@Test
	public void testM1()
	{
		if(3<4)
		{
			Assert.assertTrue(true, "in TC1");
			ExtentTestManager.getTest().log(Status.INFO, "Test1, if 3<4..");
		}
	}
	
	@Test
	public void testM2()
	{
		if(3<4)
		{
			Assert.assertTrue(true,"in TC2");
			ExtentTestManager.getTest().log(Status.INFO, "Test2, if 3<4..");
		}
		
		else
		{
			Assert.assertTrue(false,"in TC2");
			ExtentTestManager.getTest().log(Status.INFO, "Test2, if 3>4..");
		}
			
	}
	
	
	@Test(enabled = false)
	public void testM3()
	{
		if(3<4)
		{
			Assert.assertTrue(true,"in TC2");
			ExtentTestManager.getTest().log(Status.INFO, "Test2, if 3<4..");
		}
			
	}
	
	@AfterClass
	public void afterClassM()
	{
		if(true)
			Assert.assertTrue(true);
	}
}
