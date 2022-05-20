Feature: Addtocart


Scenario: See the added products in the card
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	Then User clicks on the cart 
	Then close browser