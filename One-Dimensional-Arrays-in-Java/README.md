# One-Dimensional Arrays in Java

**30 KSA-themed, CS101-level Java questions**, each in a separate folder with its own clear problem statement, **important rules**, exact sample input/output, boundary tests and a complete runnable `ArrayQuestionNN.java` solution.

These materials support the **one-dimensional arrays** part of introductory Java programming: declaring arrays, reading values, indexing, traversal, totals, statistics, searching, sorting, copying, returning arrays and passing arrays to methods.

## Objectives

By the end, students should be able to:

1. Declare and initialize a one-dimensional array with `new int[n]`.
2. Work correctly with **zero-based indices** from `0` through `n-1`.
3. Process elements with `for` and enhanced `for` loops.
4. Compute totals, averages, minimum/maximum, and counts.
5. Use linear search, copying and basic array updates.
6. Sort and compare arrays using `java.util.Arrays`.
7. **Pass** an array to a static method and **return** an array from a method.
8. Validate array size and inputs, and test boundary conditions.

## All 30 questions

| No. | Question | Main concept |
|---:|---|---|
| 01 | [Riyadh Exam Marks](Q01-riyadh-exam-marks/README.md) | Read and print |
| 02 | [Jeddah Daily Sales](Q02-jeddah-daily-sales/README.md) | Sum |
| 03 | [Dammam Temperature Average](Q03-dammam-temperature-average/README.md) | Average |
| 04 | [Taif Fruit Basket Maximum](Q04-taif-fruit-basket-maximum/README.md) | Maximum |
| 05 | [Abha Hiking Minimum Time](Q05-abha-hiking-minimum-time/README.md) | Minimum |
| 06 | [AlUla Visitor Counts](Q06-alula-visitor-counts/README.md) | Count above threshold |
| 07 | [Hail Even Seat Numbers](Q07-hail-even-seat-numbers/README.md) | Even/odd counts |
| 08 | [Yanbu Water Consumption](Q08-yanbu-water-consumption/README.md) | Count equal values |
| 09 | [Buraidah Date Boxes](Q09-buraidah-date-boxes/README.md) | Reverse traversal |
| 10 | [Madinah Book Fair Search](Q10-madinah-book-fair-search/README.md) | Linear search |
| 11 | [Tabuk Bus Passenger Updates](Q11-tabuk-bus-passenger-updates/README.md) | Update element |
| 12 | [Jazan Mango Inventory Copy](Q12-jazan-mango-inventory-copy/README.md) | Copy array |
| 13 | [Najran Quiz Score Boost](Q13-najran-quiz-score-boost/README.md) | Modify values |
| 14 | [Jubail Training Attendance](Q14-jubail-training-attendance/README.md) | Compare totals |
| 15 | [Diriyah Museum Daily Counts](Q15-diriyah-museum-daily-counts/README.md) | Count below average |
| 16 | [Al Bahah Rainfall Threshold](Q16-al-bahah-rainfall-threshold/README.md) | Find first matching index |
| 17 | [Riyadh Metro Seat Sort](Q17-riyadh-metro-seat-sort/README.md) | Ascending sort |
| 18 | [Hofuf Market Prices Descending](Q18-hofuf-market-prices-descending/README.md) | Descending order |
| 19 | [Makkah Conference Badge IDs](Q19-makkah-conference-badge-ids/README.md) | Count duplicates |
| 20 | [Sakaka Number Range Filter](Q20-sakaka-number-range-filter/README.md) | Filter range |
| 21 | [Riyadh Classroom Array Equality](Q21-riyadh-classroom-array-equality/README.md) | Arrays.equals |
| 22 | [Jeddah Beach Cleanup Total](Q22-jeddah-beach-cleanup-total/README.md) | Pass array to method |
| 23 | [Dammam Workshop High Scores](Q23-dammam-workshop-high-scores/README.md) | Method returning count |
| 24 | [Taif Souvenir Price Copy](Q24-taif-souvenir-price-copy/README.md) | Return array from method |
| 25 | [Abha Rainy Day Markers](Q25-abha-rainy-day-markers/README.md) | Count flags |
| 26 | [AlUla Visitor Count Shift](Q26-alula-visitor-count-shift/README.md) | Left shift |
| 27 | [Hail Ticket Swap](Q27-hail-ticket-swap/README.md) | Swap positions |
| 28 | [Yanbu Training Array Rotation](Q28-yanbu-training-array-rotation/README.md) | Rotate array |
| 29 | [Buraidah Harvest Median](Q29-buraidah-harvest-median/README.md) | Median with sorting |
| 30 | [Saudi University Highest GPA](Q30-saudi-university-highest-gpa/README.md) | Method finding maximum |

## Recommended learning path

**Q01–Q10: Foundations** — create arrays, read and print, totals, averages, min/max, counts, reverse traversal and linear search.

**Q11–Q20: Array operations** — update, copy, change each element, compare two arrays, filter, sort and search for the first or all matches.

**Q21–Q30: Applied problems** — equality checks, arrays in methods, array shifts, swapping, rotation, median and maximum GPA.

## Student instructions

1. Read the **Scenario** and **Required input** in the question's `README.md`.
2. Highlight the **important rules** and determine whether the task uses a loop, comparison, search, or sorting.
3. Draw the array with **indices starting at 0** if needed.
4. Write and test your own solution. Compare the exact output, then test boundary cases.
5. Open the solution file only after attempting the question.

## Compile / run

Install a Java Development Kit. In a question's folder:

```bash
javac ArrayQuestion01.java
java ArrayQuestion01
```

Use the corresponding question number for the other Java files. These exercises use only basic Java, one-dimensional arrays, `Scanner`, conditional statements, loops, standard `Arrays` methods, and simple static methods where requested. **No 2D arrays, collections, files, recursion or exception handling are required.**

**Dr. Yasir Javed · CS101 supplementary Java practice**

*Places, prices and procedures are fictional KSA-themed educational scenarios.*
