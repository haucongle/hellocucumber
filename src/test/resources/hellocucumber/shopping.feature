Feature: Shopping

  Scenario Outline: Track my budget
    Given I have <budget> in my wallet
    When I buy milk with <price>
    Then I should have <final> in my wallet
    Examples:
      | budget | price | final |
      | 100    | 10    | 90    |
      | 200    | 20    | 180   |