Feature: Swaglab shopping site
  Scenario: Verify login page
    Given Username and Password
    Then login to the website


    Scenario: Verify shopping cart
      Given Add product to the cart
      Then Checkout the product

      Scenario: Finishing order process
        Given Enter address information
        Then Click Finish

        Scenario: Logout from page
          Given goto react button
          Then click logout

