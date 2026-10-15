# Java Basics — Variables, Data Types, Operators and Math Functions

**30 KSA-themed beginner Java questions, with 30 separate runnable solutions and detailed question files.** This is the **foundational CS101 practice collection** to study before conditions, loops, methods and arrays.

## Learning objectives

Students will practice declaring **`int`, `double`, `char` and `String`** variables, reading values with `Scanner`, using arithmetic operators, understanding **integer division versus decimal division**, applying **explicit casting**, respecting operator precedence, using **increment/decrement and compound assignment**, declaring a **`final` constant**, and applying frequently used **`Math`** functions.

## Question directory

| # | KSA-themed question | Main concept |
|---:|---|---|
| 01 | [Riyadh Student Age](Q01-riyadh-student-age/README.md) | `int` |
| 02 | [Jeddah Fuel Price](Q02-jeddah-fuel-price/README.md) | `double` |
| 03 | [Dammam Club Initial](Q03-dammam-club-initial/README.md) | `char` |
| 04 | [Taif Flower Stock](Q04-taif-flower-stock/README.md) | `addition` |
| 05 | [Abha Trip Cost](Q05-abha-trip-cost/README.md) | `multiplication` |
| 06 | [AlUla Ticket Change](Q06-alula-ticket-change/README.md) | `subtraction` |
| 07 | [Hail Books per Shelf](Q07-hail-books-per-shelf/README.md) | `integer division` |
| 08 | [Yanbu Remaining Bottles](Q08-yanbu-remaining-bottles/README.md) | `%` |
| 09 | [Buraidah Three-Day Average](Q09-buraidah-three-day-average/README.md) | `floating-point average` |
| 10 | [Madinah Room Area](Q10-madinah-room-area/README.md) | `expressions` |
| 11 | [Tabuk Celsius Conversion](Q11-tabuk-celsius-conversion/README.md) | `conversion` |
| 12 | [Jazan Student Scores Cast](Q12-jazan-student-scores-cast/README.md) | `casting` |
| 13 | [Najran Order of Operations](Q13-najran-order-of-operations/README.md) | `precedence` |
| 14 | [Jubail Factory Counter](Q14-jubail-factory-counter/README.md) | `++` |
| 15 | [Diriyah Remaining Seats](Q15-diriyah-remaining-seats/README.md) | `--` |
| 16 | [Al Bahah Ticket Discount](Q16-al-bahah-ticket-discount/README.md) | `-=` |
| 17 | [Riyadh VAT Calculator](Q17-riyadh-vat-calculator/README.md) | `final constant` |
| 18 | [Hofuf Grade Percentage](Q18-hofuf-grade-percentage/README.md) | `percentages` |
| 19 | [Makkah Conference Clock](Q19-makkah-conference-clock/README.md) | `division and remainder` |
| 20 | [Sakaka Math Square Root](Q20-sakaka-math-square-root/README.md) | `Math.sqrt` |
| 21 | [Riyadh Round Trip Distance](Q21-riyadh-round-trip-distance/README.md) | `Math.abs` |
| 22 | [Jeddah Highest Sale](Q22-jeddah-highest-sale/README.md) | `Math.max` |
| 23 | [Dammam Fastest Trip](Q23-dammam-fastest-trip/README.md) | `Math.min` |
| 24 | [Taif Round Package Weight](Q24-taif-round-package-weight/README.md) | `Math.round` |
| 25 | [Abha Hotel Nights](Q25-abha-hotel-nights/README.md) | `Math.ceil` |
| 26 | [AlUla Full Meter Tiles](Q26-alula-full-meter-tiles/README.md) | `Math.floor` |
| 27 | [Hail Square Courtyard](Q27-hail-square-courtyard/README.md) | `Math.pow` |
| 28 | [Yanbu Circle Garden](Q28-yanbu-circle-garden/README.md) | `Math.PI` |
| 29 | [Buraidah Combine Measurements](Q29-buraidah-combine-measurements/README.md) | `Math.hypot` |
| 30 | [Saudi Event Budget Summary](Q30-saudi-event-budget-summary/README.md) | `combined application` |

## Suggested learning sequence

- **Q01–Q10 · Foundations:** Data types, variables, arithmetic operators, integer division, remainders and decimals.
- **Q11–Q20 · Numeric expressions:** Conversion, explicit casts, operator precedence, updates, constants and Math.sqrt.
- **Q21–Q30 · Math library:** Absolute value, min/max, rounding, ceilings, floors, powers, circles, distances and combined calculations.

## How to use each question

1. Open its `README.md` and read the complete scenario.
2. Review the **highlighted important rules**, input limits and expected output.
3. Write your own Java solution, then test boundary values and invalid inputs.
4. Compare your answer with the supplied `BasicsQuestionNN.java` only after trying it.

### Example run

In the question's directory, with the Java Development Kit installed:

```bash
javac BasicsQuestion01.java
java BasicsQuestion01
```

## Important Java reminders

- `7 / 2` produces **3** using integer arithmetic, but `7.0 / 2` produces **3.5**.
- `%` returns the remainder of an integer division.
- `Math.round`, `Math.ceil`, and `Math.floor` perform **different** rounding operations.
- `Math.pow(a,2)` calculates a square; `Math.sqrt(a)` calculates a square root.
- Currency and measurements are fictional class exercises; two-decimal `printf` formatting is sufficient for CS101 practice, not financial software.

**Author:** Dr. Yasir Javed · CS101 supplementary Java programming practice

*Saudi cities and prices are fictional practice scenarios. No official commercial or government rules are implied.*
