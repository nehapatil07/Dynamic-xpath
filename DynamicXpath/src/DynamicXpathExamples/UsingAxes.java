package DynamicXpathExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingAxes {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
	  driver.findElement(By.xpath("//input[@id='mobile']//preceding::input[@class='form-control']")).sendKeys("neha");
	  driver.findElement(By.xpath("//input[@id='course']//following::input[@class='form-control']")).sendKeys("java");
	  driver.findElement(By.xpath("")).sendKeys("566555");
  }
}
