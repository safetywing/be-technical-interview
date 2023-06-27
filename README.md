# SW Java Backend Programming Session

## Technologies

Java + Micronaut backend.

## Task specifications

The goal of the task is to have an endpoint which calculates the price of an insurance contract based on different criteria. The endpoint should accept params which will have an impact on the calculated price. 

- Each contract can have a group of members
- The cost for each adult is 2$/day
- The cost for each child aged 5-17 is 1$/day
- Each adult can add one child under 5 years for free. Up to a maximum of 2 free children per contract.
- The contract length cannot be more than 28 days.
