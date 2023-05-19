package patterns.factory;

public class CupBoardFurniture implements Furniture {
    @Override
    public void create() {
        System.out.println("You are created cupboard furniture!");
    }
}