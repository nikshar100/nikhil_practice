# Library Operations Support System (LibraryOSS) — Design Document

## Package Structure

```
libraryoss/
├── model/
│   ├── Address.java
│   ├── Book.java
│   ├── BookStatus.java
│   ├── BookType.java
│   ├── Branch.java
│   ├── Checkout.java
│   ├── Fine.java
│   ├── Patron.java
│   └── PatronTier.java
├── service/
│   ├── CheckoutService.java
│   └── SearchService.java
└── util/
    └── ReportBuilder.java
```

## UML Class Diagrams

### Enumerations

```
┌──────────────────────┐
│    <<enumeration>>   │
│      BookType        │
├──────────────────────┤
│ FICTION              │
│ NON_FICTION          │
│ REFERENCE            │
│ PERIODICAL           │
└──────────────────────┘

┌──────────────────────┐
│    <<enumeration>>   │
│      BookStatus      │
├──────────────────────┤
│ AVAILABLE            │
│ CHECKED_OUT          │
│ ON_HOLD              │
│ LOST                 │
│ DAMAGED              │
└──────────────────────┘

┌──────────────────────┐
│    <<enumeration>>   │
│      PatronTier      │
├──────────────────────┤
│ STANDARD             │
│ PREMIUM              │
│ STUDENT              │
├──────────────────────┤
│ - maxCheckouts: int  │
│ - finePerDay: double │
│ - loanDays: int      │
├──────────────────────┤
│ + getMaxCheckouts(): int    │
│ + getFinePerDay(): double   │
│ + getLoanDays(): int        │
└──────────────────────┘
```

### Address

```
┌─────────────────────────────────────────────┐
│                  Address                     │
├─────────────────────────────────────────────┤
│ - number: int                               │
│ - street: String                            │
│ - city: String                              │
│ - state: String                             │
│ - zip: String                               │
├─────────────────────────────────────────────┤
│ + Address(number, street, city, state, zip) │
│ + toString(): String                        │
│ + getNumber(): int                          │
│ + getStreet(): String                       │
│ + getCity(): String                         │
│ + getState(): String                        │
│ + getZip(): String                          │
└─────────────────────────────────────────────┘
```

### Book

```
┌───────────────────────────────────────────────────────────┐
│                          Book                             │
├───────────────────────────────────────────────────────────┤
│ - isbn: String  {immutable, validated}                    │
│ - title: String                                          │
│ - author: String                                         │
│ - bookType: BookType                                     │
│ - status: BookStatus                                     │
│ - branch: Branch                                         │
├───────────────────────────────────────────────────────────┤
│ + Book(isbn, title, author, bookType, branch)            │
│ + getIsbn(): String                                      │
│ + getTitle(): String                                     │
│ + setTitle(title: String): void                          │
│ + getAuthor(): String                                    │
│ + setAuthor(author: String): void                        │
│ + getBookType(): BookType                                │
│ + getStatus(): BookStatus                                │
│ + setStatus(status: BookStatus): void                    │
│ + getBranch(): Branch                                    │
│ + setBranch(branch: Branch): void                        │
│ + toString(): String                                     │
├───────────────────────────────────────────────────────────┤
│ Validation: isbn must match "XXX-X-XX-XXXXXX-X" format   │
│ (contains exactly 4 dashes, not null)                    │
│ title and author must not be null or empty                │
└───────────────────────────────────────────────────────────┘
```

### Branch

```
┌───────────────────────────────────────────────────────────┐
│                         Branch                            │
├───────────────────────────────────────────────────────────┤
│ - branchId: String  {immutable}                          │
│ - branchName: String                                     │
│ - address: Address                                       │
│ - catalog: Book[]                                        │
│ - bookCount: int                                         │
│ - MAX_CAPACITY: int = 500  {static final}                │
├───────────────────────────────────────────────────────────┤
│ + Branch(branchId, branchName, address)                   │
│ + getBranchId(): String                                  │
│ + getBranchName(): String                                │
│ + setBranchName(name: String): void                      │
│ + getAddress(): Address                                  │
│ + setAddress(address: Address): void                     │
│ + addBook(book: Book): boolean                           │
│ + removeBook(isbn: String): Book                         │
│ + findBookByIsbn(isbn: String): Book                     │
│ + findBooksByTitle(title: String): Book[]                 │
│ + getBookCount(): int                                    │
│ + isFull(): boolean                                      │
│ + getCatalog(): Book[]                                   │
│ + toString(): String                                     │
├───────────────────────────────────────────────────────────┤
│ Containment: Branch HAS-A Address                        │
│ Containment: Branch HAS-A Book[] (array of objects)      │
│ catalog is fixed-size array, bookCount tracks usage      │
└───────────────────────────────────────────────────────────┘
```

### Patron

```
┌───────────────────────────────────────────────────────────┐
│                         Patron                            │
├───────────────────────────────────────────────────────────┤
│ - patronId: String  {immutable}                          │
│ - name: String                                           │
│ - email: String                                          │
│ - phone: String                                          │
│ - address: Address                                       │
│ - tier: PatronTier                                       │
│ - checkouts: Checkout[]                                  │
│ - checkoutCount: int                                     │
│ - totalFines: double                                     │
│ - nextId: int  {static}                                  │
├───────────────────────────────────────────────────────────┤
│ + Patron(name, email, phone, address, tier)              │
│ + getPatronId(): String                                  │
│ + getName(): String                                      │
│ + setName(name: String): void                            │
│ + getEmail(): String                                     │
│ + setEmail(email: String): void                          │
│ + getPhone(): String                                     │
│ + setPhone(phone: String): void                          │
│ + getAddress(): Address                                  │
│ + setAddress(address: Address): void                     │
│ + getTier(): PatronTier                                  │
│ + getCheckouts(): Checkout[]                             │
│ + getCheckoutCount(): int                                │
│ + canCheckout(): boolean                                 │
│ + addCheckout(checkout: Checkout): void                  │
│ + removeCheckout(checkout: Checkout): void               │
│ + getTotalFines(): double                                │
│ + addFine(amount: double): void                          │
│ + toString(): String                                     │
│ + generateId(): String  {static}                         │
├───────────────────────────────────────────────────────────┤
│ Validation: email must contain "@"                        │
│ Validation: phone must be exactly 10 digits              │
│ Containment: Patron HAS-A Address                        │
│ Containment: Patron HAS-A Checkout[]                     │
│ Static nextId auto-increments for ID generation          │
│ checkouts array sized by tier.getMaxCheckouts()          │
└───────────────────────────────────────────────────────────┘
```

### Checkout

```
┌───────────────────────────────────────────────────────────┐
│                       Checkout                            │
├───────────────────────────────────────────────────────────┤
│ - patron: Patron                                         │
│ - book: Book                                             │
│ - checkoutDate: int  (day number)                        │
│ - dueDate: int  (day number)                             │
│ - returned: boolean                                      │
│ - returnDate: int                                        │
├───────────────────────────────────────────────────────────┤
│ + Checkout(patron, book, checkoutDate)                   │
│ + getPatron(): Patron                                    │
│ + getBook(): Book                                        │
│ + getCheckoutDate(): int                                 │
│ + getDueDate(): int                                      │
│ + isReturned(): boolean                                  │
│ + returnBook(returnDate: int): void                      │
│ + isOverdue(currentDate: int): boolean                   │
│ + getDaysOverdue(currentDate: int): int                  │
│ + calculateFine(currentDate: int): double                │
│ + toString(): String                                     │
├───────────────────────────────────────────────────────────┤
│ Association: Checkout references Patron and Book         │
│ dueDate = checkoutDate + patron.getTier().getLoanDays()  │
│ Fine = daysOverdue * patron.getTier().getFinePerDay()    │
│ Validation: patron and book must not be null             │
│ Sets book status to CHECKED_OUT on creation              │
│ Sets book status to AVAILABLE on return                  │
└───────────────────────────────────────────────────────────┘
```

### Fine

```
┌───────────────────────────────────────────────────────────┐
│                         Fine                              │
├───────────────────────────────────────────────────────────┤
│ - patron: Patron                                         │
│ - checkout: Checkout                                     │
│ - amount: double                                         │
│ - daysOverdue: int                                       │
│ - paid: boolean                                          │
├───────────────────────────────────────────────────────────┤
│ + Fine(patron, checkout, currentDate)                    │
│ + getPatron(): Patron                                    │
│ + getCheckout(): Checkout                                │
│ + getAmount(): double                                    │
│ + getDaysOverdue(): int                                  │
│ + isPaid(): boolean                                      │
│ + markPaid(): void                                       │
│ + toString(): String                                     │
├───────────────────────────────────────────────────────────┤
│ amount calculated from checkout.getDaysOverdue() *       │
│ patron.getTier().getFinePerDay()                         │
│ Uses wrapper class Double for formatted output           │
└───────────────────────────────────────────────────────────┘
```

### CheckoutService

```
┌───────────────────────────────────────────────────────────┐
│                   CheckoutService                         │
├───────────────────────────────────────────────────────────┤
│ - checkouts: Checkout[]                                  │
│ - checkoutCount: int                                     │
│ - MAX_CHECKOUTS: int = 1000  {static final}              │
├───────────────────────────────────────────────────────────┤
│ + CheckoutService()                                      │
│ + checkout(patron, book, currentDate): Checkout          │
│ + returnBook(checkout, returnDate): Fine                 │
│ + getOverdueCheckouts(currentDate): Checkout[]           │
│ + getCheckoutsForPatron(patron): Checkout[]              │
├───────────────────────────────────────────────────────────┤
│ Validates: patron.canCheckout() before allowing          │
│ Validates: book.getStatus() == AVAILABLE                 │
│ Throws IllegalArgumentException on violations            │
└───────────────────────────────────────────────────────────┘
```

### SearchService

```
┌───────────────────────────────────────────────────────────┐
│                    SearchService                          │
├───────────────────────────────────────────────────────────┤
│ - branches: Branch[]                                     │
│ - branchCount: int                                       │
├───────────────────────────────────────────────────────────┤
│ + SearchService(branches: Branch[])                      │
│ + searchByTitle(title: String): Book[]                   │
│ + searchByAuthor(author: String): Book[]                 │
│ + searchByIsbn(isbn: String): Book                       │
│ + findPatronById(patrons: Patron[], id: String): Patron  │
│ + findPatronByName(patrons: Patron[], name: String): Patron[] │
├───────────────────────────────────────────────────────────┤
│ Uses String.contains() and equalsIgnoreCase() for search │
│ Iterates across all branches for cross-branch search     │
│ Returns null when not found (caller handles NPE)         │
└───────────────────────────────────────────────────────────┘
```

### ReportBuilder (util)

```
┌───────────────────────────────────────────────────────────┐
│                    ReportBuilder                          │
├───────────────────────────────────────────────────────────┤
│ - buffer: StringBuffer                                   │
├───────────────────────────────────────────────────────────┤
│ + ReportBuilder()                                        │
│ + buildBranchReport(branch: Branch): String              │
│ + buildPatronReport(patron: Patron): String              │
│ + buildFineReport(patron: Patron, fines: Fine[]): String │
│ + buildCheckoutStats(branches: Branch[],                 │
│     dailyStats: int[][]): String                         │
├───────────────────────────────────────────────────────────┤
│ Uses StringBuffer for efficient string concatenation     │
│ Uses wrapper classes (Integer, Double) for formatting    │
│ dailyStats is a 2D array: [branchIndex][dayOfWeek]      │
│ Demonstrates StringBuffer append, insert, toString       │
└───────────────────────────────────────────────────────────┘
```

## Relationship Diagram

```
                    ┌──────────┐
                    │  Branch  │
                    └────┬─────┘
                         │ has-a
              ┌──────────┼──────────┐
              │          │          │
              ▼          ▼          │
        ┌─────────┐ ┌────────┐    │
        │ Address │ │ Book[] │    │
        └─────────┘ └───┬────┘    │
                         │         │
              ┌──────────┘         │
              ▼                    │
        ┌──────────┐              │
        │   Book   │──────────────┘
        └────┬─────┘    belongs-to
             │
             │ referenced-by
             ▼
        ┌──────────┐         ┌──────────┐
        │ Checkout │────────▶│  Patron  │
        └────┬─────┘  ref    └────┬─────┘
             │                    │ has-a
             │               ┌────┼────┐
             ▼               ▼    ▼    ▼
        ┌──────────┐   ┌───────┐ │ ┌──────────┐
        │   Fine   │   │Address│ │ │Checkout[]│
        └──────────┘   └───────┘ │ └──────────┘
                                  ▼
                            ┌───────────┐
                            │PatronTier │
                            └───────────┘
```

## Key Design Decisions

1. **Arrays over ArrayList** — Branch catalog and Patron checkouts use fixed-size arrays to demonstrate manual array management, bounds checking, and the difference between array length and actual element count.

2. **Enums with fields** — PatronTier carries `maxCheckouts`, `finePerDay`, and `loanDays` as fields, demonstrating that enums can have constructors and methods.

3. **Immutable fields** — ISBN and patronId have getters but no setters, demonstrating selective encapsulation.

4. **Static members** — `Patron.nextId` for auto-ID generation, `Branch.MAX_CAPACITY` for constants.

5. **Packages** — Separates domain model from service logic from utilities, demonstrating code organization.

6. **StringBuffer in ReportBuilder** — Demonstrates efficient string building vs. concatenation in loops.

7. **2D array** — `dailyStats[branchIndex][dayOfWeek]` for checkout statistics demonstrates multidimensional arrays.

8. **Validation pattern** — Mirrors the Fulfillment project: constructors validate inputs and throw `IllegalArgumentException`.

## Implementation Order

1. Enums (BookType, BookStatus, PatronTier)
2. Address
3. Book
4. Branch (introduces arrays of objects)
5. Patron (introduces static, containment)
6. Checkout (introduces association between objects)
7. Fine (introduces calculation logic)
8. CheckoutService (wires objects together)
9. SearchService (String methods)
10. ReportBuilder (StringBuffer, 2D arrays)
