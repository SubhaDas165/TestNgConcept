package testcase;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import configUtility.ObjectReader;
import takeScreenShot.ScreenShot;

public class PageTest {
	static ObjectReader obj;
	static ScreenShot ss;

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		obj=new ObjectReader();
		String key=obj.getChromeKey();
		String path=obj.getChromePath();
//		String url=obj.getBaseURL();
//		String NaviateUrl=obj.getNavigateURL();
		
		System.setProperty(key, path);
		WebDriver driver=new ChromeDriver();
		
//		driver.get(url);
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("Subha");
		WebElement LastName=driver.findElement(By.name("lastname"));
		LastName.sendKeys("Das");
		WebElement Gen=driver.findElement(By.id("sex-0"));
		Gen.click();
		WebElement Exp=driver.findElement(By.id("exp-0"));
		Exp.click();
		WebElement Date=driver.findElement(By.id("datepicker"));
		Date.sendKeys("21-04-2022");
		List<org.openqa.selenium.WebElement> obj=driver.findElements(By.name("profession"));
		System.out.println(obj.size());
		for(int i=0;i<obj.size();i++) {
			obj.get(i).click();
		}
		List<org.openqa.selenium.WebElement> obj1=driver.findElements(By.name("tool"));
		System.out.println(obj1.size());
		for(int i=0;i<obj1.size();i++) {
			obj1.get(i).click();
		}
		driver.findElement(By.id("continents")).click();
		WebElement dropdown = driver.findElement(By.id("continents"));
		dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
		
		WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
		dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
//		driver.navigate().to(NaviateUrl);
		Thread.sleep(2000);

		driver.findElement(By.name("q")).sendKeys("selenium tutorial");
		Thread.sleep(2000);

		driver.findElement(By.name("q")).clear();
		ss= new ScreenShot(driver);
		ss.getScreenShot("google");
		driver.close();
		
	}

}
