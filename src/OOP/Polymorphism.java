package OOP;

class Calc {

// COMPILER-TIME POLYMORPHISM (METHOD OVERLOADING)

    int add (int a, int b){
        return a+b;
    }
    int add (int a, int b, int c) {
        return  a+b+c;
    }
}

// RUN-TIME POLYMORPHISM (METHOD OVERRIDING)

class Pet {
    void sound() {
        System.out.println("Pet comes in call");
    }
}
class Cat2 extends Pet{
    @Override
    void sound() {
        System.out.println("Cat says meow");
    }
}
class Dog2 extends Pet{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(12,23));
        System.out.println(c.add(12,23,34));

        Pet pet = new Cat2();
        pet.sound();
        Pet pet2 = new Dog2();
        pet2.sound();
    }
}
