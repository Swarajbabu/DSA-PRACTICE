/*
 * ============================================================================
 * TOPIC: HIERARCHICAL INHERITANCE IN JAVA
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - Hierarchical Inheritance is an object-oriented pattern where MULTIPLE 
 *      subclasses inherit directly from a SINGLE superclass.
 *    - Relationship: One Parent -> Multiple Child classes (Tree structure).
 *    - Purpose: Common features are grouped in the parent class to avoid 
 *      duplication, while sibling classes remain isolated and implement their
 *      own distinctive specializations.
 *
 * 2. DIAGRAM:
 *
 *                       +-----------------------------------------------+
 *                       |                Animal (Parent)                |
 *                       +-----------------------------------------------+
 *                       | # name : String                               |
 *                       +-----------------------------------------------+
 *                       | + Sound() : void                              |
 *                       +-----------------------------------------------+
 *                                               ^
 *                                               |
 *                       +-----------------------+-----------------------+
 *                       | extends                               | extends
 *                       |                                       |
 *         +---------------------------+           +---------------------------+
 *         |       Dog (Child 1)       |           |       Cat (Child 2)       |
 *         +---------------------------+           +---------------------------+
 *         | (inherits name & Sound()) |           | (inherits name & Sound()) |
 *         +---------------------------+           +---------------------------+
 *         | + Bark() : void           |           | + Meom() : void           |
 *         +---------------------------+           +---------------------------+
 *
 * 3. KEY CONCEPTS:
 *    - Shared Base: Both Dog and Cat share 'name' and 'Sound()' from Animal.
 *    - Sibling Independence: Dog and Cat cannot access each other's unique methods
 *      (e.g., Cat cannot call Bark(), and Dog cannot call Meom()).
 * ============================================================================
 */

class HierarchicalInheritance {

    // Common Parent Class
    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        public void Sound() {
            System.out.println("Animals make different sounds");
            System.out.println("Name of the animal: " + name);
        }
    }

    // Subclass 1: Dog inheriting from Animal
    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }

        public void Bark() {
            System.out.println("Name of the animal: " + name);
            System.out.println("Animal make sounds Barking");
        }
    }

    // Subclass 2: Cat inheriting from Animal
    static class Cat extends Animal {
        Cat(String name) {
            super(name);
        }

        public void Meom() {
            System.out.println("Name of the animal: " + name);
            System.out.println("Animal make sounds meom");
        }
    }

    public static void main(String[] args) {
        // Instantiate and test Cat object
        Cat obj = new Cat("home Cat");
        obj.Sound(); // Inherited from Animal
        obj.Meom();  // Defined in Cat

        System.out.println("\n");

        // Instantiate and test Dog object
        Dog obj1 = new Dog("Street Dog");
        obj1.Sound(); // Inherited from Animal
        obj1.Bark();  // Defined in Dog
    }
}
