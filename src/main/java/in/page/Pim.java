package in.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pim {
	private static WebDriver driver;

	public Pim(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='PIM']")
	private static WebElement PIMClick;

	public WebElement getPim() {
		return PIMClick;
	}

	@FindBy(xpath = "(//button[@type='button'])[4]")
	private static WebElement Addbutton;

	public WebElement getaddbutton() {
		return Addbutton;
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private static WebElement FirstName;

	public WebElement EnterFirstName() {
		return FirstName;

	}

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private static WebElement LastName;

	public WebElement EnterLastName() {
		return LastName;
	}

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private static WebElement Save;

	public WebElement clicksavebutton() {
		return Save;

	}

	@FindBy(xpath = " (//input[@class='oxd-input oxd-input--active'])[3]")
	private static WebElement otherId;

	public WebElement EnterotherId() {
		return otherId;
	}

	@FindBy(xpath = "(//div[@tabindex='0'])[1]")
	private static WebElement DropDown;

	public WebElement Selectdropdown() {
		return DropDown;
	}

	@FindBy(xpath = "//a[text()='Employee List']")
	private static WebElement Empbutton;

	public WebElement getEmpbutton() {
		return Empbutton;
	}

	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
	private static WebElement Empname;

	public WebElement enterEmpname() {
		return Empname;
	}

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	private static WebElement Searchbutton;

	public WebElement clicksearchbutton() {
		return Searchbutton;

	}

	@FindBy(xpath = "//span[normalize-space()='Configuration']")
	private static WebElement configurationbutton;

	public WebElement configurationbutton() {
		return configurationbutton;
	}

	@FindBy(xpath = "//a[normalize-space()='Optional Fields']")
	private static WebElement optionalfield;

	public WebElement optionalfield() {
		return optionalfield;
	}

}


