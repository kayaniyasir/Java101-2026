# Question 28 — Riyadh Shopping Price Overload

**Focus:** overload int/double

## Problem
Overload priceAfterDiscount(int price) giving a 10% discount, and priceAfterDiscount(double price) giving a 10% discount. Read an integer and a decimal fictional price (each 0–10000); print discounted values.

## Requirements
- Write and call the specified static method(s).
- Use `Scanner` where needed, with beginner Java concepts.
- No arrays, files, collections, exception handling or recursion.
- Validate the specified input range and use exact output formatting.

## Sample input
```text
100 99.5
```

## Sample output
```text
Whole-price item: SAR 90.00
Decimal-price item: SAR 89.55
```

## Boundary tests
0 and 0 → 0.00; negative → Invalid price.

## Solution
[MethodQuestion28.java](MethodQuestion28.java)

```bash
javac MethodQuestion28.java
java MethodQuestion28
```

*All Saudi-context scenarios and prices are fictional training examples.*
