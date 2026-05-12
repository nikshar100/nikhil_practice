# Library Operations Support System (LibraryOSS) — Requirements

## Overview

A Java-based Operations Support System for managing a public library's catalog, patrons, and lending operations. The system tracks books, patrons, checkouts, and fines — modeling real-world containment and association relationships.

## Domain Description

A **Library** has multiple **Branches**. Each Branch has an **Address** and maintains a catalog of **Books**. A **Book** has a **BookType** (fiction, non-fiction, reference, periodical) and a **BookStatus** (available, checked_out, on_hold, lost, damaged). Each Book has an **ISBN** (formatted string) and belongs to one Branch.

A **Patron** has a **PatronTier** (standard, premium, student) which determines their max checkouts. Patrons have an Address and contact info. A **Checkout** associates a Patron with a Book, tracks due dates, and calculates **Fines** based on overdue days.

## Functional Requirements

### FR-1: Book Management
- Create books with ISBN validation (format: "XXX-X-XX-XXXXXX-X", must contain dashes)
- Assign books to a branch
- Track book status transitions
- Each branch maintains an array of books (fixed capacity per branch)

### FR-2: Patron Management
- Register patrons with required fields (name, address, email, phone, patron ID)
- Patron tier determines max simultaneous checkouts:
  - STANDARD: 5 books
  - PREMIUM: 10 books
  - STUDENT: 3 books
- Validate email contains "@" and phone is 10 digits

### FR-3: Checkout Operations
- Check out a book to a patron (changes book status to CHECKED_OUT)
- Enforce max checkout limit based on patron tier
- Track checkout date and due date (14-day default, 21 for premium)
- Return a book (changes status back to AVAILABLE)

### FR-4: Fine Calculation
- Calculate fines for overdue books ($0.25/day standard, $0.10/day student, $0.50/day premium)
- Track total fines per patron
- Display fine summary using formatted Strings

### FR-5: Search and Reporting
- Search books by title (String methods: contains, equalsIgnoreCase)
- Search patrons by ID or name
- Generate branch inventory report (iterate arrays, use StringBuffer for building output)
- Sort books by title (array sorting)

## Non-Functional Requirements

### NFR-1: Input Validation
- All constructors must validate required fields (throw IllegalArgumentException for null/invalid)
- ISBN format validation using String methods
- Email and phone format validation

### NFR-2: Encapsulation
- All fields private
- Access via getters/setters only
- Immutable fields (ISBN, patron ID) have no setters

### NFR-3: Memory Management
- Use arrays (not ArrayList) for branch book catalog — fixed size
- Use arrays of objects for patron checkout history
- Demonstrate understanding of reference vs. primitive types

### NFR-4: Code Organization
- Use packages to organize classes (model, service, util)
- Proper use of static vs. instance members
- Use `this` keyword for disambiguation

## Course Topic Coverage

| Topic | Where It Appears |
|-------|-----------------|
| Variables & Expressions | Fine calculation, date arithmetic |
| Control Structures (if/else) | Tier-based limits, status transitions, validation |
| Loops | Array traversal, search, report generation |
| Arrays (1D) | Book catalog per branch, patron checkout list |
| Arrays (2D) | Branch-by-day checkout statistics |
| OOP: Classes & Objects | All domain classes |
| Constructors | Parameterized constructors with validation |
| Encapsulation | Private fields, getters/setters, immutable ISBN |
| Containment (has-a) | Branch has Books, Patron has Address, Checkout has Book+Patron |
| Association | Book references Branch, Checkout references Patron |
| Static members | Utility methods, ID counters |
| this keyword | Constructor disambiguation |
| Arrays of Objects | Book[] in Branch, Checkout[] in Patron |
| NullPointerException | Defensive null checks in constructors |
| UML | Class diagrams in design doc |
| String/StringBuffer | ISBN validation, report building, search |
| Wrapper Classes | Integer for parsed IDs, Double for fines |
| Packages | model/service/util organization |
| Garbage Collection | Returning books removes checkout reference |
| Pass by reference | Methods that modify object state |
