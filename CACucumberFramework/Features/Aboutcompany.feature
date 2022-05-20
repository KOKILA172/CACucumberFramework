Feature: About company


Scenario: To know about the company details
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	Then User should be able to see the details of the company
	Then close browser