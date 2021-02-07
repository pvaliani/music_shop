import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    private ElectricGuitar electricGuitar;

    @Before
    public void setUp(){
        electricGuitar = new ElectricGuitar("Ibanez", "RGA", 500, 1000, true, 7);

    }

    @Test
    public void canGetGuitarName(){
        assertEquals("Ibanez", electricGuitar.getName());
    }

    @Test
    public void canGetGuitarModel(){

    }

}
