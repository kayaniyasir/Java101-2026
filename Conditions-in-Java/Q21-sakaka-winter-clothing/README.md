# Question 21 — Sakaka Winter Clothing

**Core skill:** if-else-if

## Story / scenario
A Sakaka store suggests clothing based on the day's temperature.

## What to do
Read Celsius temperature from -20 to 55.

## Important rules (read carefully)
Below 10→**Jacket**, from 10 through 24→**Sweater**, 25 or above→**Light clothes**.

**Important:** Pay attention to `>=`, `<=`, `&&`, `||`, and whether the boundary is included. Use the indicated conditional structure.

## Sample input
```text
10
```

## Expected output
```text
Sweater
```

## Boundary cases to test
9→Jacket; 24→Sweater; 25→Light clothes; 56→Invalid temperature.

## Java solution
[View ConditionQuestion21.java](ConditionQuestion21.java). Try your own solution before checking.

## Compile / run
```bash
javac ConditionQuestion21.java
java ConditionQuestion21
```

*All settings, conditions and prices are illustrative learning examples.*
