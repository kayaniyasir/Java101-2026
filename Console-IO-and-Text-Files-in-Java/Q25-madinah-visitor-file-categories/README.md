# Question 25 — Madinah Visitor File Categories

**Skill:** file and classification

## KSA-themed task
Read visitor ages from ages.txt; count those under 18 and those aged 18 or above.

## Important instructions
- **Read from** the supplied `ages.txt` using `Scanner` and `File`.
- Keep the sample file in the working directory when you run Java.
- Use beginner Java file reading, conditions and loops; close the file scanner.
- The main method declares `throws FileNotFoundException` rather than using try/catch.
- **Boundary cases:** Invalid ages <0 or >120→Invalid age; empty file→zero counts.

## Sample file contents: ages.txt
```text
12
21
17
40
```

## Expected output
```text
Under 18: 2
Adults: 2
```

## Solution and test data
[IOQuestion25.java](IOQuestion25.java) | [ages.txt](ages.txt)

```bash
javac IOQuestion25.java
java IOQuestion25
```

*Saudi-themed fictional teaching scenario.*
