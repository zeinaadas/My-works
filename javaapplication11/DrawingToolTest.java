package javaapplication11;

public class DrawingToolTest {

     public static void main(String[] args) {

        Shape circle = new Circle();

        Shape decoratedCircle = new FillColorDecorator(
                new BorderDecorator(
                        new BorderDecorator(
                                circle,
                                Color.BLACK,
                                BorderStyle.DASHED,
                                2.0),
                        Color.WHITE,
                        BorderStyle.SOLID,
                        1.0),
                Color.RED);

        decoratedCircle.draw();

        System.out.println(decoratedCircle.getDescription());
    }
}
