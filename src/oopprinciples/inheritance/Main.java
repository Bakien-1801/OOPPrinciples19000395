package oopprinciples.inheritance;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(); // Shape is the super class
        shape.draw(); // Overriding draw() method
        Circle circle = new Circle(0); // Circle inherits from Shape
        circle.draw(); // Overriding draw() method
        Rectangle rectangle = new Rectangle( ); // Rectangle inherits from Shape
        rectangle.draw(); // Overriding draw() method
        
    }
}
