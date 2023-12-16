Feature: Login Functionality


  Scenario: Successful login
    Given I am on the login page
    When I enter my valid username 'abc@gmail.com'
    When I enter my valid password 'Tester'
    And click the login button
    Then I should be redirected to the dashboard
    And I should see a welcome message

  Scenario Outline: Successful login
    Given I am on the login page
    When I enter my valid username '<username>'
    When I enter my valid password '<password>'
    And click the login button
    Then I should be redirected to the dashboard
    And I should see a welcome message
    Examples:
      |username       |password|
      |abc@gmail.com  |tester|
      |xyz@gmail.com  |tester|
      |def@gmail.com  |tester|

