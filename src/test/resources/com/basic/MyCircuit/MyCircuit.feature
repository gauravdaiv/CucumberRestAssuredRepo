Feature: First Rest Assured test22


Scenario: Test my Get Metod22
Given user start the rest assured test
When user hit the get request
Then user checks the count or size
Then user checks at path "MRData.CircuitTable.Circuits.circuitId[0]"