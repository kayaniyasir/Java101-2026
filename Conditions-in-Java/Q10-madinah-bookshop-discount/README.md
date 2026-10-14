# Question 10 — Madinah Bookshop Discount

**Topic:** nested if

## Scenario
A fictional Madinah bookshop gives students a discount only when their bill is SAR 50 or more.

## Your task
Read total bill (0–10000) and student flag (1 = student, 0 = other).

### Important rules
Use **nested if**: print **Discount granted** only for students with qualifying bills; otherwise **No discount**.

**Remember:** Check the boundary values carefully and print exactly the expected messages.

## Sample input
```text
75 1
```

## Expected output
```text
Discount granted
```

## Important test cases
49 1 → No discount; 50 1 → Discount granted; 75 0 → No discount; flag 3 → Invalid input.

## Complete solution
[View ConditionQuestion10.java](ConditionQuestion10.java). Try solving the question yourself first.

## Run the program
```bash
javac ConditionQuestion10.java
java ConditionQuestion10
```

*Saudi settings and rules are fictional educational examples.*
