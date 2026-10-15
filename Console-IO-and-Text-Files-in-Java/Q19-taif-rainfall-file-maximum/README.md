# Question 19 — Taif Rainfall File Maximum

**Skill:** file maximum

## KSA-themed task
Read integer rainfall measurements from rain.txt; show the highest recorded value.

## Important points
- Open the supplied **`rain.txt`** using `new Scanner(new File("rain.txt"))`.
- Keep `rain.txt` in the **same working directory** as the compiled Java program.
- Read the contents using **hasNextInt()**, **hasNextDouble()**, or **hasNextLine()** as appropriate.
- Close the file scanner. Handle the test cases described below.
- The program declares **throws FileNotFoundException** for a missing file; explicit try-catch is not required for this lesson.

## Sample file: rain.txt
```text
3
11
7
```

## Expected console output
```text
Maximum rainfall: 11
```

## Boundary cases
Empty file→No readings; one value→itself.

## Complete solution
[IOQuestion19.java](IOQuestion19.java) | [Sample rain.txt](rain.txt)

## Run
```bash
javac IOQuestion19.java
java IOQuestion19
```

*Educational fictional Saudi scenario. These practice files contain simple, correctly formatted text values.*
