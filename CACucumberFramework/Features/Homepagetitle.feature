Feature: Titlevalidating


Scenario: Validating the titles in Homepage
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	And user can view the titles of the page "Stores"
Then close browser