package patterns.builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .withEngine("V8")
                .withWheel("Sport")
                .withTransmission("Standard")
                .withBrakes("Upgraded")
                .build();
    }
}