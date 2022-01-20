public class Square extends Quadrangle implements Figure{
    public Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}
