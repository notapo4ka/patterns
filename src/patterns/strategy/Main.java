package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        calculator.setStrategy(new RectangleAreaCalculationStrategy());
        double rectangleArea = calculator.calculateArea(2.0, 5.0);
        System.out.println("Rectangle area: " + rectangleArea);

        calculator.setStrategy(new TriangleAreaCalculationStrategy());
        double triangleArea = calculator.calculateArea(3.0, 5.0);
        System.out.println("Triangle area: " + triangleArea);
    }
}