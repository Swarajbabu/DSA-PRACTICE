/*
 * ============================================================================
 * TOPIC: SINGLE INHERITANCE IN JAVA
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - Single Inheritance is an object-oriented mechanism where ONE derived class
 *      (subclass / child class) inherits attributes and behaviors from exactly 
 *      ONE base class (superclass / parent class).
 *    - Purpose: Promotes code reusability and creates an "IS-A" relationship
 *      (e.g., Dog IS-A Animal).
 *
 * 2. DIAGRAM:
 *
 *         +-----------------------------------------------+
 *         |                Animal (Parent)                |
 *         +-----------------------------------------------+
 *         | # name : String                               |
 *         +-----------------------------------------------+
 *         | + Animal(name: String)                        |
 *         | + Sounds() : void                             |
 *         +-----------------------------------------------+
 *                                 ^
 *                                 | extends (IS-A)
 *         +-----------------------------------------------+
 *         |                  Dog (Child)                  |
 *         +-----------------------------------------------+
 *         | (inherits name & Sounds() from Animal)        |
 *         +-----------------------------------------------+
 *         | + Dog(name: String)                           |
 *         | + Bark() : void                               |  <-- Specialized method
 *         +-----------------------------------------------+
 *
 * 3. KEY CONCEPTS:
 *    - 'extends': Keyword used to establish an inheritance relationship.
 *    - 'super(name)': Invokes the parent class constructor to initialize inherited fields.
 *    - Code Reuse: Dog directly gains access to the Sounds() method without rewriting it.
 * ============================================================================
 */

class SingleInheritance {

    // Parent Class (Base / Superclass)
    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        public void Sounds() {
            System.out.println("Animal Make sounds Differently");
            System.out.println("Name of the Animal: " + name);
        }
    }

    // Child Class (Derived / Subclass) inheriting from Animal
    static class Dog extends Animal {
        Dog(String name) {
            super(name); // Call parent class constructor
        }

        public void Bark() {
            System.out.println("Name of the Animal: " + name);
            System.out.println("Make Sound is Bark");
        }
    }

    public static void main(String[] args) {
        // Instantiate child class object
        Dog obj = new Dog("Streat Dog");

        // Accessing inherited property
        System.out.println(obj.name);

        // Accessing inherited method from Animal
        obj.Sounds();

        // Accessing specialized method in Dog
        obj.Bark();
    }
}
