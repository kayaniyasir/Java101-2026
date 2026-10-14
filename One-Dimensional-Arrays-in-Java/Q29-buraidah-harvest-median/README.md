# Question 29 — Buraidah Harvest Median

**Main skill:** Sorted middle value

## Scenario
A Buraidah farm records an odd number of harvest weights and needs the middle value.

## Required input
N **odd** between 1–9, followed by N whole weights (0–1000).

## Important rules
- **Use one-dimensional arrays**, not multiple separate variables for the values.
- Sort using **Arrays.sort**. Print the element at **N/2** (the median for an odd number of values).
- Handle invalid sizes and out-of-range values as described.
- Show the exact sample output format.

## Sample input
```text
5
9 5 3 8 7
```

## Expected output
```text
Median: 7
```

## Boundary tests
N=1; even N invalid; unsorted values.

## Solution
Try it first, then inspect [ArrayQuestion29.java](ArrayQuestion29.java).

## Compile and run
```bash
javac ArrayQuestion29.java
java ArrayQuestion29
```

*Saudi-context scenarios and rules are fictional learning examples.*
