# Question 28 — Taif Fruit Inventory Writer

**Topic:** write computed total

## Scenario
Read box count and kilograms per box (integers 0–100). Write both values and total kilograms to fruit-report.txt.

## Important rules
- Read inputs through **Scanner** and write a **new text file** using `PrintWriter`.
- **Output file:** `fruit-report.txt`. The file is saved in the working directory.
- **Close PrintWriter** to finish writing. Existing files with the same name are overwritten.
- For this lesson, use `throws FileNotFoundException` in `main` rather than try/catch.
- **Test boundaries:** Zero is allowed; any negative→Invalid input and no file.

## Sample console input
```text
3 5
```

## Expected console output
```text
Created fruit-report.txt
```

## Expected file contents
fruit-report.txt: Boxes: 3; Kg per box: 5; Total kg: 15 (separate lines).

## Solution
[IOQuestion28.java](IOQuestion28.java). Run it to generate `fruit-report.txt` locally.

```bash
javac IOQuestion28.java
java IOQuestion28
```

*Saudi-context fictional CS101 scenario.*
