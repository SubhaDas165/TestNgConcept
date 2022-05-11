package browserImplementation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configUtility.ObjectReader;

public class Browser_Launch {
	ObjectReader obj;
	String CPath;
	String EPath;
	String FPath;
	String url;
	String Ckey;
	String Ekey;
	String Fkey;
	
	WebDriver driver;
	public Browser_Launch() throws Exception {
		// TODO Auto-generated constructor stub
		obj=new ObjectReader();
		Ckey=obj.getChromeKey();
		
		url=obj.getBaseURL();
		CPath=obj.getChromePath();
		
		System.setProperty(Ckey, CPath);
		
		
	}
	public WebDriver launch_Chrome() {
		driver=new ChromeDriver();
		driver.get(url);
		return driver;
	}
	
	

}
