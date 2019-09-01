package Gen.cool;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class mypage{

	
	WebDriver driver;
	
	genpage gp;
	
	
	@BeforeClass
	@Test(groups= {"reg"})
	public void l() {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\MyData\\GEN\\Sellenium\\webdriver_install\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	
	}
	
	
	@Test(priority = 0,groups= {"reg"})
	@Parameters
	public void launch() {

		
		driver.get("Http://Newtours.Demoaut.Com/");
		//driver.get("Http://Amazone.Com/");

		driver.manage().window().maximize();
		//gp=new genpage(driver);
		//gp.na();
		gp=PageFactory.initElements(driver, genpage.class);
		gp.na();
	}

	//*@Test(priority = 3)
	//public void z() {
	//	System.out.println("hi");
		
		
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vijay");
	//}
	
	@Test(alwaysRun=true,groups= {"reg"})
	@Parameters({"uid"})
	public void z(@Optional("userID") String UID) {
		
		System.out.println(UID);
		
		//Assert.assertEquals(15, 45);
		
	}
	@Test(dependsOnMethods= {"z"},groups= {"reg"})
	public void xx() {
		
		System.out.println("hellohello");
		
	}

}
