# Question 20 — Sakaka Number Range Filter

**Main concept:** Filter using an array

## Scenario
A Sakaka competition lists scored points and only wants entries within a chosen range.

## Input
N (1–15), N scores (0–100), then lower and upper bounds (0–100).

## Important points
- **Use one-dimensional arrays** and the requested approach.
- Print scores **between lower and upper inclusive** in original order, separated by spaces. If none match, print **None**.
- Validate sizes and values before processing.
- Print the exact message and formatting shown.

## Sample input
```text
5
12 44 70 80 33
30 70
```

## Expected output
```text
44 70 33
```

## Boundary tests
Lower equals upper; no matches; lower > upper invalid.

## Java solution
[Open ArrayQuestion20.java](ArrayQuestion20.java) after attempting the question yourself.

## Run
```bash
javac ArrayQuestion20.java
java ArrayQuestion20
```

*Saudi situations are fictional training examples.*
