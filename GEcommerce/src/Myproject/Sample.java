package Myproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "./isu/geckodriver.exe");
FirefoxDriver driver1=new FirefoxDriver();
Thread.sleep(1000);
driver1.quit();

System.setProperty("webdriver.chrome.driver", "./isu/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.close();
}
}
