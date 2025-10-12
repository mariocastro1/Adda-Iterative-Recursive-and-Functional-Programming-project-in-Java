# Project on Iterative, Recursive, and Functional Programming in Java

This repository contains the implementation of the **Individual Project 1** for the course *Analysis and Design of Data and Algorithms (ADDA/EDA)*, academic year **2023–2024**.  
The main objective of this project was to explore and compare **different programming paradigms** in Java — specifically **iterative**, **recursive (tail and non-tail)**, and **functional (stream-based)** approaches — across several algorithmic exercises.

---

## 📘 Project Overview

The project consists of four main exercises, each designed to test the student’s ability to design, analyze, and implement algorithms using distinct paradigms of computation.  
All solutions were developed in **Java**, following the principles taught in the course and structured to allow easy comparison between approaches.

Each exercise reads input data from files and outputs the results to the console, maintaining separation between the data input process and the algorithmic logic.

---

## 🧩 Exercises Implemented

### **Exercise 1 – Stream to Iterative and Recursive Transformation**
A provided stream-based method using the Java `Stream` API was analyzed and reimplemented in two equivalent ways:
- **Iterative implementation:** using standard loops and conditional structures.
- **Tail-recursive implementation:** preserving the same logic through recursion.

The exercise involved a custom record type `EnteroCadena` and required manipulation of data using Java’s functional programming capabilities, later converted into more traditional paradigms.

---

### **Exercise 2 – Function f(a, b): Recursive and Functional Variants**
This task defined a recursive mathematical function returning a **list of integers** based on given conditions.  
Implementations included:
- **Non-tail recursive** solution.
- **Tail-recursive** version with accumulator.
- **Iterative** approach using `while` loops.
- **Functional** version expressed with Java streams.

The goal was to analyze the efficiency and structural differences among paradigms for the same logic.

---

### **Exercise 3 – Interleaving Two Files**
Two text files (`A` and `B`) containing strings were processed using iterators to produce a new list where the contents were **interleaved in groups of two** (two elements from `A`, then two from `B`, etc.).  
This problem required:
- An **iterative** solution using explicit file iterators.
- A **tail-recursive** version.
- A **functional** stream-based implementation.

The challenge explicitly forbade loading the entire files into memory, enforcing efficient use of iterators.

---

### **Exercise 4 – Function g(a, b): Multi-Recursive String Composition**
A recursive string-generating function was implemented in several forms:
- **Plain recursion (without memoization)**.
- **Recursive version with memoization** for performance improvement.
- **Iterative** solution replicating the same logic.

This exercise focused on understanding recursion depth, redundancy, and optimization via caching mechanisms.

---

## ⚙️ Implementation Notes

- The code was developed in **Eclipse IDE**, using Java 17.
- Input and output handling are implemented as independent components to ensure modularity.
- Several **utility and testing classes** are omitted or simplified in this repository, since they rely on **university-provided libraries** that cannot be publicly distributed.  
  As a result, the current public version may not compile fully without these proprietary components.

---

## 🧪 Testing

Each exercise includes:
- Unit tests and printed outputs for the provided datasets.
- Validation against sample inputs defined in the original assignment specification.
- Comparison of results between different paradigmatic implementations (iterative, recursive, functional).

Screenshots of test executions were included in the original project report submitted for grading.

---

## 🧭 Learning Outcomes

Through this project, the following objectives were achieved:
- Gaining deeper understanding of recursion and its optimization through tail-recursive design.
- Mastering the use of Java’s `Stream` API for functional programming.
- Comparing the trade-offs between imperative and declarative paradigms.
- Strengthening abstraction and modularity principles in algorithm design.

---

## 🧾 License

This project is distributed for educational and demonstrative purposes only.  
Certain components remain property of the University and cannot be publicly released.

---

## 👤 Author

**Mario Castro García**  
*Analysis and Design of Data and Algorithms – Individual Project 1 (2023–2024)*  
Universidad de Sevilla
