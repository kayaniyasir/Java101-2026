# Question 16 — Al Bahah Mountain Weather

**Concept:** logical OR

## Scenario
A hiking club in Al Bahah cancels a fictional outing during high wind or heavy rain.

## Input
Read wind speed km/h (0–200) and rainfall mm (0–500).

## Important rules
Print **Cancel outing** if wind **≥50 OR** rain **≥30**. Otherwise **Outing approved**.

**Pay special attention:** Use the specified conditional statement, test boundary values and print exactly the required messages.

## Sample input
```text
55 0
```

## Expected output
```text
Cancel outing
```

## Boundary / extra tests
49 29 → Outing approved; 50 0 → Cancel outing; 0 30 → Cancel outing.

## Solution
[Read ConditionQuestion16.java](ConditionQuestion16.java) after attempting the question.

```bash
javac ConditionQuestion16.java
java ConditionQuestion16
```

*Prices and policies are fictional for Java practice.*
