package patterns.strategy;

public class RectangleAreaCalculationStrategy implements AreaCalculationStrategy {
    @Override
    public double calculateArea(double... parameters) {
        double length = parameters[0];
        double width = parameters[1];
        return length * width;
    }
}