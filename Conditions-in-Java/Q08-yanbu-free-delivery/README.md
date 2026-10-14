# Question 08 — Yanbu Free Delivery

**Topic:** logical AND

## Scenario
A fictional Yanbu shop provides free delivery for customers with an order of at least SAR 100 **and** a loyalty account.

## Your task
Read order amount (0–10000) and loyalty flag (1 = yes, 0 = no).

### Important rules
Both conditions must be true for **Free delivery**. Otherwise **Delivery fee applies**.

**Remember:** Check the boundary values carefully and print exactly the expected messages.

## Sample input
```text
120 1
```

## Expected output
```text
Free delivery
```

## Important test cases
100 1 → Free delivery; 99 1 → Delivery fee applies; 120 0 → Delivery fee applies; flag 2 → Invalid input.

## Complete solution
[View ConditionQuestion08.java](ConditionQuestion08.java). Try solving the question yourself first.

## Run the program
```bash
javac ConditionQuestion08.java
java ConditionQuestion08
```

*Saudi settings and rules are fictional educational examples.*
