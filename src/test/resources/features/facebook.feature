@web
  Feature: Login Facebook Page

    Background:
      Given I am on Facebook home page

      @login
      Scenario Outline: Verify invalid login for multiple users
        When I enter <username> into username text fields on home screen
        And I enter <password> into password text fields on home screen
        And I click on login button on home screen
        Then I verify that I am invalid login page

        Examples:
        | username          | password |
        | hasan@hotmail.com | test123  |
        | asdcxf@gmail.com  | wsdc45@  |
