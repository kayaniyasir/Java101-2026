# Question 30 — Saudi University Highest GPA

**Main skill:** Method to find maximum

## Scenario
A fictional Saudi university stores students' GPAs multiplied by 100 as integers (0–400).

## Required input
N (1–10), followed by N GPA values multiplied by 100 (for example, 375 means 3.75).

## Important rules
- **Use one-dimensional arrays**, not multiple separate variables for the values.
- Write **static int highest(int[] gpas)** and print the maximum as a decimal with **two digits**.
- Handle invalid sizes and out-of-range values as described.
- Show the exact sample output format.

## Sample input
```text
4
325 390 375 360
```

## Expected output
```text
Highest GPA: 3.90
```

## Boundary tests
400→4.00; 0→0.00; value 401 invalid.

## Solution
Try it first, then inspect [ArrayQuestion30.java](ArrayQuestion30.java).

## Compile and run
```bash
javac ArrayQuestion30.java
java ArrayQuestion30
```

*Saudi-context scenarios and rules are fictional learning examples.*
