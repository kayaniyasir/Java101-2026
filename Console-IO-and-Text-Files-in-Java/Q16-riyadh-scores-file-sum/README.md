# Question 16 — Riyadh Scores File Sum

**Skill:** numbers from a file

## KSA-themed task
Read integers from the supplied scores.txt and print their total.

## Important points
- Open the supplied **`scores.txt`** using `new Scanner(new File("scores.txt"))`.
- Keep `scores.txt` in the **same working directory** as the compiled Java program.
- Read the contents using **hasNextInt()**, **hasNextDouble()**, or **hasNextLine()** as appropriate.
- Close the file scanner. Handle the test cases described below.
- The program declares **throws FileNotFoundException** for a missing file; explicit try-catch is not required for this lesson.

## Sample file: scores.txt
```text
10
20
30
```

## Expected console output
```text
Total scores: 60
```

## Boundary cases
Empty file→Total scores: 0.

## Complete solution
[IOQuestion16.java](IOQuestion16.java) | [Sample scores.txt](scores.txt)

## Run
```bash
javac IOQuestion16.java
java IOQuestion16
```

*Educational fictional Saudi scenario. These practice files contain simple, correctly formatted text values.*
