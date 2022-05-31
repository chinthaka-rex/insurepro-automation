@IM-601
Feature: Test Execution - Sample

  @TEST_IM-598 @TestCase
  Scenario: Verify the elements on the InsurePro landing page
    Given user is on insurepro landing page
    When user gets the title of the insurepro landing page
    When insurepro landing page title should be "InsurePro"
    And insurepro landing page should contain "Continuar en español" link
    And insurepro landing page should contain "Get a Quote" button

  @TEST_IM-599 @TestCase
  Scenario: Verify the Get a Quote button
    Given user is on insurepro landing page
    And click on the Get A Quote button
    Then user should navigate to the next page and title should be "InsurePro - Name"