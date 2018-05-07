public abstract class Vehicle {
    Vehicle vehicle;

    private String type;
    private int healthValue;

    public Vehicle(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void removeHealth(int power){
        healthValue -= power;
    }
}
