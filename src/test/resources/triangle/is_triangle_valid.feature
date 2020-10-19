Feature: Is triangle valid?
  Check whether triangle is valid or not if sides are given

  Scenario Outline: given three sides, check whether triangle is valid or not
    Given three sides "<side1>", "<side2>", "<side3>"
    When I ask whether the triangle is valid
    Then Is the triangle valid "<answer>"

    Examples:
      | side1 | side2 | side3 | answer |
      | 2     | 3     | 4     | true   |
      | 2.5   | 3.5   | 4.5   | true   |
      | -2    | -3    | -4    | false  |
      | 0     | 0     | 0     | false  |
      | 33    | 55    | 66    | true   |


