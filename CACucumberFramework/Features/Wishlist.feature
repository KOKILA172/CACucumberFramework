Feature: Wishlist


Scenario: To see the wishlist
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	Then User should be able to see the wishlist
	Then close browser