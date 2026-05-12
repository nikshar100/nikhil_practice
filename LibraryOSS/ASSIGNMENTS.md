# LibraryOSS — Assignment Plan

## Assignment 0: Project Setup
Set up a new Gradle project in IntelliJ with the Java plugin. Create the package structure: `model`, `service`, `util` under `src/main/java`. Create matching test packages under `src/test/java`. Confirm it compiles with `./gradlew build`.

**Deliverable:** Empty project that builds clean.

---

## Assignment 1: Enums and Address
Create `BookType`, `BookStatus`, and `PatronTier` enums in the `model` package. `PatronTier` should have fields (`maxCheckouts`, `finePerDay`, `loanDays`) with a constructor and getters. Create the `Address` class with validation (no null fields, zip as String). Override `toString()`.

**Deliverable:** 4 files. Write a `main()` that prints each PatronTier's limits and creates/prints an Address.

---

## Assignment 2: Book
Create the `Book` class. Validate ISBN in the constructor — must not be null, must contain exactly 4 dashes. Title and author must not be null/empty. ISBN has no setter (immutable). Status defaults to `AVAILABLE`. Override `toString()`.

**Deliverable:** Write a `main()` that creates 3 books and demonstrates that invalid ISBNs throw exceptions.

---

## Assignment 3: Branch (Arrays of Objects)
Create the `Branch` class with a fixed-size `Book[]` array (capacity 500). Implement `addBook()`, `removeBook()`, `findBookByIsbn()`. Track `bookCount` separately from array length. Handle the case where the catalog is full.

**Deliverable:** Write a `main()` that creates a branch, adds 5 books, removes one, and finds one by ISBN. Print the book count before and after removal.

---

## Assignment 4: Patron
Create the `Patron` class. Validate email (must contain "@") and phone (must be exactly 10 digits — use a loop to check each char). Use a `static int nextId` to auto-generate patron IDs. The `checkouts` array size should equal `tier.getMaxCheckouts()`. Implement `canCheckout()` which checks if `checkoutCount < tier.getMaxCheckouts()`.

**Deliverable:** Write a `main()` that creates 3 patrons of different tiers and prints their IDs and max checkout limits. Demonstrate that invalid email/phone throws exceptions.

---

## Assignment 5: Checkout and Fine (Association)
Create `Checkout`. It takes a Patron, Book, and checkoutDate (int). It calculates `dueDate = checkoutDate + patron.getTier().getLoanDays()`. On creation, set the book's status to `CHECKED_OUT`. Implement `returnBook(returnDate)` which sets status back to `AVAILABLE`. Implement `getDaysOverdue(currentDate)` and `calculateFine(currentDate)`.

Create `Fine` which stores the calculated fine amount for a specific checkout.

**Deliverable:** Write a `main()` that checks out a book on day 1, returns it on day 20, and prints whether it was overdue and the fine amount.

---

## Assignment 6: CheckoutService (Wiring It Together)
Create `CheckoutService`. It maintains a `Checkout[]` array. The `checkout()` method must validate: patron can check out (not at max), book is available. The `returnBook()` method creates a Fine if overdue. Implement `getOverdueCheckouts(currentDate)` which loops through all checkouts and returns those past due.

**Deliverable:** Write a `main()` that simulates: create a branch with 5 books, create 2 patrons, check out books, return some late, print overdue list and fines.

---

## Assignment 7: SearchService (String Methods)
Create `SearchService`. Implement `searchByTitle()` using `String.contains()` with `toLowerCase()` for case-insensitive matching. Implement `searchByAuthor()` the same way. `findPatronByName()` should use `equalsIgnoreCase()`. Search across all branches.

**Deliverable:** Write a `main()` that adds 10 books across 2 branches, then searches by partial title and by author. Print results.

---

## Assignment 8: ReportBuilder (StringBuffer and 2D Arrays)
Create `ReportBuilder` in the `util` package. Use `StringBuffer` (not `+` concatenation) to build formatted reports. Implement `buildBranchReport()` that lists all books in a branch with their status. Implement `buildCheckoutStats()` that takes a `int[][]` (branches × days of week) and formats it as a table.

**Deliverable:** Write a `main()` that populates a 2D stats array with sample data, builds and prints a branch report and a stats table.

---

## Assignment 9: Unit Tests
Write JUnit 5 tests for each class. At minimum:
- `BookTest`: valid creation, invalid ISBN throws, immutable ISBN (no setter exists)
- `BranchTest`: add/remove/find, full catalog rejection
- `PatronTest`: validation, canCheckout logic, static ID increments
- `CheckoutTest`: due date calculation, overdue detection, fine calculation
- `SearchServiceTest`: partial match, case insensitivity, not-found returns null

**Deliverable:** All tests pass with `./gradlew test`.

---

## Assignment 10: Integration
Write a `LibraryApp` class with a `main()` that runs a full simulation:
1. Create 2 branches with addresses
2. Add 10+ books across branches
3. Register 4 patrons of mixed tiers
4. Perform checkouts and returns over a simulated 30-day period
5. Search for books by title
6. Print a branch report and fine summary using ReportBuilder

**Deliverable:** Running `LibraryApp` produces clean, readable console output demonstrating all features working together.

---

## Rules
- Each assignment builds on the previous — don't skip ahead.
- Every class must have private fields and proper getters/setters.
- Every constructor must validate its inputs.
- Use arrays (not ArrayList) for Branch catalog and Patron checkouts.
- Commit to git after each assignment with a message like "Assignment 3: Branch with array of objects".
