package DynamicXpathJbkExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JbkExamples {
	public static WebDriver driver;
  @BeforeSuite(groups="smoke")
  public static WebDriver BrowserSetUp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://javabykiran.com/selenium/demo/");
	return driver;  
  }
  @Test(priority=1, groups="regression", description="to check url is correct or not")	  
  public static void VerifyUrl(){
	  String my_url=driver.getCurrentUrl();
	  System.out.println("page title is "+my_url);
	  String exp_url="https://javabykiran.com/selenium/demo/";
	  Assert.assertEquals(my_url, exp_url);
	  System.out.println("*************************");
	  System.out.println("test case 1 with thread ID>>"+Thread.currentThread().getId());
  }
  
  @Test(priority=2, groups="regression", description="to verify application title")
	  public static void ApplicationTitle(){
		  String title=driver.getTitle();
		  System.out.println("My title is >>"+title);
		  System.out.println("------------------");
		 String ExpTitle="Page not found | javabyKiran";
		 Assert.assertEquals(title, ExpTitle);
		 System.out.println("*******************");
		 System.out.println("Test case 2 with thread ID>>"+Thread.currentThread().getId());	  
	  }
  @Test(priority=3, groups="regression", description="")
  public static void verifyTitle(){
	  
  }
  }




