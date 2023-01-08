package oopprinciples.inheritance;

public class Circle extends Shape { // Circle inherits from Shape
    public Circle(double d) {
   }

   public void draw() { // Overriding draw() method
        System.out.println("drawing circle..."); // Overriding draw() method
    }
}
