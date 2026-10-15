# Question 29 — Abha Temperature Report Writer

**Topic:** formatted file writing

## Scenario
Read three valid Celsius temperatures (-20 to 60). Save their average to temperatures.txt with one decimal.

## Important rules
- Read inputs through **Scanner** and write a **new text file** using `PrintWriter`.
- **Output file:** `temperatures.txt`. The file is saved in the working directory.
- **Close PrintWriter** to finish writing. Existing files with the same name are overwritten.
- For this lesson, use `throws FileNotFoundException` in `main` rather than try/catch.
- **Test boundaries:** Invalid temperature→Invalid temperature and no file.

## Sample console input
```text
18 21 24
```

## Expected console output
```text
Created temperatures.txt
```

## Expected file contents
temperatures.txt contains Average: 21.0 C.

## Solution
[IOQuestion29.java](IOQuestion29.java). Run it to generate `temperatures.txt` locally.

```bash
javac IOQuestion29.java
java IOQuestion29
```

*Saudi-context fictional CS101 scenario.*
