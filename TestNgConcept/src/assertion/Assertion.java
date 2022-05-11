package assertion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assertion {
  @Test
  public void facebookTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\SUBHA DAS\\eclipse-workspace\\Automation Framework\\BrowserDriver\\chromedriver.exe");  
      WebDriver driver = new ChromeDriver();
      driver.get("https://en-gb.facebook.com/login.php");
      driver.findElement(By.id("email")).sendKeys("sss",Keys.ENTER);
      SoftAssert softAssert=new SoftAssert();
      //Title Assertion
      String actiltle=driver.getTitle();
      String extitle="Log in to Facebook";
      softAssert.assertEquals(actiltle, extitle,"Title is Mismatched");
      
      //URL Assertion
      String acURL=driver.getCurrentUrl();
      String exURL="https://en-gb.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=1";
      softAssert.assertEquals(acURL, exURL,"URL is Mismatched");

      //TextAssertion
      String acText=driver.findElement(By.id("email")).getAttribute("value");
      String exText="";
      softAssert.assertEquals(acText, exText,"Text is Mismatched");
      

      //Border Assertion
      String acborder=driver.findElement(By.id("email")).getCssValue("border");
      String exborder="1px solid rgb(240, 40, 73)";
      softAssert.assertEquals(acborder, exborder,"Border is Mismatched");
      
    //Error msg Assertion
      String acmsg=driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
      String exmsg="Theee email address or mobile number you entered isn't connected to an account. Find your account and log in.";
      softAssert.assertEquals(acmsg, exmsg,"Error msg is Mismatched");
      driver.quit();
      softAssert.assertAll();
  }
}
