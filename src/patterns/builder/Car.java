package patterns.builder;

public class Car {

   private String engine;
   private String wheelType;
   private String transmission;
   private String brakes;

    public String getEngine() {
        return engine;
    }

    public String getWheelType() {
        return wheelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBrakes() {
        return brakes;
    }

    public static class Builder {
        private Car newCar;

        public Builder() {
            newCar = new Car();
        }

        public Builder withEngine(String engine) {
            newCar.engine = engine;
            return this;
        }

        public Builder withWheel(String wheelType) {
            newCar.wheelType = wheelType;
            return this;
        }

        public Builder withTransmission(String transmission) {
            newCar.transmission = transmission;
            return this;
        }

        public Builder withBrakes(String brakes) {
            newCar.brakes = brakes;
            return this;
        }

        public Car build() {
            return newCar;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "newCar=" + newCar +
                    '}';
        }
    }
}