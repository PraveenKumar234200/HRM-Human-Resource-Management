package in.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	private static WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@name='username']")
	private static WebElement username;

	public WebElement getusername() {
		return username;
	}
	@FindBy(xpath ="//input[@placeholder='Password']")
	private static WebElement password;
	public WebElement getpassword() {
		return password;
	}
	@FindBy(xpath ="//button[normalize-space()='Login']")
	private static WebElement login;
	public WebElement getlogin() {
		return login;

	}
}
