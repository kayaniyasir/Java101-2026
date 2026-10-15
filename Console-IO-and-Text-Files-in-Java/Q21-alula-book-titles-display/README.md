# Question 21 — AlUla Book Titles Display

**Skill:** read text lines

## KSA-themed task
Print each line of titles.txt with the prefix Book: .

## Important points
- Open the supplied **`titles.txt`** using `new Scanner(new File("titles.txt"))`.
- Keep `titles.txt` in the **same working directory** as the compiled Java program.
- Read the contents using **hasNextInt()**, **hasNextDouble()**, or **hasNextLine()** as appropriate.
- Close the file scanner. Handle the test cases described below.
- The program declares **throws FileNotFoundException** for a missing file; explicit try-catch is not required for this lesson.

## Sample file: titles.txt
```text
History of AlUla
Java Basics
```

## Expected console output
```text
Book: History of AlUla
Book: Java Basics
```

## Boundary cases
Empty file produces no output; preserve spaces in titles.

## Complete solution
[IOQuestion21.java](IOQuestion21.java) | [Sample titles.txt](titles.txt)

## Run
```bash
javac IOQuestion21.java
java IOQuestion21
```

*Educational fictional Saudi scenario. These practice files contain simple, correctly formatted text values.*
