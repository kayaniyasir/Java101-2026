# Question 30 — Saudi School Result File

**Topic:** write report using conditions

## Scenario
Read a student's one-word name and mark (0–100). Write name, mark and Pass/Fail result to result.txt.

## Important rules
- Read inputs through **Scanner** and write a **new text file** using `PrintWriter`.
- **Output file:** `result.txt`. The file is saved in the working directory.
- **Close PrintWriter** to finish writing. Existing files with the same name are overwritten.
- For this lesson, use `throws FileNotFoundException` in `main` rather than try/catch.
- **Test boundaries:** Mark 49→Fail; 50→Pass; 101→Invalid mark, no file.

## Sample console input
```text
Maha 75
```

## Expected console output
```text
Created result.txt
```

## Expected file contents
result.txt contains Student: Maha; Mark: 75; Result: Pass on separate lines.

## Solution
[IOQuestion30.java](IOQuestion30.java). Run it to generate `result.txt` locally.

```bash
javac IOQuestion30.java
java IOQuestion30
```

*Saudi-context fictional CS101 scenario.*
