package OOP;

// SIMPLE INHERITANCE

class Dog {
    void display2() {
        System.out.println("This is Dog");
    }
}
class Animal extends Dog{
    void display() {
        System.out.println("This is Animal");
    }
}

// MULTI-LEVEL INHERITANCE

class Grandfather {
    void ability1() {
        System.out.println("This is Grandpa Abilities");
    }
}
class Father extends Grandfather{
    void ability2() {
        System.out.println("This is Father Abilities Inherited");
    }
}
class Son extends Father {
    void ability3() {
        System.out.println("This is Son Abilities Inherited");
    }
}

// HIERARCHICAL INHERITANCE

class Devices {
    void main_d() {
        System.out.println("This are devices : ");
    }
}

class Mobile extends Devices{
    void d1() {
        System.out.print("Mobile ");
    }
}
class Television extends Devices{
    void d2() {
        System.out.print("TV\n");
    }
}

// MULTIPLE INHERITANCE

interface Dad {
    void show();
}
interface Mom {
    void display();
}
class Child implements Dad, Mom {

    public void show() {
        System.out.println("Father's Method");
    }

    public void display() {
        System.out.println("Mother's Method");
    }
}

public class Inheritance{
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.display();
        animal.display2();

        Son s = new Son();
        s.ability1();
        s.ability2();
        s.ability3();

        Mobile m = new Mobile();
        Television tv = new Television();
        m.main_d();
        m.d1();
        tv.d2();

        Child c = new Child();
        c.show();
        c.display();
    }
}
