package oopprinciples;

import oopprinciples.abstraction.Animal;
import oopprinciples.abstraction.Cat;
import oopprinciples.abstraction.Dog;
import oopprinciples.encapsulation.Student;
import oopprinciples.inheritance.Circle;
import oopprinciples.inheritance.Rectangle;
import oopprinciples.inheritance.Shape;

public class TestFull {
    public static void main(String[] args) {

        System.out.println("Abstraction: ");
        Animal animal = new Dog();

        Dog dog = new Dog();
        dog.hienthi();

        Cat cat = new Cat();
        cat.hienthi();

        System.out.println("------------------------------- ");

        System.out.println("Encapsulation: ");
        Student student = new Student();
        student.setName("Nguyen Son Ba");
        System.out.println(student.getName());

        System.out.println("------------------------------- ");
        System.out.println("Inheritance: ");
        Shape shape = new Shape(); // Shape is the super class
        shape.draw(); // Overriding draw() method
        Circle circle = new Circle(0); // Circle inherits from Shape
        circle.draw(); // Overriding draw() method
        Rectangle rectangle = new Rectangle(); // Rectangle inherits from Shape
        rectangle.draw(); // Overriding draw() method
        

    }
}
