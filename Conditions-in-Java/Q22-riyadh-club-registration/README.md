# Question 22 — Riyadh Club Registration

**Core skill:** logical AND and NOT

## Story / scenario
A fictional school robotics club requires ages 14–18 and a completed consent form.

## What to do
Read age (0–120), and consent flag (1=yes, 0=no).

## Important rules (read carefully)
Print **Registered** only if age is within 14–18 and consent is 1; otherwise **Not registered**.

**Important:** Pay attention to `>=`, `<=`, `&&`, `||`, and whether the boundary is included. Use the indicated conditional structure.

## Sample input
```text
15 1
```

## Expected output
```text
Registered
```

## Boundary cases to test
13 1 → Not registered; 18 1 → Registered; 15 0 → Not registered; flag 3 → Invalid input.

## Java solution
[View ConditionQuestion22.java](ConditionQuestion22.java). Try your own solution before checking.

## Compile / run
```bash
javac ConditionQuestion22.java
java ConditionQuestion22
```

*All settings, conditions and prices are illustrative learning examples.*
