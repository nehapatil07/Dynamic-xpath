package DynamicXpathExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartsWithFunction {
	WebDriver driver;
  @Test
  public void StartsWith() {
	  System.setProperty("chromedriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/add_user.html");
	  System.out.println(driver.findElement(By.xpath("//button[starts-with(@class,'btn')]")).getText());
  }
}
