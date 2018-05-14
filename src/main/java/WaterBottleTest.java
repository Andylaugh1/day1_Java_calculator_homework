import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class WaterBottleTest {
    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void reduceVolume(){
        System.out.println(waterbottle.reduceVolume());
        assertEquals(90, waterbottle.reduceVolume());
    }

    @Test
    public void reduceVolumeZero(){
        System.out.println(waterbottle.reduceVolumeZero());
        assertEquals(0, waterbottle.reduceVolumeZero());
    }

    @Test
    public void fillVolumeUp(){
        assertEquals(100, waterbottle.fillVolumeUp());
    }

}
