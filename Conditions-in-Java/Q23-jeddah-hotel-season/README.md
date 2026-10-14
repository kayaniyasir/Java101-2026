# Question 23 — Jeddah Hotel Season

**Core skill:** switch

## Story / scenario
A fictional Jeddah hotel uses the month number to indicate a training-season category.

## What to do
Read a month number (1–12).

## Important rules (read carefully)
Months **12,1,2 → Winter**; **3,4,5 → Spring**; **6,7,8 → Summer**; **9,10,11 → Autumn**. Use grouped switch cases.

**Important:** Pay attention to `>=`, `<=`, `&&`, `||`, and whether the boundary is included. Use the indicated conditional structure.

## Sample input
```text
12
```

## Expected output
```text
Winter
```

## Boundary cases to test
1→Winter; 6→Summer; 11→Autumn; 0→Invalid month.

## Java solution
[View ConditionQuestion23.java](ConditionQuestion23.java). Try your own solution before checking.

## Compile / run
```bash
javac ConditionQuestion23.java
java ConditionQuestion23
```

*All settings, conditions and prices are illustrative learning examples.*
