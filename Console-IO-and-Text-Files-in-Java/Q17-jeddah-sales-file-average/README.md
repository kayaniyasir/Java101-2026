# Question 17 — Jeddah Sales File Average

**Skill:** file average

## KSA-themed task
Read sales amounts from sales.txt, find the average to two decimals.

## Important points
- Open the supplied **`sales.txt`** using `new Scanner(new File("sales.txt"))`.
- Keep `sales.txt` in the **same working directory** as the compiled Java program.
- Read the contents using **hasNextInt()**, **hasNextDouble()**, or **hasNextLine()** as appropriate.
- Close the file scanner. Handle the test cases described below.
- The program declares **throws FileNotFoundException** for a missing file; explicit try-catch is not required for this lesson.

## Sample file: sales.txt
```text
10
20
30
```

## Expected console output
```text
Average sale: 20.00
```

## Boundary cases
Empty file→No sales.

## Complete solution
[IOQuestion17.java](IOQuestion17.java) | [Sample sales.txt](sales.txt)

## Run
```bash
javac IOQuestion17.java
java IOQuestion17
```

*Educational fictional Saudi scenario. These practice files contain simple, correctly formatted text values.*
