# Question 26 — AlUla Visitor Count Shift

**Main skill:** Shift elements left

## Scenario
An AlUla exhibition removes the earliest day from its list and shifts all later daily counts left.

## Required input
N (2–10), then N daily counts (0–1000).

## Important rules
- **Use one-dimensional arrays**, not multiple separate variables for the values.
- **Shift** positions left one step using a loop and print only the first **N−1** values.
- Handle invalid sizes and out-of-range values as described.
- Show the exact sample output format.

## Sample input
```text
4
10 20 30 40
```

## Expected output
```text
20 30 40
```

## Boundary tests
N=2; duplicate counts; N=1 invalid.

## Solution
Try it first, then inspect [ArrayQuestion26.java](ArrayQuestion26.java).

## Compile and run
```bash
javac ArrayQuestion26.java
java ArrayQuestion26
```

*Saudi-context scenarios and rules are fictional learning examples.*
