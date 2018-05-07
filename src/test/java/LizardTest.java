import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LizardTest {
    Lizard lizard;
    Tank tank;

    @Before
    public void before(){
        tank = new Tank("challenger 2", 30, 10);
        lizard = new Lizard("Godzilla", 100, 10, 1000);
    }
    @Test
    public void canAttack(){
        lizard.attack(tank);
        assertEquals(10 , tank.getHealthValue());
    }
    @Test
    public void canMove(){
        assertEquals("Moving sound", lizard.move());
    }
    @Test
    public void canRoar(){
        assertEquals("ROOOOOAR", lizard.roar());
    }
    @Test
    public void canGetScaleNumber(){
        assertEquals(1000, lizard.getScaleNum());
    }

}
