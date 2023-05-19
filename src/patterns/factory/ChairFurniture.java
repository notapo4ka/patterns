package patterns.factory;

public class ChairFurniture implements Furniture {
    @Override
    public void create() {
        System.out.println("You are created chair furniture!");
    }
}