package javaapplication11;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public String getDescription() {
        return "This is a Circle \n";
    }
}
