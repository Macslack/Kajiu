public abstract class Building {
    Building building;

    private String name;
    private int healthValue;
    private BuildingType buildingType;

    public Building(String name, int healthValue, BuildingType buildingType) {
        this.name = name;
        this.healthValue = healthValue;
        this.buildingType = buildingType;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }
    public void removeHealth(int power){
        healthValue -= power;
    }
}
