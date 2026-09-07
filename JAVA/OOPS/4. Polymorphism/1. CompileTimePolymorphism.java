/*
 * ============================================================================
 * TOPIC: COMPILE-TIME POLYMORPHISM (METHOD OVERLOADING) IN JAVA
 * ============================================================================
 *
 * 1. DEFINITION:
 *    - Compile-Time Polymorphism (also known as Static Polymorphism or Early Binding)
 *      occurs when the Java compiler resolves which method to invoke at compile time.
 *    - In Java, this is primarily achieved via Method Overloading.
 *    - Method Overloading: Defining multiple methods in the same class with the SAME 
 *      method name, but DIFFERENT parameter lists (differing in argument count, 
 *      data types, or sequence of parameters).
 *
 * 2. DIAGRAM:
 *
 *                     +------------------------------------+
 *                     |             Calculate              |
 *                     +------------------------------------+
 *                     | + add(a: int, b: int)        : int | <-- 2 int parameters
 *                     | + add(a: int, b: int, c: int): int | <-- 3 int parameters
 *                     | + add(a: double, b: double)  : dbl | <-- 2 double parameters
 *                     +------------------------------------+
 *                                       |
 *            +--------------------------+--------------------------+
 *            |                          |                          |
 *     obj.add(100, 200)      obj.add(100, 200, 300)    obj.add(11.55, 26.75)
 *            |                          |                          |
 *            v                          v                          v
 *    Binds add(int, int)     Binds add(int, int, int)   Binds add(double, double)
 *       Result: 300                Result: 600               Result: 38.3
 *
 * 3. KEY RULES FOR METHOD OVERLOADING:
 *    - MUST have the same method name.
 *    - MUST have different argument lists (different type, number, or order).
 *    - Changing ONLY the return type is NOT valid method overloading in Java
 *      (it causes a compiler error: method already defined).
 *    - Overloaded methods can have different access modifiers and exception specifications.
 * ============================================================================
 */

class Calculate {
    // 1. Overloaded method with 2 integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // 2. Overloaded method with 3 integer parameters (overloaded by parameter count)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Overloaded method with 2 double parameters (overloaded by parameter data type)
    double add(double a, double b) {
        return a + b;
    }
}

class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculate obj = new Calculate();

        // Calls add(int, int) -> 300
        System.out.println(obj.add(100, 200));

        // Calls add(int, int, int) -> 600
        System.out.println(obj.add(100, 200, 300));

        // Calls add(double, double) -> 38.3
        System.out.println(obj.add(11.55, 26.75));
    }
}

// Runner class matching user request
class Main {
    public static void main(String[] args) {
        CompileTimePolymorphism.main(args);
    }
}
