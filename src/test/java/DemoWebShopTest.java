import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebShopTest{
WebDriver driver;


@BeforeMethod
public void setUp () {
	//System.setProperty("webdriver.chrome.driver", "/Users/karolina/Tools/chromedriver");
	driver = new ChromeDriver ();
	driver.get ("https://demowebshop.tricentis.com/");
	driver.manage ().window ().maximize ();
}

@Test
public void openDemoWebShop () {
	System.out.println ("Opening DemoWebShop");
}

@AfterMethod(enabled = false)
public void tearDown() {
		driver.quit();
}

}



