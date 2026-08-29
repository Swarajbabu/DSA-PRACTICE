/*
 * ============================================================================
 * TOPIC: MULTILEVEL INHERITANCE IN JAVA
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - Multilevel Inheritance is a mechanism where a class inherits from a derived
 *      class, creating an inheritance chain of multiple levels:
 *      Grandparent Class -> Parent Class -> Child Class.
 *    - Transitive Property: The lowest child class inherits all accessible 
 *      properties and methods from all predecessor classes above it in the chain.
 *
 * 2. DIAGRAM:
 *
 *         +-----------------------------------------------+
 *         |             Animal (Grandparent)              |
 *         +-----------------------------------------------+
 *         | # name : String                               |
 *         +-----------------------------------------------+
 *         | + sound() : void                              |
 *         +-----------------------------------------------+
 *                                 ^
 *                                 | extends
 *         +-----------------------------------------------+
 *         |                 Dog (Parent)                  |
 *         +-----------------------------------------------+
 *         | (inherits name & sound() from Animal)         |
 *         +-----------------------------------------------+
 *         | + bark() : void                               |
 *         +-----------------------------------------------+
 *                                 ^
 *                                 | extends
 *         +-----------------------------------------------+
 *         |                Puppy (Child)                  |
 *         +-----------------------------------------------+
 *         | (inherits name, sound() from Animal           |
 *         |  and bark() from Dog)                         |
 *         +-----------------------------------------------+
 *         | + weep() : void                               |
 *         +-----------------------------------------------+
 *
 * 3. KEY CONCEPTS:
 *    - Inheritance Chain: Puppy IS-A Dog, and Dog IS-A Animal, so Puppy IS-A Animal.
 *    - Constructor Chaining: Puppy() calls super() -> Dog() calls super() -> Animal().
 *    - The bottom class can call methods from all ancestral levels.
 * ============================================================================
 */

class MultilevelInheritance {

    // Grandparent Class
    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        public void sound() {
            System.out.println("Animal makes a sound");
            System.out.println("Name of the Animal: " + name);
        }
    }

    // Parent Class inheriting from Animal
    static class Dog extends Animal {
        Dog(String name) {
            super(name); // Invokes Animal constructor
        }

        public void bark() {
            System.out.println("Name of the Animal: " + name);
            System.out.println("Sound is Bark");
        }
    }

    // Child Class inheriting from Dog
    static class Puppy extends Dog {
        Puppy(String name) {
            super(name); // Invokes Dog constructor
        }

        public void weep() {
            System.out.println("Name of the Animal: " + name);
            System.out.println("Puppy is weeping / whining");
        }
    }

    public static void main(String[] args) {
        Puppy obj = new Puppy("Little Puppy");

        System.out.println("Name: " + obj.name);
        obj.sound(); // Inherited from Animal (Grandparent)
        obj.bark();  // Inherited from Dog (Parent)
        obj.weep();  // Defined in Puppy (Child)
    }
}
