Feature: State page features

  Scenario: Verify the elements on the InsurePro landing page
    Given user is on insurepro profession page
    When user gets the title of the insurepro profession page
    When insurepro profession page title should be "Profession"
    And insurepro profession page should contain "Search for Profession" dropdown
    And insurepro profession page should contain "Continue" button

  #Scenario: Verify the profession dropdown and the Continue button on the state page
    Given user is on insurepro profession page
    Then select "House Cleaning" as the profession
    And click on the Continue button on the insurepro profession page
    Then user should navigate from profession page to the next page and title should be "Why are you looking for insurance?"