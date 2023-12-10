package javaapplication11;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public String getDescription() {
        return "This is a Rectangle";
    }
}
