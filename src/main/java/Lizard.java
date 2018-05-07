public class Lizard extends Kaiju implements KaijuType {
    private int scaleNum;

    public Lizard(String name, int healthValue, int attackValue, int scaleNum) {
        super(name, healthValue, attackValue);
        this.scaleNum = scaleNum;
    }
    public String roar(){
        return "ROOOOOAR";
    }
    public String move(){
        return "Moving sound";
    }
    public void attack(Vehicle vehicle){
        vehicle.removeHealth(20);
    }

    public int getScaleNum() {
        return scaleNum;
    }
    public void buildingAttack(Building building){
        building.removeHealth(40);
    }
}
