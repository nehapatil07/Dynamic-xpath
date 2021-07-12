package DynamicXpathExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseOfContains {
	WebDriver driver;
  @Test
  public void ContainsSpan() {
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	  driver.findElement(By.xpath("//span[contains(text(),'Users')]")).click();// only the syntax of text is different
  }
  @Test
  public void ContainsButton(){
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
	  driver.findElement(By.xpath("// button[contains(text(),'Add User')]")).click();
  }
  @Test
  public void ContainsAsterisc(){
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	  driver.findElement(By.xpath("//*[contains(@href,'../pdf/selenium-testing-syllabus-jbk.pdf')]")).click();
  }
  @Test
  public void containsID(){
  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
  driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("neha");  
  }
  
}
