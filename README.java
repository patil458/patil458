// Base class (Grandparent)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Parent)
class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Mammals give birth to young ones.");
    }
}

// Derived class (Child)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Calling methods from all levels of inheritance
        dog.eat();      // From Animal class
        dog.giveBirth(); // From Mammal class
        dog.bark();     // From Dog class
    }
}
