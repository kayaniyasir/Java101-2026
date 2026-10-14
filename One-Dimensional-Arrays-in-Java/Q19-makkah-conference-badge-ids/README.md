# Question 19 — Makkah Conference Badge IDs

**Main concept:** Count duplicate target

## Scenario
An academic conference exercise uses numerical badge IDs; organizers need to count one ID.

## Input
N (1–10), N badge IDs (1–9999), then one target ID (1–9999).

## Important points
- **Use one-dimensional arrays** and the requested approach.
- Count **all occurrences** of the target; do not stop at the first match.
- Validate sizes and values before processing.
- Print the exact message and formatting shown.

## Sample input
```text
5
10 20 10 30 10
10
```

## Expected output
```text
Occurrences: 3
```

## Boundary tests
Absent target -> 0; one element; repeated values.

## Java solution
[Open ArrayQuestion19.java](ArrayQuestion19.java) after attempting the question yourself.

## Run
```bash
javac ArrayQuestion19.java
java ArrayQuestion19
```

*Saudi situations are fictional training examples.*
