package oopprinciples.abstraction;

public class MainTest {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Animal is the super class
        animal.hienthi(); // Overriding hienthi() method

        Dog dog = new Dog(); // Dog inherits from Animal
        dog.hienthi(); // Overriding hienthi() method

        Cat cat = new Cat(); // Cat inherits from Animal
        cat.hienthi();
        
    }
}
