# Question 15 — Diriyah Entrance Fee

**Concept:** nested if-else

## Scenario
A fictional Diriyah heritage attraction charges SAR 30 for adults but SAR 15 for children under 13. Residents holding a pass pay nothing.

## Input
Read age (0–120) and resident-pass flag (0 or 1).

## Important rules
Use **nested if** to check pass first, then age. Print **Fee: SAR N**.

**Pay special attention:** Use the specified conditional statement, test boundary values and print exactly the required messages.

## Sample input
```text
12 0
```

## Expected output
```text
Fee: SAR 15
```

## Boundary / extra tests
13 0 → 30; 70 1 → 0; -1 0 → Invalid input.

## Solution
[Read ConditionQuestion15.java](ConditionQuestion15.java) after attempting the question.

```bash
javac ConditionQuestion15.java
java ConditionQuestion15
```

*Prices and policies are fictional for Java practice.*
