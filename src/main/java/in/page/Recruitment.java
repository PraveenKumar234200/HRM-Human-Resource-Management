package in.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruitment {
	private static WebDriver driver;

	public Recruitment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Recruitment']")
	private static WebElement recruitment;

	public WebElement clickrecruitment() {
		return recruitment;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	private static WebElement canjobtitle;

	public WebElement clickjobtitlebutton() {
		return canjobtitle;
	}

	@FindBy(xpath = "//span[normalize-space()='Automaton Tester']")
	private static WebElement candjobtitle;

	public WebElement candidateclickjobtitle() {
		return candjobtitle;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	private static WebElement candvacancy;

	public WebElement candidateclickvacbutton() {
		return candvacancy;
	}

	@FindBy(xpath = "//span[normalize-space()='Senior QA Lead']")
	private static WebElement Candvacancy;

	public WebElement candidateselectvacoption() {
		return Candvacancy;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	private static WebElement candHiringmanage;

	public WebElement clickcandidatehirebutton() {
		return candHiringmanage;
	}

	@FindBy(xpath = "//span[normalize-space()='Rahul Patil']")
	private static WebElement CandHiringmanage;

	public WebElement selectcandidateHiringmanager() {
		return CandHiringmanage;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	private static WebElement candjobstatus;

	public WebElement clickbuttonjobstatus() {
		return candjobstatus;
	}

	@FindBy(xpath = "//span[normalize-space()='Shortlisted']")
	private static WebElement Candjobstatus;

	public WebElement selectjobstatus() {
		return Candjobstatus;
	}

	@FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
	private static WebElement Enterkeywords;

	public WebElement EnterKeyword() {
		return Enterkeywords;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	private static WebElement Methodofapplication;

	public WebElement clickmethodofapplication() {
		return Methodofapplication;
	}

	@FindBy(xpath = "//span[normalize-space()='Online']")
	private static WebElement methodofapplication;

	public WebElement selectmethodofapplication() {
		return methodofapplication;
	}

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private static WebElement Candidatename;

	public WebElement entercandidatename() {
		return Candidatename;
	}

	@FindBy(xpath = "(//i)[11]")
	private static WebElement Selectfromdate;

	public WebElement recclickfromdate() {
		return Selectfromdate;
	}

	@FindBy(xpath = "//div[@class='oxd-calendar-date'][normalize-space()='1']")
	private static WebElement selectfromdate;

	public WebElement recEnterfromdate() {
		return selectfromdate;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/i[1]")
	private static WebElement selecttodate;

	public WebElement recclicktodate() {
		return selecttodate;
	}

	@FindBy(xpath = "//div[@class='oxd-date-input-link --today']")
	private static WebElement Selecttodate;

	public WebElement recEntertodate() {
		return Selecttodate;
	}

	@FindBy(xpath = "//a[normalize-space()='Vacancies']")
	private static WebElement vacancies;

	public WebElement clickvacancies() {
		return vacancies;
	}

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private static WebElement Jobtitle;

	public WebElement clickjobtitle() {
		return Jobtitle;
	}

	@FindBy(xpath = "//span[normalize-space()='QA Engineer']")
	private static WebElement Role;

	public WebElement selectjobRole() {
		return Role;
	}

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private static WebElement vacancy;

	public WebElement clickbuttonvac() {
		return vacancy;
	}

	@FindBy(xpath = "//span[normalize-space()='Senior QA Lead']")
	private static WebElement selvacancy;

	public WebElement selectvacrole() {
		return selvacancy;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	private static WebElement Hiringmanager;

	public WebElement selecthiremanagerbutton() {
		return Hiringmanager;
	}

	@FindBy(xpath = "//span[normalize-space()='Rahul Patil']")
	private static WebElement hiringmanagername;

	public WebElement selecthiremanager() {
		return hiringmanagername;
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
	private static WebElement statusbutton;

	public WebElement selstatusbutton() {
		return statusbutton;
	}

	@FindBy(xpath = "//span[normalize-space()='Active']")
	private static WebElement optionstatusbutton;

	public WebElement selactive() {
		return optionstatusbutton;
	}

	@FindBy(xpath = "//button[normalize-space()='Search']")
	private static WebElement searchbuttoninvac;

	public WebElement searinbuttoninvac() {
		return searchbuttoninvac;
	}
}
