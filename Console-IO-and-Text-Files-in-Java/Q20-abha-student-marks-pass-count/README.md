# Question 20 — Abha Student Marks Pass Count

**Skill:** file and if

## KSA-themed task
Read marks from marks.txt and count scores of 50 or more.

## Important points
- Open the supplied **`marks.txt`** using `new Scanner(new File("marks.txt"))`.
- Keep `marks.txt` in the **same working directory** as the compiled Java program.
- Read the contents using **hasNextInt()**, **hasNextDouble()**, or **hasNextLine()** as appropriate.
- Close the file scanner. Handle the test cases described below.
- The program declares **throws FileNotFoundException** for a missing file; explicit try-catch is not required for this lesson.

## Sample file: marks.txt
```text
45
50
90
```

## Expected console output
```text
Passed: 2
```

## Boundary cases
Empty file→Passed: 0; mark 50 counts.

## Complete solution
[IOQuestion20.java](IOQuestion20.java) | [Sample marks.txt](marks.txt)

## Run
```bash
javac IOQuestion20.java
java IOQuestion20
```

*Educational fictional Saudi scenario. These practice files contain simple, correctly formatted text values.*
