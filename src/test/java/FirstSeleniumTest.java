import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

WebDriver driver;


@BeforeMethod
public void setUp(){
	driver = new ChromeDriver ();
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.google.com");//save history
	driver.manage().window().maximize();
	driver.navigate ().back (); // на предыдущую стр
	driver.navigate ().forward (); // переводит вперед
	driver.navigate ().refresh ();// обновляет стр
	driver.manage ().timeouts ().implicitlyWait (Duration.ofSeconds (10));// ожидание локатора
}

@Test
public void openGoogle(){
	System.out.println("Opening Google");
}

@AfterMethod
public void tearDown(){
	driver.quit();// закрывает браузер
	//driver.close();// закрывает вкладку
}
}
