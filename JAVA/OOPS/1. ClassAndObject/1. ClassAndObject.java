/*
 * ============================================================================
 * TOPIC: CLASS AND OBJECT IN JAVA
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - CLASS: A blueprint, prototype, or user-defined data type from which 
 *      individual objects are created. It defines variables (state) and methods 
 *      (behavior) common to all objects of that type. A class does not occupy 
 *      memory until an instance (object) is created.
 *    - OBJECT: A real-world entity and concrete instance of a class. It has:
 *      (a) State: Represented by attributes/data members (e.g., name, age)
 *      (b) Behavior: Represented by member functions/methods (e.g., study(), display())
 *      (c) Identity: A unique address in memory allocated on the heap.
 *
 * 2. DIAGRAM:
 *
 *         +-----------------------------------------------+
 *         |                   Student                     |  <-- CLASS (Blueprint)
 *         +-----------------------------------------------+
 *         | - name : String                               |  <-- Attributes (State)
 *         | - age  : int                                  |
 *         +-----------------------------------------------+
 *         | + Student(name: String, age: int)             |  <-- Constructor
 *         | + study()   : void                            |  <-- Methods (Behavior)
 *         | + display() : void                            |
 *         +-----------------------------------------------+
 *                                 |
 *                                 | new Student("Swaraj", 22)
 *                                 v
 *         +-----------------------------------------------+
 *         |             obj (Object / Instance)           |  <-- Heap Memory
 *         +-----------------------------------------------+
 *         | name = "Swaraj"                               |
 *         | age  = 22                                     |
 *         +-----------------------------------------------+
 *
 * 3. KEY CONCEPTS:
 *    - 'new' Keyword: Dynamically allocates memory for the object on the Heap.
 *    - Constructor: Initializes the freshly allocated object's state.
 *    - 'this' Keyword: Differentiates instance variables from parameter variables.
 * ============================================================================
 */

class Student {
    String name;
    int age;

    // Constructor: Called automatically when an object is instantiated
    Student(String name, int age) {
        this.name = name; // 'this.name' refers to instance field, 'name' is parameter
        this.age = age;
    }

    // Behavior: Method simulating studying action
    void study() {
        System.out.println(name + " is studying");
    }

    // Behavior: Method displaying student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
    }
}

class ClassAndObject {
    public static void main(String[] args) {
        // Creating an Object (Instance) of Student class
        Student obj = new Student("Swaraj", 22);

        // Calling object behaviors / methods
        obj.study();
        obj.display();
    }
}
