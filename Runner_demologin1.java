package org.runnercucumber;

import base.com.Base_Demo;

	
	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.runner.RunWith;
	import org.openqa.selenium.WebDriver;

	import base.com.Base_Demo;
	import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\kamsr\\OneDrive\\Desktop\\itlearnMaven\\src\\test\\resources\\login1.feature",glue="org.stepdefinitionlogin1")

	public class Runner_demologin1  extends Base_Demo {
	public static WebDriver driver;
		
		
		@BeforeClass
		public static void setup() {
			BrowserLaunch();

		}
		
		@AfterClass
		public static void teardown() {
			
			Quit();
			

		}

}
