package Gen.cool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class genpage {

	// using Findby
	@FindBy(xpath = "//input[@type='text']")
	@CacheLookup
	WebElement name1;
	public WebDriver driver;

	// using how
	@FindBy(how = How.XPATH, using = "//input[@type='text']")
	public WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement pass;

	// using POM
	By name = By.xpath("//input[@type='text']");

	public genpage(WebDriver driver) {

		this.driver = driver;
	}

	// public void na() {

	// driver.findElement(name).sendKeys("krish");
	// }

	// public void na() {

	// name1.sendKeys("krishvij");
	// }

	public void na() {

		username.sendKeys("vijaykrishnad");
		pass.sendKeys("power123");
	}

}
