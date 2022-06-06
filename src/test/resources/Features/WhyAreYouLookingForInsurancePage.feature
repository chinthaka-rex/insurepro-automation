Feature: Why are you looking for insurance page features

  @Smoke
  Scenario: Verify the elements on the InsurePro why are you looking for insurance page
    Given user is on insurepro why are you looking for insurance page
    When user gets the title of the insurepro why are you looking for insurance page
    When insurepro why are you looking for insurance page should contain "I need it for my business" button
    And insurepro why are you looking for insurance page should contain "I have a one off job/project" button
    And insurepro why are you looking for insurance page should contain "Continue" button


  Scenario: Verify the flow 2 (I have a one off job/project button) and the Continue button on the why are you looking for insurance page
    Given user is on insurepro why are you looking for insurance page
    Then select "House Cleaning" as the why are you looking for insurance
    And click on the Continue button on the insurepro why are you looking for insurance page
    Then user should navigate from why are you looking for insurance page to the next page and title should be "Why are you looking for insurance?"