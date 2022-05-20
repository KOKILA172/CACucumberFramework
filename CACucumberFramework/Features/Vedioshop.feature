Feature: Vedioshop


Scenario: User can shop over the vedio by booking the slots
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	Then User can shop over vedio
	Then close browser