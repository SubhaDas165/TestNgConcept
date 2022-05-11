package parameterConcept;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
  @Test
  @Parameters({"Myname"})
  public void f(String name) {
	  System.out.println("my name is "+name);
  }
  
}
