import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CourseLandingPage {

	public static WebDriver landingPage() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:/Sarthak/Work/Selenium Work/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://wt.eckovation.com/course/best-course-online-certification-course-for-beginners-+-guaranteed-internship");
		Thread.sleep(1500);
		
		//@20->Course Name is visible
		String courseName = driver.findElement(By.xpath("//div[contains(@class,'headlin')]/h1")).getText(); //how to get h1 from a div
		System.out.println(courseName.equalsIgnoreCase("Best Course Online Certification Course for Beginners + Guaranteed Internship"));
		System.out.println("Heading->"+courseName +" \n1.Heading is visible");
		
		
		js1.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(500);
		
		
		//@21->Course Tagline is visible
		String courseTagline = driver.findElement(By.xpath("//div[contains(@class,'headlin')]/p")).getText();
		System.out.println(courseTagline.equalsIgnoreCase("Learn how to create Beautiful Responsive Websites and Market it Online in 30 days [Testimonial Websites included in Description below]"));
		System.out.println("Tagline->"+courseTagline+" \n2.Course Description is visible");
		
		js1.executeScript("window.scrollBy(0,400)", "");
		
		//@23->Creator Name is visible
		String creatorName=driver.findElement(By.xpath("//h3[@class='mtd40']")).getText();
		System.out.println(creatorName.equalsIgnoreCase("Created By: Sarthak Singh Negi"));
		System.out.println(creatorName+" is visible");
		
		//@22->Includes is visible
		String courseIncludes = driver.findElement(By.xpath("//div[contains(@class,'header-bottom-left')]/h2")).getText();
		System.out.println(courseIncludes.equalsIgnoreCase("Includes"));
		System.out.println("3."+courseIncludes+ " is visible");
		
		//@24Course Duration is visible
		String crsDuration=driver.findElement(By.xpath("//h3[@style='color: #ffce00;']")).getText();
		System.out.println(crsDuration.equalsIgnoreCase("Course Duration : 1 Months"));
		System.out.println(crsDuration);
		
		js1.executeScript("window.scrollBy(0,400)", "");
		
		//@32-40 Click Menu and visibility
		driver.findElement(By.xpath("/html/body/section[5]/div/div[1]/div[1]/ul/li[1]/a")).click();
		System.out.println("Description clicked");
		driver.findElement(By.xpath("/html/body/section[5]/div/div[1]/div[1]/ul/li[2]/a")).click();
		System.out.println("Curriculum clicked");
		String curriculum=driver.findElement(By.cssSelector("div.panel-default:nth-child(1) > div:nth-child(1) > h4:nth-child(1) > div:nth-child(1) > span:nth-child(1)")).getText();
		System.out.println(curriculum.equalsIgnoreCase("Basic Coding Knowledge"));
		System.out.println(curriculum+" curriculum is visible");
		WebElement instructor=driver.findElement(By.cssSelector("#instructors > h1:nth-child(1) > a:nth-child(1)"));
		Actions actions=new Actions(driver);
		actions.moveToElement(instructor);
		Thread.sleep(1500);	
		actions.perform();
		System.out.println(instructor.getText()+" is visible");
		js1.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(1000);
		
		String iName=driver.findElement(By.xpath("/html/body/section[6]/div/div/div[2]/h2")).getText();
		System.out.println(iName.equalsIgnoreCase("Sarthak Singh Negi"));
		System.out.println(iName+" is visible");

		String iQual=driver.findElement(By.xpath("/html/body/section[6]/div/div/div[2]/h3")).getText();
		System.out.println(iQual.equalsIgnoreCase("MCA and Serial Entrepreneur"));
		System.out.println(iQual+" is visible");
		
		String iDesc=driver.findElement(By.xpath("//div[@style='margin-bottom: 20px;overflow: hidden;']/div[3]/p[3]")).getText();
		System.out.println(iDesc.equalsIgnoreCase("Sarthak Singh is an IIT Delhi Graduate with 8 years of experience in Web Development and has created more than 15 websites both for his own enterpreneurial ventures as well as for other companies. "));
		System.out.println(iDesc);
		
		
		WebElement RC=driver.findElement(By.xpath("/html/body/section[7]/div/h1/a"));
		Actions actions1=new Actions(driver);
		actions1.moveToElement(RC);
		Thread.sleep(1500);	
		actions1.perform();
		System.out.println(RC.getText()+" is visible");
		
		js1.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(1000);
		js1.executeScript("window.scrollBy(0,400)", "");

		//FAQ's visibility:
		System.out.println((driver.findElement(By.xpath("/html/body/section[8]/div/div/h1/a")).getText()).equalsIgnoreCase("Faq"));
		System.out.println((driver.findElement(By.xpath("/html/body/section[8]/div/div/h1/a")).getText())+" is visible");
		
		Thread.sleep(1000);
		js1.executeScript("window.scrollBy(0,200)", "");
		driver.findElement(By.xpath("/html/body/section[8]/div/div/div[1]/div/amp-accordion/section/h4/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section[8]/div/div/div[1]/div/amp-accordion/section/h4/span[1]")).click();
		Thread.sleep(2000);
		js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		js1.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		Thread.sleep(1500);
		
		return driver;
		
	}

}
