package rashi.tatocjs;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testtat {
	
	WebElement element;
	WebDriver driver;
	JavascriptExecutor js ;
	
	@Test
	public void test001_LaunchBrowser() {
		String titleName= BrowserDetail.LaunchBrowser();
		System.out.println("t"+titleName);
		//Assert.assertTrue(titleName.contains("Welcome - T.A.T.O.C"));
		Reporter.log("Application Lauched successfully | ");
	 	} 
	@Test
  public void test002_BasicCourse() {
		String titleName= BasicBlock.basicCource();
   Assert.assertTrue(titleName.contains("Grid Gate - Basic Course - T.A.T.O.C"));
		Reporter.log("Application Lauched successfully | ");
		 
  }
	@Test
	public void test003_redBox() {
		String title= RedGreenBox.RedBox();
		 
		Assert.assertTrue(title.equals("Error - T.A.T.O.C"));
		Reporter.log("Application Lauched successfully | ");
 }
	@Test
	public void test004_GreenBox() {
		String titleName= RedGreenBox.greenBox();
		Assert.assertTrue(titleName.contains("Frame Dungeon - Basic Course - T.A.T.O.C"));
		Reporter.log("Application Lauched successfully | ");
 }

   @Test
	public void test005_testFrame() {
	
	 String titleName= FrameDungeon.proceed_after_repaint();
			Assert.assertTrue(titleName.contains("T.A.T.O.C"));
			Reporter.log("Application Lauched successfully | ");
	  }
   }