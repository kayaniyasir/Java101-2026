# Question 22 — Hail Attendance File

**Skill:** file count 1 and 0

## KSA-themed task
Read 1/0 attendance codes in attendance.txt and count each value.

## Important points
- Open the supplied **`attendance.txt`** using `new Scanner(new File("attendance.txt"))`.
- Keep `attendance.txt` in the **same working directory** as the compiled Java program.
- Read the contents using **hasNextInt()**, **hasNextDouble()**, or **hasNextLine()** as appropriate.
- Close the file scanner. Handle the test cases described below.
- The program declares **throws FileNotFoundException** for a missing file; explicit try-catch is not required for this lesson.

## Sample file: attendance.txt
```text
1
0
1
1
```

## Expected console output
```text
Present: 3
Absent: 1
```

## Boundary cases
Empty file→both zero; invalid code→Invalid status.

## Complete solution
[IOQuestion22.java](IOQuestion22.java) | [Sample attendance.txt](attendance.txt)

## Run
```bash
javac IOQuestion22.java
java IOQuestion22
```

*Educational fictional Saudi scenario. These practice files contain simple, correctly formatted text values.*
