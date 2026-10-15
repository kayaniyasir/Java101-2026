# Question 26 — Riyadh Welcome File

**Topic:** PrintWriter basic

## Scenario
Read a one-word student name; create welcome.txt containing one greeting line.

## Important rules
- Read inputs through **Scanner** and write a **new text file** using `PrintWriter`.
- **Output file:** `welcome.txt`. The file is saved in the working directory.
- **Close PrintWriter** to finish writing. Existing files with the same name are overwritten.
- For this lesson, use `throws FileNotFoundException` in `main` rather than try/catch.
- **Test boundaries:** Try Ali; file is overwritten on each run.

## Sample console input
```text
Sara
```

## Expected console output
```text
Created welcome.txt
```

## Expected file contents
welcome.txt: Welcome to Riyadh, Sara!

## Solution
[IOQuestion26.java](IOQuestion26.java). Run it to generate `welcome.txt` locally.

```bash
javac IOQuestion26.java
java IOQuestion26
```

*Saudi-context fictional CS101 scenario.*
