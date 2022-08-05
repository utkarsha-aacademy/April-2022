package TestNGPrograms;

import org.testng.annotations.Test;

public class GroupDepencency {
@Test(groups = "SignIn")
public void login()
{
	System.out.println("Login successfully");
	}

@Test(dependsOnGroups = "SignIn")
public void viewAccount()
{
	System.out.println("View Account successfully");
	}

}
