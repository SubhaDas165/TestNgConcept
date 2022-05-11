package dataProvider;

import org.testng.annotations.Test;

import configUtility.ObjectReader;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	static ObjectReader obj;
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws IOException, InterruptedException {
	  obj=new ObjectReader();
		String key=obj.getChromeKey();
		String path=obj.getChromePath();
		System.setProperty(key, path);

	  WebDriver driver=new ChromeDriver();
	  driver.get("https://petstore.octoperf.com/");
	  driver.findElement(By.linkText("Enter the Store")).click();
	  driver.findElement(By.linkText("Sign In")).click();
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("password")).clear();
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("signon")).click();
	  Thread.sleep(5000);
	  driver.quit();

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "subha123", "Subha123" },
      new Object[] { "s123", "S123" },
    };
  }
}
