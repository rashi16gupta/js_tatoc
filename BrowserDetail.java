package rashi.tatocjs;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDetail {


	String mainWindow;
	
	static WebDriver driver;
	public static JavascriptExecutor js ;
	public static String LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/rashi/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 js = (JavascriptExecutor) driver;
		driver.get("http://10.0.1.86//tatoc");
		
		//js.executeScript(" window.open('http://10.0.1.86//tatoc');");
		driver.manage().window().maximize();
		 
		 return driver.getTitle();
	 
	 	} 
	

}
