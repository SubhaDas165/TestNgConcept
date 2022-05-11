package parallelExecution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import configUtility.ObjectReader;

public class ParalalExecution {
	static ObjectReader obj;
  @Test
  public void chromeTest1() throws IOException {
	  obj=new ObjectReader();
		String key=obj.getChromeKey();
		String path=obj.getChromePath();
		System.setProperty(key, path);

	  WebDriver driver=new ChromeDriver();
	  driver.get("https:www.google.com");
  }
  @Test
  public void chromeTest2() throws IOException {
	  obj=new ObjectReader();
		String key=obj.getFFKey();
		String path=obj.getFFPath();
		System.setProperty(key, path);

	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://petstore.octoperf.com/");
  }
}
