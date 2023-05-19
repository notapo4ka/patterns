package patterns.factory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture chair = factory.getFurniture(FurnitureTypes.CHAIR);
        Furniture table = factory.getFurniture(FurnitureTypes.TABLE);
        Furniture cupboard = factory.getFurniture(FurnitureTypes.CUPBOARD);

        chair.create();
        table.create();
        cupboard.create();
    }
}