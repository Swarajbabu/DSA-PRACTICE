/*
 * ============================================================================
 * TOPIC: RUN-TIME POLYMORPHISM (DYNAMIC METHOD DISPATCH) IN JAVA
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - Run-Time Polymorphism (also known as Dynamic Polymorphism or Late Binding)
 *      is a process in which a call to an overridden method is resolved at RUNTIME 
 *      rather than at compile-time.
 *    - In Java, this is achieved through Method Overriding using inheritance and 
 *      upcasting (supertype reference referring to a subtype object).
 *    - Dynamic Method Dispatch: When an overridden method is called through a reference 
 *      of a parent class, Java determines which version of that method to execute based 
 *      on the actual OBJECT being referred to at runtime, NOT the reference type.
 *
 * 2. DIAGRAM:
 *
 *                      +-----------------------------------------------+
 *                      |                Animal (Parent)                |
 *                      +-----------------------------------------------+
 *                      | + sound() : "Animal makes different sounds"   |
 *                      +-----------------------------------------------+
 *                                              ^
 *                                              | extends (IS-A)
 *                      +-----------------------+-----------------------+
 *                      |                                               |
 *       +------------------------------+                +------------------------------+
 *       |         Dog (Child)          |                |         Cat (Child)          |
 *       +------------------------------+                +------------------------------+
 *       | + sound() : (Barking sound)  |                | + sound() : (Meowing sound)  |
 *       +------------------------------+                +------------------------------+
 *                      ^                                               ^
 *                      |                                               |
 *        Animal a = new Dog();                           Animal a = new Cat();
 *              a.sound();                                      a.sound();
 *                      |                                               |
 *                      v                                               v
 *             Calls Dog's sound()                             Calls Cat's sound()
 *         "Dog makes a barking sound"                     "Cat makes a meowing sound"
 *
 * 3. KEY RULES FOR METHOD OVERRIDING:
 *    - The method in the child class MUST have the same name and parameter list as in the parent.
 *    - There MUST be an IS-A relationship (Inheritance).
 *    - Return type must be the same or covariant (subtype).
 *    - Access modifier cannot be more restrictive than the parent class method.
 *    - Private, static, and final methods CANNOT be overridden.
 *    - '@Override' annotation is recommended for compile-time safety.
 * ============================================================================
 */

// Superclass (Parent)
class Animal {
    public void sound() {
        System.out.println("Animal makes different sounds");
    }
}

// Subclass 1 (Child extending Animal)
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog makes a barking sound");
    }
}

// Subclass 2 (Child extending Animal)
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat makes a meowing sound");
    }
}

class RunTimePolymorphism {
    public static void main(String[] args) {
        // Superclass reference variable
        Animal a;

        // Upcasting: Parent reference referring to Dog instance
        a = new Dog();
        a.sound(); // Resolved at runtime -> executes Dog's sound()

        // Upcasting: Parent reference referring to Cat instance
        a = new Cat();
        a.sound(); // Resolved at runtime -> executes Cat's sound()
    }
}

// Runner class matching user request
class Main {
    public static void main(String[] args) {
        RunTimePolymorphism.main(args);
    }
}
