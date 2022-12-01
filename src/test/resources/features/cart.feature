Feature: Ebebek shopping cart functionality

  @wip
  Scenario: Search a product, add to cart and verify user is directed to login page when user clicks the check out button
    Given user is at the ebebek home page
    When user types "kaşık maması" in the search box and clicks Enter
    And user clicks the last product and sees the selected product in the product page
    When user clicks Sepete Ekle button
    And user clicks Sepeti Gör button
    And user clicks Alışverişi Tamamla button
    Then user is directed to User Login page
