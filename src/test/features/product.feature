Feature: Add to Cart Functionality


  Scenario: I want to add a product of my choice into Cart
    Given I am on shopping website
    When I select a product that I want to purchase from list of products
    Then I select size of the product that I chose
    And I select color of the same product
    Then I add product to the cart
    And I click on add to Cart
    And I click on Proceed To Checkout
#    And I want to enter email address on shipping detail page

#  Scenario: I want to add shipping details at checkout Page
#  Given I have added product to Cart
#  When I select the added Cart
#  Then

#  Scenario: I want to enter all details on checkout page
#    Given I am on add to cart page
#    When I select add to cart page so that I can be redirected to Proceed to Checkout
#    Then I click on Proceed to Checkout
#    And I enter all shipping details


#  Scenario: Successful login
#    Given I am on the login page
#    When I enter my valid username 'abc@gmail.com'
#    When I enter my valid password 'Tester'
#    And click the login button
#    Then I should be redirected to the dashboard
#    And I should see a welcome message
#
#  Scenario Outline: Successful login
#    Given I am on the login page
#    When I enter my valid username '<username>'
#    When I enter my valid password '<password>'
#    And click the login button
#    Then I should be redirected to the dashboard
#    And I should see a welcome message
#    Examples:
#      |username       |password|
#      |abc@gmail.com  |tester|
#      |xyz@gmail.com  |tester|
#      |def@gmail.com  |tester|

