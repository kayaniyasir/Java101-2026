# Question 19 — Hofuf Family Ticket Overloading

**Focus:** overloading

## Problem
At a fictional Hofuf festival, write ticket(int adults) charging SAR 30 per adult, and ticket(int adults,int children) charging SAR 30 per adult and SAR 15 per child. Read adult and child counts (0–30). Print both calculations.

## Requirements
- Write and call the specified static method(s).
- Use basic Java, `Scanner`, and methods as described.
- No arrays, files, collections, exception handling or recursion.
- Match output exactly; reject invalid input when required.

## Sample input
```text
2 3
```

## Sample output
```text
Adults only: SAR 60
Family: SAR 105
```

## Boundary tests
0 0 -> 0,0; negative -> Invalid counts.

## Solution
[MethodQuestion19.java](MethodQuestion19.java)

```bash
javac MethodQuestion19.java
java MethodQuestion19
```

*Fictional Saudi-themed scenario for CS101 practice.*
