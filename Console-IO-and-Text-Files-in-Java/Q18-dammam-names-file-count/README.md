# Question 18 — Dammam Names File Count

**Skill:** count lines

## KSA-themed task
Count the number of name lines in names.txt.

## Important points
- Open the supplied **`names.txt`** using `new Scanner(new File("names.txt"))`.
- Keep `names.txt` in the **same working directory** as the compiled Java program.
- Read the contents using **hasNextInt()**, **hasNextDouble()**, or **hasNextLine()** as appropriate.
- Close the file scanner. Handle the test cases described below.
- The program declares **throws FileNotFoundException** for a missing file; explicit try-catch is not required for this lesson.

## Sample file: names.txt
```text
Sara
Ali
Maha
```

## Expected console output
```text
Names: 3
```

## Boundary cases
Empty file→Names: 0; one line→Names: 1.

## Complete solution
[IOQuestion18.java](IOQuestion18.java) | [Sample names.txt](names.txt)

## Run
```bash
javac IOQuestion18.java
java IOQuestion18
```

*Educational fictional Saudi scenario. These practice files contain simple, correctly formatted text values.*
