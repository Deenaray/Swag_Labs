Feature: Swaglab shopping site
  @Regression
  Scenario Outline: Verify login page
    Given Username "<username>" and Password "<password>"
    Then login to the website
    Examples:
      | username | password|
    |   standard_user       | secret_sauce  |


  @Smoke
    Scenario: Verify shopping cart
      Given Add product to the cart
      Then Checkout the product
      @Sanity
      Scenario: Finishing order process
        Given Enter address information
        Then Click Finish
        @Regression
        Scenario: Logout from page
          Given goto react button
          Then click logout

