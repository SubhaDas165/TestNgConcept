package attributes;

import org.testng.annotations.Test;

public class DependsOnAtrribute {
  @Test
  public void webStudent() {
	  System.out.println("student login through web");
  }
  @Test(dependsOnMethods = {"webStudent"})
  public void mobileStudent() {
	  System.out.println("student login through mobile");
  }
  @Test(dependsOnMethods = {"mobileStudent","webStudent"})
  public void TabStudent() {
	  System.out.println("student login through Tab");
  }


}
