Feature: Login 


Scenario: Successful Login with valid Credentials 
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	And user clicks on the login link 
	And User enters email as "k9986172oki@gmail.com" and password as "Kokila1@" 
	And click on Login 

	Then close browser
	
	
