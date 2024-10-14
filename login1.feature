Feature: Login into itlearn360
  
  Scenario: login Functionality
  
    Given user able to launch url
    When user click sign in button
    And User able to enter valid username
    And user able to enter valid password
    And user able to click the login button
    Then user navigate to there account page
    
    Scenario:  Courses and Learning Programs mousehover functionality in Software Testing Academy
    
   	Given User click the All courses
   	When  cloud academy
   	And Devops Academy
   	And  Software Testing Academy
   	And Mastering Selenium WebDriver with Java
   	And Mastering Manual Testing Fundamentals
   	And Automation Testing with TestNG
   	And Learn Git – Version Control
   	And Database SQL Testing for Software Testers
   	And Agile Methodology for Software Testers
   	And Master of Software Testing
   	And Master of Manual Testing
   	And Master of Automation Testing
   	And SDET: Master Software Development & Testing
   	Then user Scroll down the page
   	
   	
   	 Scenario:  User checks the subcription Link
   	 
   	 Given User enter the valid email
   	 When user clicks the subscibe button
   	 Then User able to see your subcription was sucessfull
   
	   Scenario:  User checks the Social Media Link
	   
	   Given User Clicks the Facebook Link
	   And user able to navigate the facebook page
	   Then User able to navigate view the Home page
	   
	   Scenario:  User checks the Youtube Link
	   
	   Given User Clicks the youtube Link
	   And user able to view the youtube page
	   Then User able to navigate back to Home page
	   
	   Scenario:  User checks the Linkedin Link
	   
	   Given User Clicks the Linkedin Link
	   And user able to view the linkedin page
	   And User able to navigate back to Home page
	   Then user Scroll up the page
	   
	   Scenario:  User checks the Header Link
	    
	    Given User clicks the Blog link
	    When User navigate to Blog page
	    And user clicks the upcoming events
	    And user navigate to upcoming events page 
	    And user clicks the contact us page
	    And user navigate to contact us page
	    And user clicks to my dashboard page
	    Then user navigate to my dashboard page
	   
	  	Scenario: Logout functionality
	   	Given User Click the logout button
	   	And user navigate to home page
	   	Then User close the browser 
	    
   
   
	  
	   
	    
	   
	   
	   
	    
	   
	   
	   
	   
	   
	   
	   
	   