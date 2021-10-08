#autor:Alejandro Saldarriaga Tobian

#Language:en

  @Stories

  Feature: Academy Choucair

  As a user, T want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @Scenario1
  Scenario: Search for a automation course
    Given than Juliana wants to learn automation at the academy Choucair
    | strUser    | strPassword       |
    | 1036677021 | Choucair2021*     |
    When she search for the course on the choucair academy platform
    | strCourse              |
    | Metodologia Bancolombia |
    Then she finds the course called
    | strCourse              |
    | Metodologia Bancolombia |