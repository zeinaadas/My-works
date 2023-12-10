package javaapplication11;

public class BorderDecorator extends ShapeDecorator {

    private Shape shape;
    private Color borderColor;
    private BorderStyle borderStyle;
    private double borderThickness;

    public BorderDecorator(Shape shape, Color borderColor, BorderStyle borderStyle, double borderThickness) {
        this.shape = shape;
        this.borderColor = borderColor;
        this.borderStyle = borderStyle;
        this.borderThickness = borderThickness;
    }
هخؤ
    public void draw() {
        shape.draw();
        System.out.println("Border: Color - " + borderColor + ", Style - " + borderStyle + ", Thickness - " + borderThickness);
    }

    public String getDescription() {
        return shape.getDescription() + ", Border: Color - " + borderColor + ", Style - " + borderStyle + ", Thickness - " + borderThickness;
    }
}
