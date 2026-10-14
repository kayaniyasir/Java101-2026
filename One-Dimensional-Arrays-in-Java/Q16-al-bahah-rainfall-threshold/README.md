# Question 16 — Al Bahah Rainfall Threshold

**Main concept:** Index of first qualifying value

## Scenario
An Al Bahah weather group checks which day first reached its fictional rainfall alert threshold.

## Input
N (1–10), then N rain amounts (0–500), followed by threshold (0–500).

## Important points
- **Use one-dimensional arrays** and the requested approach.
- Report **First alert index: X** where rain ≥ threshold, or **No alert**. Index starts at zero.
- Validate sizes and values before processing.
- Print the exact message and formatting shown.

## Sample input
```text
5
5 8 12 4 17
10
```

## Expected output
```text
First alert index: 2
```

## Boundary tests
First day alerts; none alerts; threshold zero.

## Java solution
[Open ArrayQuestion16.java](ArrayQuestion16.java) after attempting the question yourself.

## Run
```bash
javac ArrayQuestion16.java
java ArrayQuestion16
```

*Saudi situations are fictional training examples.*
