package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTestNG {
  @Test(priority=0)
  public void firstTestCase() throws InterruptedException {
	  String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framework\\BrowserDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("page title-----------------------");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();
  }
  @Test(priority=1)
  public void secondTestCase() throws InterruptedException {
	  String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framework\\BrowserDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("page title-----------------------");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();
  }
 
}
