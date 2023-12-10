package javaapplication11;

public class FillColorDecorator extends ShapeDecorator {

    private Shape shape;
    private Color color;

    public FillColorDecorator(Shape shape, Color color) {
        this.shape = shape;
        this.color = color;
    }

    public void draw() {
        shape.draw();
        System.out.println("Filling with color: " + color);
    }

    public String getDescription() {
        return shape.getDescription() + ", Filled with color: " + color;
    }
}