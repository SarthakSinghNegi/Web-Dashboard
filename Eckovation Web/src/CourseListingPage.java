import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CourseListingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/Sarthak/Work/Selenium Work/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.eckovation.com/courses.html");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,200)", "");
		js.executeScript("window.scrollBy(0,200)", "");

		WebElement d=driver.findElement(By.xpath("//button[@ng-click='showMoreItems()']"));

		
		//js.executeScript("window.scrollBy(0,1000)", "");
	//	js.executeScript("window.scrollBy(0,800)", "");
		//Thread.sleep(1500);
		//System.out.println(d.getText());
		//d.click();
	
				
		//driver.findElement(By.xpath("//button[@ng-click='showMoreItems()']")).click();
		Actions actions=new Actions(driver);
		actions.moveToElement(d);
		Thread.sleep(1500);	
		actions.perform();
		//Thread.sleep(1500);	
		d.click();
		Thread.sleep(1500);	
		
		js.executeScript("window.scrollBy(0,200)", "");
		actions.moveToElement(d);
		Thread.sleep(1500);
		System.out.print("done");
		actions.perform();
		d.click();

	}

}
