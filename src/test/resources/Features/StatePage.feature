Feature: State page features

  Scenario: Verify the elements on the InsurePro landing page
    Given user is on insurepro state page
    When user gets the title of the insurepro state page
    When insurepro state page title should be "State"
    And insurepro state page should contain "Search for State" dropdown
    And insurepro state page should contain "Continue" button

  Scenario: Verify the State dropdown and the Continue button on the state page
    Given user is on insurepro state page
    Then select "Florida" as the state
    And click on the Continue button on the insurepro state page
    Then user should navigate from state page to the next page and title should be "Profession"