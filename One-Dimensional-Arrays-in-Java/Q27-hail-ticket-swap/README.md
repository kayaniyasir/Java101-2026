# Question 27 — Hail Ticket Swap

**Main skill:** Swap two positions

## Scenario
A Hail event organizer swaps two seats' ticket numbers.

## Required input
N (2–10), N unique or repeated IDs (1–999), then two valid zero-based indices.

## Important rules
- **Use one-dimensional arrays**, not multiple separate variables for the values.
- Use a temporary variable to **swap values at indices i and j**, then print the array.
- Handle invalid sizes and out-of-range values as described.
- Show the exact sample output format.

## Sample input
```text
4
10 20 30 40
0 3
```

## Expected output
```text
40 20 30 10
```

## Boundary tests
Same indices; invalid index; invalid ID.

## Solution
Try it first, then inspect [ArrayQuestion27.java](ArrayQuestion27.java).

## Compile and run
```bash
javac ArrayQuestion27.java
java ArrayQuestion27
```

*Saudi-context scenarios and rules are fictional learning examples.*
