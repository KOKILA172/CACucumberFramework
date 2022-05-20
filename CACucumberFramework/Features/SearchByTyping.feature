Feature: Searching


Scenario: Search the products by typing on search column
	Given User Launch Chrome browser 
	When User opens url "https://www.urbanladder.com/" 
	Then user searches required products "aria table runner"
	And clicks on the search icon
	Then close browser