# TOMACRUZ_Lab-6_SOLID-Principles
My solution for the Lab Assignment 6 - SOLID Principles.

## Problem Statement
The NEU (New Era University) Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers. Initially, the `Student` object had tightly coupled methods like `borrowBook(title)` and `borrowJournal(title)`. 

This design violated the **Dependency Inversion Principle (DIP)** and the **Open/Closed Principle (OCP)** because introducing new resource types (like Audio Books or E-Journals) would require modifying the `Student` class. To ensure a robust system that can seamlessly accommodate future resources, the program has been refactored. The `Student` class now depends on an abstraction (`LibraryResource` interface) rather than concrete implementations, adhering strictly to SOLID principles.
