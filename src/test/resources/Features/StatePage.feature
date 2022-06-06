Feature: State page features

  @TEST_IM-638 @TestCase
  Scenario: Verify the elements on the InsurePro state page
    Given user is on insurepro state page
    When user gets the title of the insurepro state page
    When insurepro state page title should be "State"
    And insurepro state page should contain "Search for State" dropdown
    And insurepro state page should contain "Continue" button

  @TEST_IM-639 @TestCase
  Scenario: Verify the State dropdown and the Continue button on the state page
    Given user is on insurepro state page
    Then select "florida" as the state
    And click on the Continue button on the insurepro state page
    Then user should navigate from state page to the next page and title should be "Profession"
