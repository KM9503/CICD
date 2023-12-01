package AutomationProject.com.AutomationProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {

	public static WebDriver driver = null;

	@BeforeMethod
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}

	@Test
	public void Test1() {
//		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Test 1 Title : " + driver.getTitle());
	}

	@Test
	public void Test2() {
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("Test 2 Title : " + driver.getTitle());
	}

	@Test
	public void Test3() {
		driver.navigate().to("https://www.myntra.com/");
		System.out.println("Test 3 Title : " + driver.getTitle());
	}
	
	@AfterMethod
	public void quite() {
		driver.close();;
	}

}
