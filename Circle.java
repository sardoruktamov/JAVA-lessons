import java.awt.print.Printable;

public class Circle implements Drawable{
    @Override
    public void draw() {

    }

    @Override
    public void print() {

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.message();
    }
}
