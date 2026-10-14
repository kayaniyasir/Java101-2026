# Question 30 — Saudi Scholarship Final Decision

**Core skill:** combined and nested conditions

## Story / scenario
A fictional Saudi university scholarship considers applicants based on grades, service, and competition achievements.

## What to do
Read GPA as double (0–4), community service hours (0–1000), and competition flag (0/1).

## Important rules (read carefully)
A candidate qualifies only if **GPA ≥3.5 AND (service ≥20 OR competition=1)**. Print **Scholarship eligible** or **Not eligible**. Invalid values must be rejected.

**Important:** Pay attention to `>=`, `<=`, `&&`, `||`, and whether the boundary is included. Use the indicated conditional structure.

## Sample input
```text
3.7 10 1
```

## Expected output
```text
Scholarship eligible
```

## Boundary cases to test
3.5 20 0→Eligible; 3.49 40 1→Not eligible; 3.7 19 0→Not eligible; 4.1 20 1→Invalid input.

## Java solution
[View ConditionQuestion30.java](ConditionQuestion30.java). Try your own solution before checking.

## Compile / run
```bash
javac ConditionQuestion30.java
java ConditionQuestion30
```

*All settings, conditions and prices are illustrative learning examples.*
