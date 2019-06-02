package dominio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TipoTelaTest {
    private TipoTela seda;
    private TipoTela algodon;

    @Before
    public void setup() {
        this.seda = new TipoTela("seda");
        this.algodon = new TipoTela("algodon");
    }

    @Test

    public void testTipoTela(){
        assertEquals("seda",seda.getTipo());
        assertEquals("algodon",algodon.getTipo());
       }

}
