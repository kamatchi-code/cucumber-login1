package org.stepdefinitionlogin1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.com.Base_Demo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomitlearn.demo.Coursesmousehover_POM;
import pomitlearn.demo.Header_POM;
import pomitlearn.demo.Logout_POM;
import pomitlearn.demo.Signin_POM;
import pomitlearn.demo.SocialMedia_POM;
import pomitlearn.demo.SoftwareTestingAcademy_POM;
import pomitlearn.demo.Subscribe_POM;

public class itlearn_stepdefinelogin1 extends Base_Demo {
	Signin_POM sp= new Signin_POM(driver);
	Coursesmousehover_POM cp=new Coursesmousehover_POM(driver);
	SoftwareTestingAcademy_POM st = new SoftwareTestingAcademy_POM(driver);
	Subscribe_POM sbc = new Subscribe_POM(driver);
	SocialMedia_POM sm =new SocialMedia_POM(driver);
	Header_POM hp = new Header_POM(driver);
	Logout_POM lp = new Logout_POM(driver);
	
	
	@Given("user able to launch url")
	public void user_able_to_launch_url() {
		  Url("https://www.itlearn360.com/");
	   
	}
	@When("user click sign in button")
	public void user_click_sign_in_button() {
	    Click(sp.getSign());
	}
	@When("User able to enter valid username")
	public void user_able_to_enter_valid_username() {
		ImplicitWait();
		Sendkeys(sp.getUser(),"KAMATCHI11");
	    
	}
	@When("user able to enter valid password")
	public void user_able_to_enter_valid_password() {
		ImplicitWait();
		Sendkeys(sp.getPass(),"KAMATCHI456$");
	    
	}
	@When("user able to click the login button")
	public void user_able_to_click_the_login_button() {
		Click(sp.getLogin());
	}
	@Then("user navigate to there account page")
	public void user_navigate_to_there_account_page() {
	
	}
	
	
	
	//
	
	@Given("User click the All courses")
	public void user_click_the_all_courses() {
		Click(cp.getAllCourses());
	   
	}
	
	@When("cloud academy")
	public void cloud_academy() {
		Action(cp.getCloud());
	    
	}
	@When("Devops Academy")
	public void devops_academy() {
	    Action(cp.getDevops());
	}
	@When("Software Testing Academy")
	public void software_testing_academy() {
	    Action(cp.getSTesting());
	}
	
	@When("Mastering Selenium WebDriver with Java")
	public void mastering_selenium_web_driver_with_java() {
		Action(st.getMasteringSelenium());
	}
	
	@When("Mastering Manual Testing Fundamentals")
	public void mastering_manual_testing_fundamentals() {
		Action(st.getMasteringManual());
	    
	}
	
	@When("Automation Testing with TestNG")
	public void automation_testing_with_test_ng() {
	    Action(st.getAutomationTestNg());
	}
	
	@When("Learn Git – Version Control")
	public void learn_git_version_control() {
	    Action(st.getGit());
	}
	
	@When("Database SQL Testing for Software Testers")
	public void database_sql_testing_for_software_testers() {
	    Action(st.getDatabase());
	}
	
	@When("Agile Methodology for Software Testers")
	public void agile_methodology_for_software_testers() {
	    Action(st.getAgile());
	}
	
	@When("Master of Software Testing")
	public void master_of_software_testing() {
	    Action(st.getMST());
	}
	
	@When("Master of Manual Testing")
	public void master_of_manual_testing() {
	    Action(st.getMMT());
	}
	@When("Master of Automation Testing")
	public void master_of_automation_testing() {
	    Action(st.getMAT());
	}
	@When("SDET: Master Software Development & Testing")
	public void sdet_master_software_development_testing() {
	    Action(st.getSDET());
	}
	@Then("user Scroll down the page")
	public void user_scroll_down_the_page() throws InterruptedException {
		//Scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7000)");
		ImplicitWait();

	}
	
	
// subscribe

	@Given("User enter the valid email")
	public void user_enter_the_valid_email() {
	    Sendkeys(sbc.getEmail(), "Test@gmail.com");
	}
	@When("user clicks the subscibe button")
	public void user_clicks_the_subscibe_button() {
	    Click(sbc.getSubCrib());
	    
	}
	@Then("User able to see your subcription was sucessfull")
	public void user_able_to_see_your_subcription_was_sucessfull() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	//social media
	
	@Given("User Clicks the Facebook Link")
	public void user_clicks_the_facebook_link() throws InterruptedException {
		ImplicitWait();
	    Click(sm.getFb());
	}
	@Given("user able to navigate the facebook page")
	public void user_able_to_navigate_the_facebook_page() {
	    
	}
	@Then("User able to navigate view the Home page")
	public void user_able_to_navigate_view_the_home_page() throws InterruptedException {
	    driver.navigate().back();
	    ImplicitWait();
	}
	
//youtube
	@Given("User Clicks the youtube Link")
	public void user_clicks_the_youtube_link() throws InterruptedException {
		ImplicitWait();
	    Click(sm.getYoutube());
	}
	@Given("user able to view the youtube page")
	public void user_able_to_view_the_youtube_page() {
	   
	}
	@Then("User able to navigate back to Home page")
	public void user_able_to_navigate_back_to_home_page() throws InterruptedException {
		driver.navigate().back();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(3000);
	}
	
	@Given("User Clicks the Linkedin Link")
	public void user_clicks_the_linkedin_link() {
	    Click(sm.getLinkedIN());
	}
	@When("user able to view the linkedin page")
	public void user_able_to_view_the_linkedin_page() {
		
	}
	@Then("user Scroll up the page")
	public void user_scroll_up_the_page() throws InterruptedException {
		driver.navigate().back();
		

	}

	@Given("User clicks the Blog link")
	public void user_clicks_the_blog_link() throws InterruptedException {
		
		WebElement top = driver.findElement(By.xpath("/html/body/div[1]/div/main/article/div[1]/div/div[1]/h1"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView(false)", top);
//		Thread.sleep(2000);
//		JavascriptExecutor js1=(JavascriptExecutor)driver;
//		js1.executeScript("window.scrollBy(0,0)");
//		Thread.sleep(3000);
	    Click(hp.getBlog());
	}
	@When("User navigate to Blog page")
	public void user_navigate_to_blog_page() {
	   
	}
	@When("user clicks the upcoming events")
	public void user_clicks_the_upcoming_events() {
	    Click(hp.getUpcomingevents());
	}
	@When("user navigate to upcoming events page")
	public void user_navigate_to_upcoming_events_page() {
	    
	}
	@When("user clicks the contact us page")
	public void user_clicks_the_contact_us_page() {
	    Click(hp.getContact());
	}
	@When("user navigate to contact us page")
	public void user_navigate_to_contact_us_page() {
	   
	}
	@When("user clicks to my dashboard page")
	public void user_clicks_to_my_dashboard_page() {
	    Click(hp.getDashboard());
	}
	@Then("user navigate to my dashboard page")
	public void user_navigate_to_my_dashboard_page() {
	    
	}
	
	@Given("User Click the logout button")
	public void user_click_the_logout_button() {
	   Click(lp.getLogout());
	}
	@Given("user navigate to home page")
	public void user_navigate_to_home_page() {
	   
	}
	@Then("User close the browser")
	public void user_close_the_browser() {
	    driver.quit();
	}




    
	}












	

