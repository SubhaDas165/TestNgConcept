package attributes;

import org.testng.annotations.Test;

public class EnableAttribute {
	  @Test
	  public void landingPage() {
		  System.out.println("Succfully Landing");
	  }
	  @Test(enabled = false)
	  public void registrationPage() {
		  System.out.println("Succfully registration");
	  }
	  @Test
	  public void loginPage() {
		  System.out.println("Succfully Login");
	  }
}
