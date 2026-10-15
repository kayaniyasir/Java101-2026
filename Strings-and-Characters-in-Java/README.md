# Strings and Characters in Java

**30 KSA-themed Java exercises**, with **30 separate folders**. Each question has a beginner-friendly `README.md`, **important requirements**, sample input/output, boundary tests and its own complete `StringQuestionNN.java` solution.

This collection supports the **Java String and Character topics** within introductory programming, using Saudi settings as fictional practice scenarios. It covers string input, indexing, comparisons, substring operations, character testing, loops on strings and simple validation. It does not require arrays, file input/output, advanced libraries, exception handling or recursion.

## Learning outcomes

Students should be able to:

- Declare and manipulate `String` values with `Scanner`.
- Explain **zero-based indexing** and use `length()` and `charAt()` safely.
- Compare strings with **`equals()`** and **`equalsIgnoreCase()`**, not `==`.
- Use `substring()`, `indexOf()`, `startsWith()`, `endsWith()`, and `contains()`.
- Apply `Character.isDigit()`, `Character.isLetter()` and character case conversion.
- Combine `if` and `for` loops with String operations for beginner validation.

## Question directory

| # | Saudi-themed problem | Core topic |
|---:|---|---|
| 01 | [Riyadh Welcome Name](Q01-riyadh-welcome-name/README.md) | String input |
| 02 | [Jeddah Name Length](Q02-jeddah-name-length/README.md) | length() |
| 03 | [Dammam First Character](Q03-dammam-first-character/README.md) | charAt(0) |
| 04 | [Abha Last Character](Q04-abha-last-character/README.md) | Last char |
| 05 | [Taif Uppercase Label](Q05-taif-uppercase-label/README.md) | toUpperCase() |
| 06 | [Yanbu Lowercase Code](Q06-yanbu-lowercase-code/README.md) | toLowerCase() |
| 07 | [AlUla City Match](Q07-alula-city-match/README.md) | equalsIgnoreCase() |
| 08 | [Hail Compare Club Names](Q08-hail-compare-club-names/README.md) | equals() |
| 09 | [Buraidah Name Initials](Q09-buraidah-name-initials/README.md) | Character case |
| 10 | [Najran Vowel Checker](Q10-najran-vowel-checker/README.md) | Vowel test |
| 11 | [Madinah Book Title Search](Q11-madinah-book-title-search/README.md) | contains() |
| 12 | [Tabuk Registration Prefix](Q12-tabuk-registration-prefix/README.md) | startsWith() |
| 13 | [Jazan Event Suffix](Q13-jazan-event-suffix/README.md) | endsWith() |
| 14 | [Jubail Extract Prefix](Q14-jubail-extract-prefix/README.md) | substring() |
| 15 | [Diriyah Find Dash](Q15-diriyah-find-dash/README.md) | indexOf() |
| 16 | [Al Bahah Replace Separators](Q16-al-bahah-replace-separators/README.md) | replace() |
| 17 | [Riyadh Clean Visitor Name](Q17-riyadh-clean-visitor-name/README.md) | trim() |
| 18 | [Dammam Letter Digit Check](Q18-dammam-letter-digit-check/README.md) | isDigit() |
| 19 | [Hofuf Alphabet Check](Q19-hofuf-alphabet-check/README.md) | isLetter / ASCII letters |
| 20 | [Sakaka Compare City Codes](Q20-sakaka-compare-city-codes/README.md) | compareTo() |
| 21 | [Riyadh Count Vowels](Q21-riyadh-count-vowels/README.md) | Vowel loop |
| 22 | [Jeddah Reverse Name](Q22-jeddah-reverse-name/README.md) | Reverse loop |
| 23 | [Taif Palindrome Code](Q23-taif-palindrome-code/README.md) | Palindrome |
| 24 | [Abha Count Digits](Q24-abha-count-digits/README.md) | Digit count |
| 25 | [Yanbu Password Length](Q25-yanbu-password-length/README.md) | Length validation |
| 26 | [AlUla Extract Booking Number](Q26-alula-extract-booking-number/README.md) | String extraction |
| 27 | [Hail Count Words](Q27-hail-count-words/README.md) | Word count |
| 28 | [Najran Mask Phone Ending](Q28-najran-mask-phone-ending/README.md) | Suffix masking |
| 29 | [Buraidah Email Check](Q29-buraidah-email-check/README.md) | Basic format check |
| 30 | [Saudi Student ID Summary](Q30-saudi-student-id-summary/README.md) | Combine String operations |

## Suggested learning path

**Q01–Q10: Foundations** — read names, access characters, case conversion, compare text, and examine vowels.

**Q11–Q20: String methods and characters** — search, prefix/suffix, substring, index, trim, replace and character checks.

**Q21–Q30: Applied CS101 problems** — count vowels, reverse text, check palindromes, extract IDs, count words and perform basic format checks.

## How to work on a question

1. Open the question's `README.md`.
2. Read the scenario and **highlighted requirements**.
3. Write your own Java file and compare against the expected output.
4. Test the listed boundary cases before opening the supplied solution.
5. Compile and run the matching solution, for example:

```bash
javac StringQuestion01.java
java StringQuestion01
```

**Author:** Dr. Yasir Javed · CS101 supplementary practice

*City references and rules are fictional educational examples; examples of password or email validation are simplified and not production-security checks.*
