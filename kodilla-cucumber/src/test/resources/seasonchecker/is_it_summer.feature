Feature: Is it Summer?
   Everybody likes Summer

   Scenario Outline: Today is or isn't Summer
      Given today is <day>
      When I ask whether it's Summer
      Then I should be <answer>
      Examples:
        | day | answer |
        | last day of December | "Nope" |
        | first day of August | "Yes! Summer!" |
        | 26th day of June | "Yes! Summer!" |
        | 4th day of January | "Nope" |
        | 2nd day of March | "Nope" |