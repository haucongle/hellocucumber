#Feature: Test optional text
#  Write your description
#
#  Scenario: test optional text
#    Given I have 1 cucumber in my belly
#
#  Scenario: test optional text
#    Given I have 2 cucumbers in my belly
#
#  Scenario: test optional text
#    Given I have 42 cucumbers in my stomach
#
#  Scenario: test optional text
#    Given I have 42 {what} cucumbers in my belly


#Feature: Cucumber can convert a Gherkin data table to a list of a type you specify.
#
#  Scenario: The sum of a list of numbers should be calculated
#    Given a list of numbers
#      | 17   |
#      | 42   |
#      | 4711 |
#    When I summarize them
#    Then should I get 4770


#Feature: Guess the word
#
#  # The first example has two steps
#  Scenario: Maker starts a game
#    When the Maker starts a game
#    Then the Maker waits for a Breaker to join
#
#  # The second example has three steps
#  Scenario: Breaker joins a game
#    Given the Maker has started a game with the word "silky"
#    When the Breaker joins the Maker's game
#    Then the Breaker must guess a word with 5 characters

Feature: Multiple given and then

  Scenario: Multiple Givens
    Given one thing
    And another thing
    And yet another thing
    When I open my eyes
    Then I should see something
    But I shouldn't see something else