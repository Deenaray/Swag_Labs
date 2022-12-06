Feature: Swaglab shopping site
  @Regression
  Scenario: Verify login page
    Given Username and Password
    Then login to the website

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

