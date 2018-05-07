import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ClockTowerTest {
    ClockTower clockTower;
    Lizard lizard;

    @Before
    public void before(){
        clockTower = new ClockTower("ClockTower", 100, BuildingType.FLAT);
        lizard = new Lizard("Godzilla", 100, 10, 1000);
    }
    @Test
    public void canAttackBuilding(){
            lizard.buildingAttack(clockTower);
        assertEquals(60, clockTower.getHealthValue());
    }
}
