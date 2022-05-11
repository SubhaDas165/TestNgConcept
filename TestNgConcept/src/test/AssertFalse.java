package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framework\\BrowserDriver\\chromedriver.exe");  
      WebDriver driver = new ChromeDriver();  
      driver.navigate().to("https://www.spicejet.com/");  
      Assert.assertFalse(driver.findElement(By.id("SeniorCitizenDiscount")).isSelected());  
      System.out.println(driver.findElement(By.id("SeniorCitizenDiscount")).isSelected());  
        
  }
}
