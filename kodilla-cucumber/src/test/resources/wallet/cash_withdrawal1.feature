Feature: Cash Withdrawal

    Scenario: Unsuccessful withdrawal from a wallet
        Given I have deposited $100 in my wallet
        When I request $110
        Then Nothing should be dispensed

    Scenario: Successful withdrawal from a wallet
            Given I have deposited $100 in my wallet
            When I request $99
            Then $99 should be dispensed