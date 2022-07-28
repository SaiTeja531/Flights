Feature: feature to test login functionality and to select the flight

  Scenario: check login is successful with valid credentials
    Given user is on login page
    When user enters username "sruthiveggalam2@gmail.com" and password "Mounika@2622"
    And clicks on submit button
    Then user should be able to see the message login successfully

  Scenario: user able to select Flight details and Preferences
    Given user able to click on Flights
    When user navigates to the Flight Details
    And user needs to select Type "Round Trip"
    And user needs to select Passengers "4"
    And user needs to select Departing From "Paris"
    And user needs to select On "December 6"
    And user needs to select Arriving In "London"
    And user needs to select Returning "March 6"
    When user navigates to the Preferences
    And user needs to select Service Class "Business"
    And user needs to select Airline "Uniffied Airlines"
    Then user clicks on continue
    Then user able to click on back to home

    
    
    