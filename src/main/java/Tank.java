public class Tank extends Vehicle implements VehicleType  {
    private int tankRounds;

    public Tank(String type, int healthValue, int tankRounds) {
        super(type, healthValue);
        this.tankRounds = tankRounds;
    }

    public int getTankRounds() {
        return tankRounds;
    }
    public void smallAttack(Kaiju kaiju){
        kaiju.removeKaijuHealth(5);
    }
    public void bigAttack(Kaiju kaiju){
        kaiju.removeKaijuHealth(10);
    }
}

