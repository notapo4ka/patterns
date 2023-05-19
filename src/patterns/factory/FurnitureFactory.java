package patterns.factory;

public class FurnitureFactory {

    public Furniture getFurniture(FurnitureTypes type) {
        Furniture result = null;
        switch (type) {
            case CHAIR:
                result = new ChairFurniture();
                break;
            case TABLE:
                result = new TableFurniture();
                break;
            case CUPBOARD:
                result = new CupBoardFurniture();
                break;
            default:
                throw new IllegalArgumentException("Wrong furniture type: " + type);
        }
        return result;
    }
}