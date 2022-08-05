package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewdpTest {
  @Test(dataProviderClass = TestNGPrograms.dpnewtest.class,dataProvider = "dp")
  public void f(Integer n, String s) {
  }
}
