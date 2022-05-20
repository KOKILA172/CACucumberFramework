Feature: Trackorder


Scenario: Users are able to track the order
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	Then User clicks on the track order to track the order
	Then close browser