@customerservice 
Feature: customer service verification 
Scenario Outline: ciustomer service functional testing 
	Given User able to go home apge 
	When user able to click customer service 
	Then user should go customer service page successfully 
	When I click on digital service and support 
	And I search by entering a "<term>" and click go button 
	Then I receive relevant result 
	
	Examples: 
		|term|
		|return item|
		|billing questions|
		|past order questions|