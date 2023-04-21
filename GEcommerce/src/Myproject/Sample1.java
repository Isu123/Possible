package Myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./isu/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://203.122.19.18:9007");
	String url=driver.getCurrentUrl();
	System.out.println(url);
}
}
