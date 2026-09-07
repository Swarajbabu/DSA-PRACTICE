/*
 * ============================================================================
 * TOPIC: ABSTRACTION (ABSTRACT CLASS) IN JAVA
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - Abstraction is the core OOP principle of hiding internal implementation details 
 *      and displaying only essential features/functionality to the user.
 *    - In Java, Abstraction is achieved in two ways:
 *        1. Abstract Classes (0% to 100% abstraction)
 *        2. Interfaces (100% abstraction in pure contract form)
 *
 *    - Abstract Class:
 *      - A class declared with the 'abstract' keyword.
 *      - It CANNOT be instantiated directly (e.g., 'new Vehicle()' causes a compilation error).
 *      - It serves as a base/blueprint for subclasses to inherit and implement.
 *      - Can contain:
 *          a) Abstract methods: declared without a body (must be overridden by subclasses).
 *          b) Concrete methods: regular methods with a complete implementation.
 *          c) Constructors, instance variables (state), and static/final methods.
 *
 * 2. DIAGRAM:
 *
 *                      +-----------------------------------------------+
 *                      |           abstract class Vehicle              |
 *                      +-----------------------------------------------+
 *                      | + fuelType() : "Runs on petrol/diesel/..."    | <-- Concrete Method
 *                      | + abstract void start();                      | <-- Abstract Method
 *                      +-----------------------------------------------+
 *                                              ^
 *                                              | extends (Inheritance)
 *                      +-----------------------+-----------------------+
 *                      |                                               |
 *       +------------------------------+                +------------------------------+
 *       |             Car              |                |             Bike             |
 *       +------------------------------+                +------------------------------+
 *       | + start() : "Car starts with |                | + start() : "Bike starts with|
 *       |              a key/button"   |                |              a kick/self-..."|
 *       +------------------------------+                +------------------------------+
 *                      ^                                               ^
 *                      |                                               |
 *        Vehicle v1 = new Car();                         Vehicle v2 = new Bike();
 *              v1.start();                                     v2.start();
 *              v1.fuelType();                                  v2.fuelType();
 *                      |                                               |
 *                      v                                               v
 *         "Car starts with a key/button"                 "Bike starts with a kick/self-start"
 *         "Runs on petrol/diesel/electricity"
 *
 * 3. KEY RULES FOR ABSTRACT CLASSES:
 *    - Cannot be directly instantiated using 'new'.
 *    - If a class contains at least one abstract method, the class itself MUST be declared 'abstract'.
 *    - Any concrete subclass extending an abstract class MUST provide implementations for ALL 
 *      inherited abstract methods (or be declared abstract itself).
 *    - An abstract class CAN have constructors, member variables, and final/static methods.
 *    - The constructor of an abstract class is invoked when a subclass object is instantiated 
 *      via 'super()'.
 * ============================================================================
 */

// Abstract Superclass
abstract class Vehicle {
    // 1. Abstract method: has no body, must be implemented by subclasses
    abstract void start();

    // 2. Concrete method: has a complete implementation shared by subclasses
    void fuelType() {
        System.out.println("Runs on petrol/diesel/electricity");
    }
}

// Concrete Subclass 1: Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key/button");
    }
}

// Concrete Subclass 2: Bike
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick/self-start");
    }
}

// Main execution class for Abstract Class demonstration
class AbstractClass {
    public static void main(String[] args) {
        // Upcasting: Parent abstract reference pointing to Child Car object
        Vehicle v1 = new Car();
        v1.start();       // Output: Car starts with a key/button
        v1.fuelType();    // Output: Runs on petrol/diesel/electricity

        // Upcasting: Parent abstract reference pointing to Child Bike object
        Vehicle v2 = new Bike();
        v2.start();       // Output: Bike starts with a kick/self-start
        v2.fuelType();    // Output: Runs on petrol/diesel/electricity
    }
}

// Alias runner class matching the requested topic name
class Abstraction_abstractclass {
    public static void main(String[] args) {
        AbstractClass.main(args);
    }
}

// Runner class matching user request
class Main {
    public static void main(String[] args) {
        AbstractClass.main(args);
    }
}
