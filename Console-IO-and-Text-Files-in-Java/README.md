# Console Input/Output and Text Files in Java

**30 Saudi-themed CS101 exercises**, each in its own folder with a detailed `README.md` and an independent `IOQuestionNN.java` solution. **Questions 16–25 also include the sample input text file** needed to run the solution.

## Learning objectives

- Read integers, decimal values, words and full lines using `Scanner`.
- Understand **`next()` versus `nextLine()`** and consume leftover newlines when needed.
- Print labels, aligned values and decimal numbers using `System.out.println()` and `printf()`.
- Read structured numbers or text lines from a file with `Scanner(new File(...))`.
- Write reports and numbers into files using **`PrintWriter`**.
- Manage the file's **working directory**, test input boundaries and close file resources.

## All 30 questions

| No. | Saudi-themed exercise | Primary concept |
|---:|---|---|
| 01 | [Riyadh Student Introduction](Q01-riyadh-student-introduction/README.md) | Scanner input |
| 02 | [Jeddah Shopping Total](Q02-jeddah-shopping-total/README.md) | Numeric input |
| 03 | [Dammam Print Receipt](Q03-dammam-print-receipt/README.md) | printf formatting |
| 04 | [Taif Flower Customer Name](Q04-taif-flower-customer-name/README.md) | nextLine |
| 05 | [Abha Trip Distance](Q05-abha-trip-distance/README.md) | Double values |
| 06 | [AlUla Three Ticket Prices](Q06-alula-three-ticket-prices/README.md) | Multiple input values |
| 07 | [Hail Workshop Grade](Q07-hail-workshop-grade/README.md) | Console conditions |
| 08 | [Yanbu Event Identifier](Q08-yanbu-event-identifier/README.md) | Character input |
| 09 | [Buraidah Date Box Average](Q09-buraidah-date-box-average/README.md) | Looped input |
| 10 | [Madinah Multiline Address](Q10-madinah-multiline-address/README.md) | nextInt and nextLine |
| 11 | [Tabuk Parking Hours](Q11-tabuk-parking-hours/README.md) | Integer division/remainder |
| 12 | [Jazan Mango Order VAT](Q12-jazan-mango-order-vat/README.md) | VAT formatting |
| 13 | [Najran School Menu](Q13-najran-school-menu/README.md) | Menu and switch |
| 14 | [Jubail Attendance Register](Q14-jubail-attendance-register/README.md) | Attendance counters |
| 15 | [Riyadh Grade Report](Q15-riyadh-grade-report/README.md) | Formatted grade report |
| 16 | [Riyadh Scores File Sum](Q16-riyadh-scores-file-sum/README.md) | Read integer file |
| 17 | [Jeddah Sales File Average](Q17-jeddah-sales-file-average/README.md) | Read double file |
| 18 | [Dammam Names File Count](Q18-dammam-names-file-count/README.md) | Read text lines |
| 19 | [Taif Rainfall File Maximum](Q19-taif-rainfall-file-maximum/README.md) | Find maximum in file |
| 20 | [Abha Student Marks Pass Count](Q20-abha-student-marks-pass-count/README.md) | Count passed marks |
| 21 | [AlUla Book Titles Display](Q21-alula-book-titles-display/README.md) | Print file lines |
| 22 | [Hail Attendance File](Q22-hail-attendance-file/README.md) | Read attendance codes |
| 23 | [Yanbu Inventory Search](Q23-yanbu-inventory-search/README.md) | File search + keyboard |
| 24 | [Buraidah Price File Total](Q24-buraidah-price-file-total/README.md) | File price totals |
| 25 | [Madinah Visitor File Categories](Q25-madinah-visitor-file-categories/README.md) | Classify ages |
| 26 | [Riyadh Welcome File](Q26-riyadh-welcome-file/README.md) | Write greeting file |
| 27 | [Jeddah Number List Writer](Q27-jeddah-number-list-writer/README.md) | Write a sequence |
| 28 | [Taif Fruit Inventory Writer](Q28-taif-fruit-inventory-writer/README.md) | Write inventory report |
| 29 | [Abha Temperature Report Writer](Q29-abha-temperature-report-writer/README.md) | Write formatted average |
| 30 | [Saudi School Result File](Q30-saudi-school-result-file/README.md) | Write a student result |

## Learning path

**Q01–Q15 — Console input and output:** Reading input, multiword text, conditional output, loops, formatted receipts and grades.

**Q16–Q25 — Text-file reading:** Reading integers, decimal values, whole lines, calculating statistics, file searching and data classification. Each question folder has its own **sample `.txt` file**.

**Q26–Q30 — Text-file writing:** Create greeting, number, inventory, temperature and student-result files using `PrintWriter`.

## File exercises: important setup

1. Install a Java Development Kit and open the **individual question directory** in your terminal or IDE.
2. When reading, keep the supplied `.txt` file in that same directory. The sample file is part of the question's GitHub folder.
3. Compile and run:

```bash
javac IOQuestion16.java
java IOQuestion16
```

4. For writing exercises, run the Java program and inspect the newly created `.txt` file in the working directory.
5. If your IDE runs Java from a different working directory, adjust its run configuration. **Do not replace relative paths with an arbitrary computer-specific path.**

### Note on missing files

Examples in Q16–Q30 declare `throws FileNotFoundException` on `main` to keep the lesson focused on basic input/output. This is a beginner teaching simplification, not a model of production error handling. **The supplied sample files must be present** when running reading exercises. File-writing examples overwrite existing files of the same name.

### Scope

These exercises use only `Scanner`, `File`, `PrintWriter`, conditions, loops and simple arithmetic. **No arrays, collections, recursion, advanced file APIs or try/catch blocks are required.**

**Dr. Yasir Javed · CS101 supplementary programming practice**

*All Saudi place-based scenarios, prices and rules are fictional teaching examples.*
