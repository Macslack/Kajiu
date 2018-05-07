import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {
    Tank tank;
    Lizard lizard;

    @Before
    public void before(){
        tank = new Tank("challenger 2", 30, 10);
        lizard = new Lizard("Godzilla", 100, 10, 1000);
    }
    @Test
    public void canSmallAttack(){
            tank.smallAttack(lizard);
        assertEquals(95, lizard.getHealthValue());
    }
    @Test
    public void canBigAttack(){
        tank.bigAttack(lizard);
        assertEquals(90, lizard.getHealthValue());
    }
    @Test
    public void canGetTankRounds(){
        assertEquals(10, tank.getTankRounds());
    }
}
