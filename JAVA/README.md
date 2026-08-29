# ☕ Java & Object-Oriented Programming (OOP) Track

Welcome to the **Java Track** of the DSA repository. This module houses standard Java collection implementations, algorithmic patterns, and modular Object-Oriented Programming (OOP) demonstrations with comprehensive ASCII diagrams.

---

## 📁 Contents

| Folder | Topic | Description & Highlights |
|:---|:---|:---|
| [`ArrayList/`](ArrayList/) | Dynamic Arrays | ArrayList operations and QuickCart interactive demo |
| [`Arrays/`](Arrays/) | Arrays & Pointers | Array initialization, sorting, and two-pointer algorithms |
| [`HashMap/`](HashMap/) | Hash Maps | Key-value pairs, fast lookup, and frequency counting |
| [`OOPS/`](OOPS/) | Core OOP Principles | **1. Class & Object**, **2. Inheritance** (Single, Multilevel, Hierarchical), and **3. Encapsulation** |
| [`Strings/`](Strings/) | String Operations | Palindrome verification and two-pointer traversal |
| [`SubArray/`](SubArray/) | Subarray Problems | Sliding window algorithms & Product of Array Except Self |

---

## 🏛️ OOP Module Structure

The [`OOPS/`](OOPS/) directory is organized into numbered learning modules:

```text
OOPS/
├── 1. ClassAndObject/
│   └── 1. ClassAndObject.java          # Blueprint vs. Heap Instance, Constructors, 'this'
├── 2. Inheritance/
│   ├── 1. SingleInheritance.java       # Animal -> Dog
│   ├── 2. MultilevelInheritance.java   # Animal -> Dog -> Puppy
│   └── 3. HierarchicalInheritance.java # Animal -> Dog, Animal -> Cat
└── 3. Encapsulation/
    └── 1. EncapsulationDemo.java       # Data hiding (private fields) & validated getters/setters
```

Each Java OOP file includes:
1. **Definition**: Formal explanation of the concept.
2. **ASCII Diagram**: Visual representation of the class structure and memory hierarchy.
3. **Key Concepts**: Keywords (`extends`, `super`, `private`, `public`, `this`).
4. **Runnable Example**: Fully verified code with output demonstrations.

---

## 🚀 How to Run

Compile and execute using `javac` and `java`:

```bash
# Example: Running Encapsulation Demo
javac "OOPS/3. Encapsulation/1. EncapsulationDemo.java"
java -cp "OOPS/3. Encapsulation" EncapsulationDemo

# Example: Running Multilevel Inheritance
javac "OOPS/2. Inheritance/2. MultilevelInheritance.java"
java -cp "OOPS/2. Inheritance" MultilevelInheritance
```
