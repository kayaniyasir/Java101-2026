# Question 27 — Jeddah Number List Writer

**Topic:** loop and PrintWriter

## Scenario
Read N between 1 and 10; write the integers from 1 to N, one per line, to numbers.txt.

## Important rules
- Read inputs through **Scanner** and write a **new text file** using `PrintWriter`.
- **Output file:** `numbers.txt`. The file is saved in the working directory.
- **Close PrintWriter** to finish writing. Existing files with the same name are overwritten.
- For this lesson, use `throws FileNotFoundException` in `main` rather than try/catch.
- **Test boundaries:** N=1; 0→Invalid size, no file created.

## Sample console input
```text
3
```

## Expected console output
```text
Created numbers.txt
```

## Expected file contents
numbers.txt contains 1, 2, 3 on separate lines.

## Solution
[IOQuestion27.java](IOQuestion27.java). Run it to generate `numbers.txt` locally.

```bash
javac IOQuestion27.java
java IOQuestion27
```

*Saudi-context fictional CS101 scenario.*
