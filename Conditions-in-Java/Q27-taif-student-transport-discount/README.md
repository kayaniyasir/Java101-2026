# Question 27 — Taif Student Transport Discount

**Core skill:** nested conditions

## Story / scenario
A fictional Taif shuttle charges SAR 20. Students aged 18 or younger receive 50% off if they show an ID.

## What to do
Read age (0–120) and student ID flag (0/1).

## Important rules (read carefully)
Use **nested if**. Fare is SAR 10 only if **age ≤18 AND ID=1**; otherwise SAR 20.

**Important:** Pay attention to `>=`, `<=`, `&&`, `||`, and whether the boundary is included. Use the indicated conditional structure.

## Sample input
```text
17 1
```

## Expected output
```text
Fare: SAR 10
```

## Boundary cases to test
18 1→10; 19 1→20; 16 0→20; age -1→Invalid input.

## Java solution
[View ConditionQuestion27.java](ConditionQuestion27.java). Try your own solution before checking.

## Compile / run
```bash
javac ConditionQuestion27.java
java ConditionQuestion27
```

*All settings, conditions and prices are illustrative learning examples.*
