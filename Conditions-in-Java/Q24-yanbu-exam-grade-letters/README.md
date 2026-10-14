# Question 24 — Yanbu Exam Grade Letters

**Core skill:** if-else-if

## Story / scenario
A fictional school converts percentage marks into letter grades.

## What to do
Read integer mark 0–100.

## Important rules (read carefully)
A:90–100; B:80–89; C:70–79; D:60–69; F:0–59. Check in **descending threshold order**.

**Important:** Pay attention to `>=`, `<=`, `&&`, `||`, and whether the boundary is included. Use the indicated conditional structure.

## Sample input
```text
80
```

## Expected output
```text
B
```

## Boundary cases to test
89→B; 90→A; 59→F; 101→Invalid mark.

## Java solution
[View ConditionQuestion24.java](ConditionQuestion24.java). Try your own solution before checking.

## Compile / run
```bash
javac ConditionQuestion24.java
java ConditionQuestion24
```

*All settings, conditions and prices are illustrative learning examples.*
