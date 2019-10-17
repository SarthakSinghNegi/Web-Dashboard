import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EnrollNow extends CourseLandingPage {
	
	
	
	public static void negativeSignUp(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/section[3]/div/div/div[3]/button")).click();
		driver.findElement(By.cssSelector("input#name")).sendKeys("EckTeam");
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("98171477901");
		driver.findElement(By.cssSelector("#email")).sendKeys("sarthak@eckovation.com");
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(5) > button:nth-child(1)")).click();
		Thread.sleep(1000);
		String wrongPh=driver.findElement(By.cssSelector("form.user-valid > div:nth-child(2) > div:nth-child(4) > p:nth-child(1)	")).getText();
		System.out.println(wrongPh.equalsIgnoreCase("Invalid Phone Number"));
		System.out.println(wrongPh+" is visible");
		
		
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).clear();
		driver.findElement(By.cssSelector("select.user-valid")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select.user-valid:nth-child(1) > option:nth-child(2)")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("select.user-valid")).click();
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("9817147790");
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("sarthak@eckovation.com");
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(5) > button:nth-child(1)")).click();
		Thread.sleep(1000);
		String wrongPh1=driver.findElement(By.cssSelector("form.user-valid > div:nth-child(2) > div:nth-child(4) > p:nth-child(1)	")).getText();
		System.out.println(wrongPh1.equalsIgnoreCase("Invalid Phone Number"));
		System.out.println(wrongPh1+" is visible");
		Thread.sleep(1500);
		
		
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).clear();
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("9817147790");
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("sfxoc@dsij");
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(5) > button:nth-child(1)")).click();
		Thread.sleep(1000);
		String wrongEmail=driver.findElement(By.cssSelector("form.user-valid > div:nth-child(2) > div:nth-child(4) > p:nth-child(1)	")).getText();
		System.out.println(wrongEmail.equalsIgnoreCase("Invalid email ID"));
		System.out.println(wrongEmail+" is visible");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/amp-lightbox[5]/div/div/div/div/amp-img/img")).click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		//@For USD payment
		WebDriver driver=CourseLandingPage.landingPage();
		String priceIND=driver.findElement(By.xpath("/html/body/section[3]/div/div/div[1]/div/span")).getText();
		System.out.println(priceIND.equalsIgnoreCase("?2,000"));
		System.out.println("price is "+priceIND+" for INDIA");
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,200)", "");
		
		//Function calling
		negativeSignUp(driver);
		
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".country-select > form:nth-child(1) > select:nth-child(2)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='country']/option[@value='USD']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".country-select > form:nth-child(1) > select:nth-child(2)")).click();
		Thread.sleep(1000);
		js1.executeScript("window.scrollBy(0,200)", "");
		
		String priceUSD=driver.findElement(By.xpath("/html/body/section[3]/div/div/div[1]/div/span")).getText();
		System.out.println(priceUSD.equalsIgnoreCase("$9"));
		System.out.println(priceUSD);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/section[3]/div/div/div[3]/button")).click();
		driver.findElement(By.cssSelector("input#name")).clear();
		driver.findElement(By.cssSelector("input#name")).sendKeys("EckTeam");
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).clear();
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > input:nth-child(1)")).sendKeys("9817147790");
		driver.findElement(By.cssSelector("#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("sarthak@eckovation.com");
		driver.findElement(By.cssSelector("div.i-amphtml-fill-content > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(2) > div:nth-child(5) > button:nth-child(1)")).click();
		//String invalidno=driver.findElement(By.cssSelector("form.user-valid > div:nth-child(2) > div:nth-child(4) > p:nth-child(1)")).getText();
		//System.out.println(invalidno);
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("amp-date-countdown.i-amphtml-element")).isDisplayed()+" is display");
		Thread.sleep(2000);//@otherwise will show interactable Exception
		driver.findElement(By.cssSelector("button.get-on-call:nth-child(4)")).click();
		
		//@explicitWait
		WebDriverWait wait=new WebDriverWait(driver, 5);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".visible > p:nth-child(1)")));
		String waitOTP=element.getText();
		System.out.println(waitOTP.equalsIgnoreCase("Please retry after 30 sec"));
		System.out.println(waitOTP);
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.get-on-call:nth-child(7)")).click();
		String waitOTP1=driver.findElement(By.cssSelector(".visible > p:nth-child(1)")).getText();
		System.out.println(waitOTP1.equalsIgnoreCase("Please retry after 30 sec"));
		System.out.println(waitOTP1);
		
		Thread.sleep(31000);
		//implicitWait
		//driver.manage().timeouts().implicitlyWait(31, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button.get-on-call:nth-child(4)")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		String waitOTP2=driver.findElement(By.cssSelector(".visible > p:nth-child(1)")).getText();
		Thread.sleep(1000);
		System.out.println(waitOTP2.equalsIgnoreCase("You will receive a OTP shortly"));
		System.out.println(waitOTP2);
		
		driver.findElement(By.cssSelector("#otp")).sendKeys("133476");
		driver.findElement(By.xpath("//button[@id='request-verify-button']")).click();
		
		//@invalid OTP
		Thread.sleep(2000);
		String invalidOTP=driver.findElement(By.cssSelector(".visible > p:nth-child(1)")).getText();
		System.out.println(invalidOTP.equalsIgnoreCase("OTP submitted is invaid."));
		System.out.println(invalidOTP+" is visible");


		driver.findElement(By.cssSelector("#otp")).clear();
		driver.findElement(By.cssSelector("#otp")).sendKeys("133496");
		driver.findElement(By.xpath("//button[@id='request-verify-button']")).click();

		
		Thread.sleep(2000);
		String price=driver.findElement(By.cssSelector("div.col-md-3:nth-child(4) > h3:nth-child(1) > span:nth-child(2)")).getText();
		System.out.println(price.equalsIgnoreCase("9"));
		System.out.println(price+" before coupon apply");
		
		
		//@67->Invalid Coupon
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".coupan-input")).sendKeys("WOMENDDAY99");
		driver.findElement(By.xpath("//button[@class='apply']")).click();
		Thread.sleep(1000);
		String iCoupon=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div/span")).getText();
		System.out.println(iCoupon.equalsIgnoreCase("Invalid Parameters."));
		System.out.println(iCoupon+" is visible");


		//@68->Expired Coupon
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".coupan-input")).clear();
		driver.findElement(By.cssSelector(".coupan-input")).sendKeys("BHARATRAWAT");
		driver.findElement(By.xpath("//button[@class='apply']")).click();
		Thread.sleep(1000);
		String eCoupon=driver.findElement(By.cssSelector("span.ng-scope:nth-child(2)")).getText();
		System.out.println(eCoupon.equalsIgnoreCase("Coupon Code Has Expired"));
		System.out.println(eCoupon+" is visible");
		
		//Coupon Code Has Expired
		//		
		
		//69->Valid Coupon
		driver.findElement(By.cssSelector(".coupan-input")).clear();
		driver.findElement(By.cssSelector(".coupan-input")).sendKeys("WOMENSDAY99");
		driver.findElement(By.xpath("//button[@class='apply']")).click();
		Thread.sleep(1000);
		String vCoupon=driver.findElement(By.cssSelector("span.ng-scope:nth-child(2) > em:nth-child(1)")).getText();
		System.out.println(vCoupon.equalsIgnoreCase("*Coupon Code Applied"));
		System.out.println(vCoupon+" is visible");
		
		Thread.sleep(1000);
		String price1=driver.findElement(By.cssSelector("div.col-md-3:nth-child(4) > h3:nth-child(1) > span:nth-child(2)")).getText();
		System.out.println(price1.equalsIgnoreCase("1"));
		System.out.println(price1+" after coupon applies");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".paypal-button")).click();
		Thread.sleep(1500);
		
	
		
		
		
		//driver.quit();
		
		driver.findElement(By.cssSelector("html.ng-scope body.ng-scope div#payment div.container.checkout-container.ng-scope div.col-md-offset-2.col-md-8 div.row.tac.ng-scope div#mode-list-desktop.mode-list div.mode-card div.mode-img-wrapper.sel-mode")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\'modal-close\']")).click();
		driver.findElement(By.cssSelector("div.option:nth-child(2) > div:nth-child(2)")).click();
		driver.findElement(By.cssSelector("div.payment-option:nth-child(1) > label:nth-child(1) > i:nth-child(1) > svg:nth-child(1) > path:nth-child(1)")).click();
		driver.findElement(By.cssSelector("div.payment-option:nth-child(2) > label:nth-child(1) > span:nth-child(2)")).click();
		
		driver.findElement(By.xpath("//*[@id='netb-banks']/div[1]/label")).click();
		driver.findElement(By.cssSelector("//label[@for='bank-radio-SBIN']")).click();
		driver.findElement(By.xpath("//span[@class='otp-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='success']")).click();
		driver.findElement(By.xpath("//div[@id='payment-options']/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\'modal-close\']")).click();
		
		
		
		
		
		
	}

}
