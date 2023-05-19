package patterns.strategy;

public class AreaCalculator {
    private AreaCalculationStrategy strategy;

    public void setStrategy(AreaCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea(double... parameters) {
        return strategy.calculateArea(parameters);
    }
}