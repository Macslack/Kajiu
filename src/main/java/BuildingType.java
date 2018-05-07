public enum BuildingType {

    HOUSE(1),
    TENEMENT(2),
    FLAT(3);

    private final int value;

    BuildingType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
