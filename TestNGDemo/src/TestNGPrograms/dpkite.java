package TestNGPrograms;

import org.testng.annotations.DataProvider;

public class dpkite {
	 @DataProvider
	  public Object[][] kiteData() {
	    return new Object[][] {
	      new Object[] { "XA0634", "123454321", "122331" },
	      new Object[] { "XA0342", "1234532" , "231111" },
	      new Object[] { "XA0345", "12345746" , "111111" },
	      new Object[] { "XA0634", "Sarika699!", "691991" },
		new Object[] { "XA0646", "74837939", "665788" },
	    };
	  }
}
