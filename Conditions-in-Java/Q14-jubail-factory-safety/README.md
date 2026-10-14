# Question 14 — Jubail Factory Safety

**Concept:** logical AND

## Scenario
A fictional Jubail lab permits a worker to enter only if two safety checks are complete.

## Input
Read safety helmet flag and training flag (each 0 or 1).

## Important rules
**Entry allowed** only when **helmet = 1 AND training = 1**.

**Pay special attention:** Use the specified conditional statement, test boundary values and print exactly the required messages.

## Sample input
```text
1 1
```

## Expected output
```text
Entry allowed
```

## Boundary / extra tests
1 0 → Entry denied; 0 1 → Entry denied; 2 1 → Invalid input.

## Solution
[Read ConditionQuestion14.java](ConditionQuestion14.java) after attempting the question.

```bash
javac ConditionQuestion14.java
java ConditionQuestion14
```

*Prices and policies are fictional for Java practice.*
