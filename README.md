<div align="center">

# Java101 Learning Hub
### Learn Java, one concept and one problem at a time

**200 beginner-friendly Java programming exercises across 7 learning collections**

**KSA-themed scenarios · Clear instructions · Sample input/output · Separate Java solutions**

[Start with Java Basics](Java-Basics-Variables-Operators-and-Math/README.md) · [Browse all collections](#learning-path) · [How to run Java](#getting-started)

</div>

---

## Welcome

Welcome to **Java101 Learning Hub**, a collection of introductory Java practice exercises designed to help students progress from basic programming statements to small programs that use conditions, loops, methods, strings, arrays and text files.

Each question is based on a familiar **Saudi Arabia (KSA)** setting such as a school, university, shop, event, transport service or local activity. These are fictional learning scenarios; any prices or rules mentioned are for practice only.

**Created by Dr. Yasir Javed** as supplementary material for students learning introductory programming.

## Learning path

> **New to Java?** Follow the collections in the order below. Each question has its own folder, problem statement, important rules, example input/output and a complete Java solution.

| Step | Collection | Questions | What you will practice |
|:--:|---|:--:|---|
| 1 | **[Java Basics: Variables, Operators & Math](Java-Basics-Variables-Operators-and-Math/README.md)** | **30** | Data types, `Scanner`, arithmetic, casting, operator precedence, `Math` |
| 2 | **[Conditions in Java](Conditions-in-Java/README.md)** | **30** | `if`, `if-else`, nested `if`, logical operators and `switch` |
| 3 | **[Basic Loops in Java](Basic-Loops-in-Java/README.md)** | **20** | `for`, `while`, `do-while`, nested loops, `break`, `continue` |
| 4 | **[Methods in Java](Methods-in-Java/README.md)** | **30** | `void`, parameters, return values, method calls, overloading and scope |
| 5 | **[Strings and Characters in Java](Strings-and-Characters-in-Java/README.md)** | **30** | `String`, `char`, comparison, substring, text processing and validation |
| 6 | **[One-Dimensional Arrays in Java](One-Dimensional-Arrays-in-Java/README.md)** | **30** | Array indexing, traversal, searching, sorting, copying and array methods |
| 7 | **[Console I/O and Text Files in Java](Console-IO-and-Text-Files-in-Java/README.md)** | **30** | Formatted output, `Scanner`, reading text files and `PrintWriter` |
| | **Total** | **200** | **Seven topic-focused learning collections** |

The order is a suggested learning sequence, not a prerequisite restriction. Console input is introduced from the first collection; the final collection focuses on more structured console interaction and text files.

## Getting started

**You need:** A Java Development Kit (JDK) and a terminal or Java IDE such as IntelliJ IDEA, Eclipse or VS Code with Java support.

### Option A: Explore on GitHub

1. Select a collection from the table above.
2. Open a question folder such as [Java Basics — Question 01](Java-Basics-Variables-Operators-and-Math/Q01-riyadh-student-age/README.md).
3. Read the **scenario, important rules, sample input, expected output and test cases**.
4. Attempt the question **before** opening its `.java` solution.

### Option B: Download and run

1. On the repository page, select **Code → Download ZIP** and extract it, or clone the repository:

   ```bash
   git clone https://github.com/kayaniyasir/Java101-2026.git
   cd Java101-2026
   ```

2. Move into an individual question folder:

   ```bash
   cd Java-Basics-Variables-Operators-and-Math/Q01-riyadh-student-age
   ```

3. Compile and run the matching Java class:

   ```bash
   javac BasicsQuestion01.java
   java BasicsQuestion01
   ```

4. Enter the sample input from the question README and compare the output.

**Important:** Each question contains an independent Java class. The class and file names correspond (for example, `BasicsQuestion01.java` and `BasicsQuestion01`). You do not need to compile the whole repository at once.

### Using text-file exercises

For [Console I/O and Text Files](Console-IO-and-Text-Files-in-Java/README.md), open the **individual question folder** before running the program. File-reading questions include a sample `.txt` file in that folder. A program that writes a file will create it in the current working directory. If you run through an IDE, check its **working directory** setting.

## A practical study routine

1. **Understand:** Read the question carefully; identify the inputs, expected output and constraints.
2. **Plan:** Write the main steps or pseudocode before writing Java.
3. **Code:** Create your own Java solution without opening the provided answer.
4. **Test:** Run the sample and test at least two boundaries (for example, the minimum and maximum allowed values).
5. **Debug:** Check errors, variable types, loop bounds, indices and output formatting.
6. **Reflect:** Compare the supplied solution only after your attempt. Explain why it works.

### Suggested weekly progression

| Stage | Suggested focus |
|---|---|
| Week 1 | Java Basics and input/output fundamentals |
| Week 2 | Conditions and branching |
| Week 3 | Loops and problem solving |
| Week 4 | Methods |
| Week 5 | Strings and characters |
| Week 6 | One-dimensional arrays |
| Week 7 | Console I/O and text files |
| Week 8 | Revisit difficult questions and build a small Java project |

*This timetable is optional; follow your course pace and instructor's plan.*

## Question structure

Each topic has an index `README.md`, and each individual question has its own folder:

```text
Java101-2026/
├── README.md                                 ← You are here
├── Java-Basics-Variables-Operators-and-Math/
│   ├── README.md
│   ├── Q01-riyadh-student-age/
│   │   ├── README.md                         ← Problem and tests
│   │   └── BasicsQuestion01.java            ← Java solution
│   └── ...
├── Conditions-in-Java/
├── Basic-Loops-in-Java/
├── Methods-in-Java/
├── Strings-and-Characters-in-Java/
├── One-Dimensional-Arrays-in-Java/
└── Console-IO-and-Text-Files-in-Java/
    └── ...                                   ← Includes sample .txt files
```

## Useful Java reminders

| Concept | Important reminder |
|---|---|
| Variables | Declare suitable types: `int`, `double`, `char`, `boolean`, `String` |
| Input | `Scanner` reads from the keyboard; `nextLine()` can include spaces |
| Arithmetic | `7 / 2` is `3`, while `7.0 / 2` is `3.5` |
| Conditions | Understand comparison and logical operators before nesting decisions |
| Loops | Check initialization, condition, update and termination |
| Methods | A method can return a value or be declared `void` |
| Strings | Use `equals()` to compare string contents |
| Arrays | The first element is at index `0`; the last is at `length - 1` |
| Text files | Place supplied files in the program's working directory |

## For students and instructors

These exercises can be used for **independent practice, guided labs, revision, quizzes and classroom demonstrations**. Instructors can assign a range of questions by topic or ask students to explain, test and improve their solutions.

**Academic integrity:** The Java files are learning references, not a substitute for independent problem solving. Students should follow their instructor's assessment and submission rules.

**Technical note:** The collections and representative files have been checked in GitHub, but **a complete automated compilation and test suite across all 200 solutions has not yet been performed**.

---

**Dr. Yasir Javed** · [Personal website](https://kayaniyasir.github.io/yjaved/) · [GitHub](https://github.com/kayaniyasir) · [ORCID](https://orcid.org/0000-0002-6311-027X)

*Built for learning. Practice consistently, test carefully, and improve one problem at a time.*
