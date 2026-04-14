Feature: Sauce-demo app login feature

  Background: user is on the login page

    @WIP
    Scenario Outline: Login validation scenario
      Given user is on the login page of Sauce-Demo app
      When user enters email "<email>"
      And user enters password "<password>"
      And user click login button
      Then user should see the "<result>"

      Examples: credentials we going to use
        | email                      | password        | result                            |
        | rosesmithashley3@gmail.com | ashrosesmith123 | Account Details and Order History |
        | rosesmithashley3@gmail.com | rosesmith558    | Incorrect email or password.      |
        | defkaki@gmail.com          | lesgin123       | Incorrect email or password.      |

