package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Selenium\\Executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
	}

}
