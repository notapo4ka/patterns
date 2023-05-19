package patterns.factory;

public class TableFurniture implements Furniture {
    @Override
    public void create() {
        System.out.println("You are created table furniture!");
    }
}