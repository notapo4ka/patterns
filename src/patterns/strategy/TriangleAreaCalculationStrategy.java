package patterns.strategy;

public class TriangleAreaCalculationStrategy implements AreaCalculationStrategy {
    @Override
    public double calculateArea(double... parameters) {
        double base = parameters[0];
        double height = parameters[1];
        return 0.5 * base * height;
    }
}