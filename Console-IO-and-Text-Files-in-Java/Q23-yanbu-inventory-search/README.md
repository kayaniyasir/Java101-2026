# Question 23 — Yanbu Inventory Search

**Skill:** file and comparison

## KSA-themed task
Read product codes line by line; enter a target code at the console and report if it exists.

## Important instructions
- **Read from** the supplied `inventory.txt` using `Scanner` and `File`.
- Keep the sample file in the working directory when you run Java.
- Use beginner Java file reading, conditions and loops; close the file scanner.
- The main method declares `throws FileNotFoundException` rather than using try/catch.
- **Boundary cases:** Enter BOOK→Found; ERASER→Not found; case-sensitive.

## Sample file contents: inventory.txt
```text
PEN
BOOK
BAG
```

## Sample console input
`BOOK`

## Expected output
```text
Found
```

## Solution and test data
[IOQuestion23.java](IOQuestion23.java) | [inventory.txt](inventory.txt)

```bash
javac IOQuestion23.java
java IOQuestion23
```

*Saudi-themed fictional teaching scenario.*
