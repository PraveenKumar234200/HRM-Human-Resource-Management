package in.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {
	public static WebDriver driver;
	public static void LaunchBrowser() {

		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

	}
	public static void send(WebElement e, String v ) {
		e.sendKeys(v);
	}
	public static void clk(WebElement e) {
		e.click();
	}
	public static void iwait(int w) {
		driver.manage().timeouts().implicitlyWait(w,TimeUnit.SECONDS);
	}
	//Thread.sleep wait
	public static void wait(int w) throws InterruptedException {
		Thread.sleep(w);
	}
	//Explicit wait
	public static void imwait(int w) {
		WebDriverWait wa=new WebDriverWait(driver, Duration.ofSeconds(w));
		wa.until(ExpectedConditions.elementToBeClickable(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[3]")));
	}
	//Dropdown
	public static void dropdown(WebElement e, String options, String value) {
		Select s=new Select(e);
		if (options.equalsIgnoreCase("Index")) {
			s.selectByIndex(Integer.parseInt(value));
		}
		else if (options.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}
else if (options.equalsIgnoreCase("value")) {
	s.selectByValue(value);
}
	}
	//Radiobutton
	public static void radio(WebElement e) {
		e.click();
	}
	
}
