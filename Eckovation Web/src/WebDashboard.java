import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDashboard {
	
	
	public static void loginOldUser(WebDriver driver,WebDriverWait wait,WebElement element) throws InterruptedException
	{
		//@+ve Scenarios
		driver.findElement(By.cssSelector("#custom-responsive-header-logout > div:nth-child(1) > nav:nth-child(1) > div:nth-child(5) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='tels']")));
		element.sendKeys("9555031751");
		driver.findElement(By.xpath("//button[@ng-click='login()']")).sendKeys(Keys.RETURN);
		/*try {
			Thread.sleep(31000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@ng-click='resendOtp()']")).click();
		Thread.sleep(2000);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[1]/p")));
		String otpPopup=element.getText();
		System.out.println(otpPopup.equalsIgnoreCase("You will recieve an otp shortly"));
		System.out.println(otpPopup+" POPUP is visible");
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='img']")));element.click();*/
		
		//@OTP enter
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='otpNumber']"))).sendKeys("133496");
		driver.findElement(By.xpath("//button[@ng-click='verifyOtp()']")).sendKeys(Keys.RETURN);
	}
	
	public static void myCourses(WebDriver driver,WebDriverWait wait,WebElement element,JavascriptExecutor js,Actions actions) throws InterruptedException
	{
		//@My Courses main heading
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='heading-text']")));
		String myCourseH1=element.getText();
		System.out.println(myCourseH1.equalsIgnoreCase("My Courses"));
		System.out.println(myCourseH1+" heading1 is visible");
		
		//@Recent Activity heading
		String recentActivityH2=driver.findElement(By.cssSelector("div.crs-heading:nth-child(1)")).getText();
		System.out.println(recentActivityH2.equalsIgnoreCase("Recent Activity"));
		System.out.println(recentActivityH2+" heading2 is visible");
		
		
		//@Combo Courses heading
		String comboCrsH3=driver.findElement(By.cssSelector("div.crs-heading:nth-child(4)")).getText();
		System.out.println(comboCrsH3.equalsIgnoreCase("Combo Course"));
		System.out.println(comboCrsH3+" heading3 is visible");
		
		//@ComboCourse Parent
		String crsParent=driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div[2]/div/div[4]/div[3]/div/p")).getText();
		System.out.println(crsParent.equalsIgnoreCase("ComboParent"));
		System.out.println(crsParent+" is visible");
		
		//@View Combo Courses
		element=driver.findElement(By.cssSelector(".cc-container > div:nth-child(4) > button:nth-child(1)"));
		String viewCourse=element.getText();
		System.out.println(viewCourse.equalsIgnoreCase("View Courses"));
		System.out.println(viewCourse+" is visible");
		
		//@Opening combo course
		element.click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div[2]/div/div[1]/div[5]/button")).click();
		
		//@Combo Child Name
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div/div[1]/div[4]/div/p")));
		String crsN1=element.getText();
		System.out.println(crsN1.equalsIgnoreCase("ComboChild2"));
		System.out.println(crsN1+" is visible");
		
		//@percentage count
		String pctg1=driver.findElement(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div/div[1]/div[4]/div/div/span")).getText();
		System.out.println(pctg1.equalsIgnoreCase("0%"));
		System.out.println(pctg1+ " is visible");
		
		//@Course Thumbnail
		element=driver.findElement(By.cssSelector("div.ic-container:nth-child(1) > div:nth-child(3) > div:nth-child(1) > img:nth-child(1)"));
		System.out.println(element.isDisplayed()+" thumbnail is visible");
		
		//@Opening child course
		element=driver.findElement(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div/div[1]/div[5]/button"));
		String sCourse=element.getText();
		System.out.println(sCourse.equalsIgnoreCase("Start Course"));
		System.out.println(sCourse+" is visible");
		element.click();
		
		
		//@driver shifting to new tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		driver.close();									//for closing current tab
		driver.switchTo().window(tabs.get(1));

		//@Combo Child Name2
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='ng-binding']")));
		String crsN2=element.getText();
		System.out.println(crsN2.equalsIgnoreCase("ComboChild2"));
		System.out.println(crsN2+" is visible");
		
		//@percentage count2
		element=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h5.ng-binding")));
		String pctg2=element.getText();
		System.out.println(pctg2.equalsIgnoreCase("0% Complete"));
		System.out.println(pctg2+" is visible");
		
		Thread.sleep(1000);
		//click on the content of the course
		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]/h4")).click();
		
		//@back from course page
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".sidebar-header > a:nth-child(1)")).click();
		Thread.sleep(1000);
		driver.close();									//for closing closing tab
		driver.switchTo().window(tabs.get(0));
		
		//@back from Combo Course
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".header-heading > span:nth-child(2)"))).click();
		
/*		//@check recent Activity
		driver.navigate().refresh();
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div/div[2]/div[3]/div/p")));
		String rc=element.getText();
		System.out.println(rc.equalsIgnoreCase("ComboChild2"));
		System.out.println(rc+" is visible");
		
		
		//@Individual Courses heading
		js.executeScript("window.scrollBy(0,200)", "");
		String individualCrsH4=driver.findElement(By.cssSelector("div.crs-heading:nth-child(9)")).getText();
		System.out.println(individualCrsH4.equalsIgnoreCase("Individual Course"));
		System.out.println(individualCrsH4+" heading4 is visible");
		
		element=driver.findElement(By.cssSelector("div.ic-container:nth-child(70) > div:nth-child(4) > div:nth-child(1) > p:nth-child(1)"));
		actions.moveToElement(element);
		actions.perform();
		String crsN3=element.getText();
		System.out.println(crsN3+" is visible");
		
		
		/*
		//@Opening the course
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div/div[68]/div[5]/button")).click();
		//element.click();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='accordion']/div[1]/div[1]/h4")).click();
		driver.close();
		*/
		
	}
	
	public static void myExplore(WebDriver driver, WebDriverWait wait, WebElement element, JavascriptExecutor js) throws InterruptedException{		
		//@Explore heading
		String exploreH1=driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div[1]/div/div[4]/span")).getText();
		System.out.println(exploreH1.equalsIgnoreCase("Explore"));
		System.out.println(exploreH1+" heading is visible");
		
		//@TRENDING course heading
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[2]/p")));
		String trndCrsH2=element.getText();
		System.out.println(trndCrsH2.equalsIgnoreCase("Trending Courses"));
		System.out.println(trndCrsH2+" heading is visible");
		
		//@treding course name
		String trndCrs1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tc_carousel_container_id']/div[1]/div[1]/div/div[3]/div[1]/div/div"))).getText();
		System.out.println(trndCrs1.equalsIgnoreCase("AdaptiveCourse"));
		System.out.println(trndCrs1+" is visible");
		
		//@trending course sliding
		driver.findElement(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[2]/div/button[2]/img")).click();
		String trndCrs2=driver.findElement(By.xpath("//*[@id='tc_carousel_container_id']/div[2]/div[1]/div/div[3]/div[1]/div/div")).getText();
		System.out.println(trndCrs2.equalsIgnoreCase("Appium Automation Testing"));
		System.out.println(trndCrs2+" is visible");
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[2]/div/button[1]/img")));
		element.click();
		String trndCrs3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tc_carousel_container_id']/div[1]/div[1]/div/div[3]/div[1]/div/div"))).getText();
		System.out.println(trndCrs3.equalsIgnoreCase("AdaptiveCourse"));
		System.out.println(trndCrs3+" is visible");

		js.executeScript("window.scrollBy(0,200)", "");
		
		//@FREE course heading
		String frCrsH3=driver.findElement(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[5]/p")).getText();
		System.out.println(frCrsH3.equalsIgnoreCase("Free Courses"));
		System.out.println(frCrsH3+" heading is visible");
			
		//@free course name
		String frCrs1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fc_carousel_container_id']/div[1]/div[1]/div/div[3]/div[1]/div/div"))).getText();
		System.out.println(frCrs1.equalsIgnoreCase("Adaptive Course New"));
		System.out.println(frCrs1+" is visible");
			
		//@free course sliding
		driver.findElement(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[5]/div/button[2]/img")).click();
		String frCrs2=driver.findElement(By.xpath("//*[@id='fc_carousel_container_id']/div[2]/div[1]/div/div[3]/div[1]/div/div")).getText();
		System.out.println(frCrs2.equalsIgnoreCase("AdaptiveCourseNew1"));
		System.out.println(frCrs2+" is visible");
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[5]/div/button[1]/img")));
		element.click();
		String frCrs3= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fc_carousel_container_id']/div[1]/div[1]/div/div[3]/div[1]/div/div"))).getText();
		System.out.println(frCrs3.equalsIgnoreCase("Adaptive Course New"));
		System.out.println(frCrs3+" is visible");

		
		js.executeScript("window.scrollBy(0,400)", "");
		
		//@Featured Groups
		String fGrps=driver.findElement(By.xpath("//*[@id='fg_carousel_container_id']/div[1]/div[1]/div/div[2]/div/div/div")).getText();
		System.out.println(fGrps.equalsIgnoreCase("blues"));
		System.out.println(fGrps+" heading is visible");
		
		//featured Group name
		String ftGrp=driver.findElement(By.xpath("//*[@id='fg_carousel_container_id']/div[1]/div[1]/div/div[2]/div/div/div")).getText();
		System.out.println(ftGrp.equalsIgnoreCase("blues"));
		System.out.println(ftGrp+" is visible");
		
		//View Group(58)
		element=driver.findElement(By.xpath("//*[@id='fg_carousel_container_id']/div[1]/div[2]/div/div[2]/button"));
		String vGrp=element.getText();
		System.out.println(vGrp.equalsIgnoreCase("View Group"));
		System.out.println(vGrp+" is visible");
		Thread.sleep(500);
		
		//jumping into view group(59)
		element.click();
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div/div[1]/div/div[1]/p")));
		String gName=element.getText();
		System.out.println(gName.equalsIgnoreCase("EPL\n" +"Group Code: 261895"));
		System.out.println(gName+" is visible");
		
		//@back from group
		driver.findElement(By.xpath("//*[@id='root']/div/div[4]/p")).click();		
		
		//@featured group sliding
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[8]/div[2]/button[2]/img"))).click();
		Thread.sleep(1000);
		
		//@Join Group
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fg_carousel_container_id']/div[2]/div[1]/div/div[2]/button"))).click();
		System.out.println("Clicked on Join Group button");
		
		//@Cancel button
		Thread.sleep(1500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/button[1]"))).click();
		System.out.println("Clicked on cancel button");
		
		//@Join group again
		Thread.sleep(1500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fg_carousel_container_id']/div[2]/div[1]/div/div[2]/button"))).click();		//Group Name PopUp validation
		
		//@Group Name in PopUp
		String gName1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div[2]/div[1]"))).getText();
		System.out.println(gName1.equalsIgnoreCase("linus"));
		System.out.println(gName1+" is visible");
		
		//@Join group button
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/button[2]")).click();
		
		//@back from group
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[4]/p"))).click();		
		
		//@featured group sliding
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[8]/div[2]/button[2]/img"))).click();
		
		//@checking view group enabled
		Thread.sleep(1000);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fg_carousel_container_id']/div[2]/div[1]/div/div[2]/button")));
		String vGrp1=element.getText();
		System.out.println(vGrp1.equalsIgnoreCase("View Group"));
		System.out.println(vGrp1+" is enabled and visible");
		
		//jumping into joined group
		element.click();		
		
		//leaving the group
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leave-btn']"))).click();
		
		//No for leaving
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-n']"))).click();
		
		//Yes for leaving
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leave-btn']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-y']"))).click();
		
		//@Validation message for leaving group
		String vldMsg=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[1]/div[2]/p[2]"))).getText();
		System.out.println(vldMsg.equalsIgnoreCase("Your attempt to leave the group was successful."));
		System.out.println(vldMsg+" MESSAGE is visible");
		
		//@click on cross icon on validation popup
		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[3]/img")).click();
		
		//@Explore Screen
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[4]/div/ul/a[4]/li"))).click();
		element=driver.findElement(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[11]/div[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		js.executeScript("window.scrollBy(0,300)", "");
		
		//@Trending group heading
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[11]/div[1]")));
		String trndgrp=element.getText();
		System.out.println(trndgrp.equalsIgnoreCase("Trending Groups"));
		System.out.println(trndgrp+" heading is visible");

		//@View Group
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tg_carousel_container_id']/div[1]/div[2]/div/div[2]/button")));
		String vGrp2=element.getText();
		System.out.println(vGrp2.equalsIgnoreCase("View Group"));
		System.out.println(vGrp2+" is visible");
		Thread.sleep(500);
		
		//jumping into view group
		element.click();
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div/div[1]/div/div[1]/p")));
		String gName2=element.getText();
		System.out.println(gName2.equalsIgnoreCase("sending\n" +"Group Code: 214937"));
		System.out.println(gName2);
	
		//@back from group
		driver.findElement(By.xpath("//*[@id='root']/div/div[4]/p")).click();
		
		//@Trending group sliding
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[11]/div[2]/button[2]/img"))).click();
		Thread.sleep(1000);
		
		//@Join Group
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tg_carousel_container_id']/div[2]/div[1]/div/div[2]/button"))).click();
		System.out.println("Clicked on Join Group button");
		
		//@Cancel button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/button[1]"))).click();
		System.out.println("Clicked on cancel button");
		
		//js.executeScript("window.scrollBy(0,150)", "");
		//@Join group again
		Thread.sleep(2000);//////YAHA FASA HUA THA KAL STARTS FROM HERE
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tg_carousel_container_id']/div[2]/div[1]/div/div[2]/button"))).click();
		
		//@Group Name in PopUp
		String gName3=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div[2]/div[1]"))).getText();
		System.out.println(gName3.equalsIgnoreCase("Brad Video"));
		System.out.println(gName3+" is visible");
		
		//@Join group button
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/button[2]")).click();
		
		//@back from group
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[4]/p"))).click();
		
		//@Trending group sliding
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[11]/div[2]/button[2]/img"))).click();
		Thread.sleep(1000);
		
		//@checking view group enabled
		Thread.sleep(1000);
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tg_carousel_container_id']/div[2]/div[1]/div/div[2]/button")));
		String vGrp3=element.getText();
		System.out.println(vGrp3.equalsIgnoreCase("View Group"));
		System.out.println(vGrp3+" is enabled and visible");
		
		//jumping into joined group
		element.click();		
		
		//leaving the group
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leave-btn']"))).click();
		
		//No for leaving
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-n']"))).click();
		
		//Yes for leaving
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leave-btn']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-y']"))).click();
		
		//@Validation message for leaving group
		String vldMsg1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[1]/div[2]/p[2]"))).getText();
		System.out.println(vldMsg1.equalsIgnoreCase("Your attempt to leave the group was successful."));
		System.out.println(vldMsg1+" MESSAGE is visible");
		
		//@click on cross icon on validation popup
		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[3]/img")).click();
		
	}	

	
	public static void joinGroup(WebDriver driver, WebDriverWait wait, WebElement element, JavascriptExecutor js) throws InterruptedException {
		
		//@Join Group heading(85)
		String jnGrpH1=driver.findElement(By.xpath("//*[@id='root']/div/div[3]/div[1]/div/div[4]/span")).getText();
		System.out.println(jnGrpH1.equalsIgnoreCase("Join Group"));
		System.out.println(jnGrpH1+" heading is visible");
		
		//@Group Code heading
		String jnGrpH2=driver.findElement(By.xpath("//*[@id='grp_container_id']/div/div[2]/div/div/div/p[1]")).getText();
		System.out.println(jnGrpH2.equalsIgnoreCase("Group Codes"));
		System.out.println(jnGrpH2+" heading is visible");
		
		//@Group Code description(86)
		String grpCdDesc=driver.findElement(By.xpath("//*[@id='grp_container_id']/div/div[2]/div/div/div/p[2]")).getText();
		System.out.println(grpCdDesc.equalsIgnoreCase("Learning in Eckovation happens in Learning Groups.\nEach Learning Group is identified with a unique 6-digit Group Code. Join a Learning Group by entering its Group Code."));
		System.out.println(grpCdDesc+" DESCRIPTION is visible");
		
		//@Enter Group Code heading
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div[2]/div/div[1]/form/label")));
		String jnGrpH3=element.getText();
		System.out.println(jnGrpH3.equalsIgnoreCase("Enter Group Code"));
		System.out.println(jnGrpH3+" heading is visible");
		
		//@Entering group code(88,89)
		WebElement elementTxt=driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div[2]/div/div[1]/form/input[1]"));
		elementTxt.sendKeys("sarthak");
		System.out.println(elementTxt.getText().equalsIgnoreCase("")+" because not able to add alphabets");
		elementTxt.clear();
		
		/*
		//@Entering more than 6 digits(90)
		elementTxt.sendKeys("123456");
		System.out.println(element.getText().equalsIgnoreCase("123456")+" because not able to add more than 6 digits");
		elementTxt.clear();*/
		
		//@Join group button(91)
		element=driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div[2]/div/div[1]/form/input[2]"));
	//	System.out.println(element.isEnabled()+" because JOIN GRP button is visible");
		
		Thread.sleep(8000);
		//Click on Join Group blank(92)
		element.click();
		String error1=driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div[2]/div/div[1]/form/p[1]")).getText();
		System.out.println(error1.equalsIgnoreCase("Please enter a valid group code"));
		System.out.println(error1+" VALIDATION ERROR is visible");
		
		//Click with invalid group code(93)
		elementTxt.clear();
		Thread.sleep(1000);
		elementTxt.sendKeys("123457");
		element.click();
		Thread.sleep(1500);
		String error2=driver.findElement(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div[2]/div/div[1]/form/p[1]")).getText();
		System.out.println(error2.equalsIgnoreCase("Group Code is incorrect"));
		System.out.println(error2+" VALIDATION ERROR is visible");
		
		//click with valid group code
		elementTxt.clear();
		elementTxt.sendKeys("123456");
		element.click();
		
		
		/*js.executeScript("window.scrollBy(0,100)", "");
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,200)", "");
		*/
		Thread.sleep(5000);
		/*
		//@Featured Groups
				String fGrps=driver.findElement(By.xpath("//*[@id='fg_carousel_container_id']/div[1]/div[1]/div/div[2]/div/div/div")).getText();
				System.out.println(fGrps.equalsIgnoreCase("blues"));
				System.out.println(fGrps+" heading is visible");
				
				//featured Group name
				String ftGrp=driver.findElement(By.xpath("//*[@id='fg_carousel_container_id']/div[1]/div[1]/div/div[2]/div/div/div")).getText();
				System.out.println(ftGrp.equalsIgnoreCase("blues"));
				System.out.println(ftGrp+" is visible");
				
				//View Group(58)
				element=driver.findElement(By.xpath("//*[@id='fg_carousel_container_id']/div[1]/div[2]/div/div[2]/button"));
				String vGrp=element.getText();
				System.out.println(vGrp.equalsIgnoreCase("View Group"));
				System.out.println(vGrp+" is visible");
				Thread.sleep(500);
				
				//jumping into view group(59)
				element.click();
				element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div/div[1]/div/div[1]/p")));
				String gName=element.getText();
				System.out.println(gName.equalsIgnoreCase("EPL\n" +"Group Code: 261895"));
				System.out.println(gName+" is visible");
				
				//@back from group
				driver.findElement(By.xpath("//*[@id='root']/div/div[4]/p")).click();		
				
				//@featured group sliding
				wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.carousel-header:nth-child(2) > div:nth-child(2) > button:nth-child(2) > img:nth-child(1)"))).click();										
				Thread.sleep(1000);
				
				//@Join Group
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[7]/div[1]/div[3]/div[2]/div/div[2]/div[1]/div/div[2]/button"))).click();
				System.out.println("Clicked on Join Group button");
				
				//@Cancel button
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/button[1]"))).click();
				System.out.println("Clicked on cancel button");
				
				//@Join group again
				Thread.sleep(1500);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fg_carousel_container_id']/div[2]/div[1]/div/div[2]/button"))).click();		//Group Name PopUp validation
				
				//@Group Name in PopUp
				String gName1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div[2]/div[1]"))).getText();
				System.out.println(gName1.equalsIgnoreCase("linus"));
				System.out.println(gName1+" is visible");
				
				//@Join group button
				driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/button[2]")).click();
				
				//@back from group
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[4]/p"))).click();		
				
				//@featured group sliding
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[3]/div[1]/div[2]/button[2]/img"))).click();
				
				//@checking view group enabled
				Thread.sleep(1000);
				element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fg_carousel_container_id']/div[2]/div[1]/div/div[2]/button")));
				String vGrp1=element.getText();
				System.out.println(vGrp1.equalsIgnoreCase("View Group"));
				System.out.println(vGrp1+" is enabled and visible");
				
				//jumping into joined group
				element.click();		
				
				//leaving the group
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leave-btn']"))).click();
				
				//No for leaving
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-n']"))).click();
				
				//Yes for leaving
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leave-btn']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-y']"))).click();
				
				//@Validation message for leaving group
				String vldMsg=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[1]/div[2]/p[2]"))).getText();
				System.out.println(vldMsg.equalsIgnoreCase("Your attempt to leave the group was successful."));
				System.out.println(vldMsg+" MESSAGE is visible");
				
				//@click on cross icon on validation popup
				driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[3]/img")).click();
				
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[4]/div/ul/a[5]/li"))).click();
				
				js.executeScript("window.scrollBy(0,100)", "");
				Thread.sleep(500);
				js.executeScript("window.scrollBy(0,200)", "");
			
				
				//@Trending group heading
				element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[2]/div[11]/div[1]")));
				String trndgrp=element.getText();
				System.out.println(trndgrp.equalsIgnoreCase("Trending Groups"));
				System.out.println(trndgrp+" heading is visible");

				//@View Group
				element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tg_carousel_container_id']/div[1]/div[2]/div/div[2]/button")));
				String vGrp2=element.getText();
				System.out.println(vGrp2.equalsIgnoreCase("View Group"));
				System.out.println(vGrp2+" is visible");
				Thread.sleep(500);
				
				//jumping into view group
				element.click();
				element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div/div[1]/div/div[1]/p")));
				String gName2=element.getText();
				System.out.println(gName2.equalsIgnoreCase("sending\n" +"Group Code: 214937"));
				System.out.println(gName2);
			
				//@back from group
				driver.findElement(By.xpath("//*[@id='root']/div/div[4]/p")).click();
				
				//@Trending group sliding
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[3]/div[4]/div[2]/button[2]/img"))).click();
				Thread.sleep(1000);
				
				//@Join Group
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tg_carousel_container_id']/div[2]/div[1]/div/div[2]/button"))).click();
				System.out.println("Clicked on Join Group button");
				
				//@Cancel button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/button[1]"))).click();
				System.out.println("Clicked on cancel button");
				
				//js.executeScript("window.scrollBy(0,150)", "");
				//@Join group again
				Thread.sleep(2000);//////YAHA FASA HUA THA KAL STARTS FROM HERE
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tg_carousel_container_id']/div[2]/div[1]/div/div[2]/button"))).click();
				
				//@Group Name in PopUp
				String gName3=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div[2]/div[1]"))).getText();
				System.out.println(gName3.equalsIgnoreCase("Brad Video"));
				System.out.println(gName3+" is visible");
				
				//@Join group button
				driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/button[2]")).click();
				
				//@back from group
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[4]/p"))).click();
				
				//@Trending group sliding
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[7]/div[1]/div[3]/div[4]/div[2]/button[2]/img"))).click();
				Thread.sleep(1000);
				
				//@checking view group enabled
				Thread.sleep(1000);
				element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tg_carousel_container_id']/div[2]/div[1]/div/div[2]/button")));
				String vGrp3=element.getText();
				System.out.println(vGrp3.equalsIgnoreCase("View Group"));
				System.out.println(vGrp3+" is enabled and visible");
				
				//jumping into joined group
				element.click();		
				
				//leaving the group
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leave-btn']"))).click();
				
				//No for leaving
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-n']"))).click();
				
				//Yes for leaving
				Thread.sleep(1000);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='leave-btn']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-y']"))).click();
				
				//@Validation message for leaving group
				String vldMsg1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[1]/div[2]/p[2]"))).getText();
				System.out.println(vldMsg1.equalsIgnoreCase("Your attempt to leave the group was successful."));
				System.out.println(vldMsg1+" MESSAGE is visible");
				
				//@click on cross icon on validation popup
				driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[3]/img")).click();
*/
				
		
		
	}
	
	
	public static void main(String...s) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","D:/Sarthak/Work/Selenium Work/chromedriver_win32/chromedriver.exe");

		WebDriver driver=new ChromeDriver();WebDriverWait wait=new WebDriverWait(driver,15);WebElement element = null;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://wt1.eckovation.com");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginOldUser(driver,wait,element);
		//myCourses(driver,wait,element,js,actions);
		//Thread.sleep(5000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[4]/div/ul/a[4]/li"))).click();
		//System.out.println("Clicked on Explore Screen");
		//myExplore(driver,wait,element,js);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div[4]/div/ul/a[5]/li"))).click();
		joinGroup(driver,wait,element,js);
		driver.close();
		
	}
}

 /*
 @left to right
 Actions action= new Actions(driver);
 action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
 
 @right to left
 Actions action= new Actions(driver);
 action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
  */