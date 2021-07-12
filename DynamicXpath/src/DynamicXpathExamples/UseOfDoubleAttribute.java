package DynamicXpathExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseOfDoubleAttribute {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/index.html");
	  driver.findElement(By.xpath("//input[@type='text'][@id='email']")).sendKeys("kiran@gmail.com");
	  driver.findElement(By.xpath("//input[@type='password'][@class='form-control']")).sendKeys("123456");
  }
}
