Feature: GiftCards


Scenario: To know about the company details
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	Then User can view the giftcards offered
	Then close browser