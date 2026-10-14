# Question 13 — Jazan Event Suffix

**Main skill:** endsWith()

## Scenario
A Jazan programming event labels qualified registrations with the suffix -OK. Read a single-word registration ID.

## Important rules
- **Use endsWith()** as the main programming concept.
- Read the sample input carefully: a full line may contain spaces.
- **Java String indices begin at zero.** Check any length requirement before using an index.
- Print the exact required message and validate input when specified.

## Sample input
```text
JAZ-OK
```

## Expected output
```text
Approved
```

## Boundary tests
JAZ-NO -> Not approved; -OK -> Approved.

## Separate Java solution
[StringQuestion13.java](StringQuestion13.java)

```bash
javac StringQuestion13.java
java StringQuestion13
```

*Fictional KSA context for learning.*
