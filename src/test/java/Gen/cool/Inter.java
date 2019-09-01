package Gen.cool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Inter {

	
				
		@BeforeTest
		public void bb() {
                    
			System.setProperty("webdriver.chrome.driver","C:\\MyData\\GEN\\Sellenium\\webdriver_install\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("http://google.com");
		}
}