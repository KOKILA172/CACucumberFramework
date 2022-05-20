Feature: Navigating


Scenario: Navigation from one category to another
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	Then User should be able navigate from one product to another
	Then close browser