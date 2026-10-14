# Question 24 — Al Khobar Hotel Nights

**Focus:** method overloading doubles

## Problem
A fictional hotel charges SAR 220 per night. Overload stayCost(int nights) for the base price and stayCost(int nights,double discountRate) for a discounted price. Read nights (1–30) and discount percent (0–100).

## Requirements
- Write and call the specified static method(s).
- Use `Scanner` where needed, with beginner Java concepts.
- No arrays, files, collections, exception handling or recursion.
- Validate the specified input range and use exact output formatting.

## Sample input
```text
2 10
```

## Sample output
```text
Base: SAR 440.00
Discounted: SAR 396.00
```

## Boundary tests
1 0 gives equal totals; invalid discount → Invalid input.

## Solution
[MethodQuestion24.java](MethodQuestion24.java)

```bash
javac MethodQuestion24.java
java MethodQuestion24
```

*All Saudi-context scenarios and prices are fictional training examples.*
