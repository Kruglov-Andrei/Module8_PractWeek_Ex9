public class Rhombuses extends Quadrangle implements Figure{
    double alpha;
    double beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }
    @Override
    public double getLargeDiagonal() {
        return Math.max(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) -
                        2 * a * b * Math.cos(Math.toRadians(alpha))), Math.sqrt(Math.pow(a, 2) +
                        Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(beta))));
    }

    @Override
    public double getHeight() {
        return a * Math.sin(Math.toRadians(alpha));
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return a * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}
