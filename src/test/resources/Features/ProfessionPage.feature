Feature: Profession page features

  @TEST_IM-641 @TestCase
  Scenario: Verify the elements on the InsurePro profession page
    Given user is on insurepro profession page
    When user gets the title of the insurepro profession page
    When insurepro profession page title should be "Profession"
    And insurepro profession page should contain "Search for Profession" dropdown
    And insurepro profession page should contain "Continue" button

  @TEST_IM-642 @TestCase @Smoke
  Scenario: Verify the profession dropdown and the Continue button on the profession page
    Given user is on insurepro profession page
    Then select "House Cleaning" as the profession
    And click on the Continue button on the insurepro profession page
    Then user should navigate from profession page to the next page and title should be "Why are you looking for insurance?"