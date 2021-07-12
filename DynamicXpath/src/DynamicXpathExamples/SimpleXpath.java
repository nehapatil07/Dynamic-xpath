package DynamicXpathExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleXpath {
	WebDriver driver;
  @Test
  public void LogIn() {
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/index.html");
	  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	  
  }
}
