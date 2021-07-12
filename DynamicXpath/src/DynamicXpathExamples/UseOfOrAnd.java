package DynamicXpathExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseOfOrAnd {
	WebDriver driver;
  @Test
  public void UseOfOr() {
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/index.html");
	  driver.findElement(By.xpath("//input[@id='email' or @class='form-control']")).sendKeys("kiran@gmail.com");
	  driver.findElement(By.xpath("//input[@class='form-control' or @id='password']")).sendKeys("123456");
	  driver.findElement(By.xpath("//button[@type='submit' or class='btn btn-primary btn-block btn-flat']")).click();
  }
  
  //just replace OR by AND.Apply logic of gates to understand
  @Test
  public void UseOfAnd(){
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/index.html");
	  driver.findElement(By.xpath("//input[@id='email' and @class='form-control']")).sendKeys("kiran@gmail.com");
	  driver.findElement(By.xpath("//input[@class='form-control' and @id='password']")).sendKeys("123456");
	  driver.findElement(By.xpath("//button[@type='submit' or class='btn btn-primary btn-block btn-flat']")).click();
	  
  }
}
