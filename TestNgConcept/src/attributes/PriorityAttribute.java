package attributes;

import org.testng.annotations.Test;

public class PriorityAttribute {
  @Test(priority = 0)
  public void landingPage() {
	  System.out.println("Succfully Landing");
  }
  @Test(priority = 1)
  public void registrationPage() {
	  System.out.println("Succfully registration");
  }
  @Test(priority = 2)
  public void loginPage() {
	  System.out.println("Succfully Login");
  }
}
