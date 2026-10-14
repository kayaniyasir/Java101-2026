# Question 28 — Yanbu Training Array Rotation

**Main skill:** Rotate right one place

## Scenario
A Yanbu coding club moves the last team number to the start of its display.

## Required input
N (1–10), followed by N team numbers (1–999).

## Important rules
- **Use one-dimensional arrays**, not multiple separate variables for the values.
- **Rotate right by one**: save last element; move others one position right; place saved value at index 0.
- Handle invalid sizes and out-of-range values as described.
- Show the exact sample output format.

## Sample input
```text
4
1 2 3 4
```

## Expected output
```text
4 1 2 3
```

## Boundary tests
N=1 unchanged; invalid team number.

## Solution
Try it first, then inspect [ArrayQuestion28.java](ArrayQuestion28.java).

## Compile and run
```bash
javac ArrayQuestion28.java
java ArrayQuestion28
```

*Saudi-context scenarios and rules are fictional learning examples.*
