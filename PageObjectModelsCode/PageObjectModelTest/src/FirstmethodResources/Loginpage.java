package FirstmethodResources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
WebDriver driver;

By User_Name=By.id("user-name");
By Password=By.id("password");
By Login=By.xpath("//input[@id='login-button']");


public Loginpage(WebDriver d) 
{
  driver=d;	
}

public void UserName(String Uname) {
	driver.findElement(User_Name).sendKeys(Uname);
}

public void UserPassword(String Upassword) {
	driver.findElement(Password).sendKeys(Upassword);
}

public void LoginClick() {
	driver.findElement(Login).click();
}
}
