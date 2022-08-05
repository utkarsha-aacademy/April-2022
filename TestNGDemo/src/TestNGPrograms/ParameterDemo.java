package TestNGPrograms;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
  @Test
  @Parameters({"val1","val2"})
  public void sum(int v1, int v2 ) {
	  int sum = v1 +v2;
	  System.out.println("Addition is "+sum);
	  
  }
  @Test
  @Parameters({"val1","val2"})
  public void diff(int v1, int v2 ) {
	  int diff = v1 - v2;
	  System.out.println("Difference is "+diff);
	  
  }
}
