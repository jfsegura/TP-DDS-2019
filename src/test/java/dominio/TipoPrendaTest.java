package dominio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TipoPrendaTest {
    private TipoPrenda camisa;
    private TipoPrenda pantalon;
    private TipoPrenda calzado;
    private TipoPrenda remera;

    @Before
    public void setup() {

        this.camisa = new TipoPrenda("camisa");
        this.pantalon = new TipoPrenda("pantalon");
        this.calzado = new TipoPrenda("calzado");
        this.remera = new TipoPrenda("remera");
    }

    @Test

    public void test_tipoPrenda(){
        assertEquals("camisa",camisa.getTipo());
        assertEquals("pantalon",pantalon.getTipo());
        assertEquals("calzado",calzado.getTipo());
        assertEquals("remera",remera.getTipo());
     }

}
