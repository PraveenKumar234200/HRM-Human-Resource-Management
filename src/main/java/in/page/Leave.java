package in.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave {
	private static WebDriver driver;

	public Leave(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")
	private static WebElement Leaveclick;

	public WebElement getleave() {
		return Leaveclick;

	}

	@FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-item']")
	private static WebElement Apply;

	public WebElement clickapply() {
		return Apply;

	}

	// dropdowncode
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private static WebElement leavetype;

	public WebElement selectleavetype() {
		return leavetype;

	}

	@FindBy(xpath = "(//div[@role='option'])[2]")
	private static WebElement selectoption;

	public WebElement selectoptioncan() {
		return selectoption;

	}

	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]")
	private static WebElement Startdate;

	public WebElement enterstartdate() {
		return Startdate;

	}

	@FindBy(xpath = "//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]")
	private static WebElement Enddate;

	public WebElement enterenddate() {
		return Enddate;
	}

	@FindBy(xpath = "(//i)[12]")
	private static WebElement Partialdayoption;

	public WebElement Partialdayoption() {
		return Partialdayoption;

	}

	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//i[1]")
	private static WebElement Fromdate;

	public WebElement clickenterfromdate() {
		return Fromdate;
	}

	@FindBy(xpath = "//div[contains(text(),'23')]")
	private static WebElement fromdate;

	public WebElement selectenterfromdate() {
		return fromdate;
	}

	@FindBy(xpath = "(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
	private static WebElement todate;

	public WebElement clickentertodate() {
		return todate;
	}

	@FindBy(xpath = "(//div[contains(text(),'31')])[1]")
	private static WebElement Todate;

	public WebElement selectentertodate() {
		return Todate;
	}

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private static WebElement pastemployee;

	public WebElement selpastempradio() {
		return pastemployee;
	}
}
