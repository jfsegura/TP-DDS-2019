package dominio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TipoPrendaTest {
    private TipoPrenda camisa;
    private TipoPrenda pantalon;
    private TipoPrenda zapato;
    private TipoPrenda remera;
    private Categoria parteSuperior;
    private Categoria parteInferior;
    private Categoria accesorio;
    private Categoria calzado;

    @Before
    public void setup() {
        this.parteSuperior = new Categoria("superior");
        this.parteInferior = new Categoria("inferior");
        this.accesorio = new Categoria("accesorio");
        this.calzado = new Categoria("calzado");
        this.camisa = new TipoPrenda("camisa",parteSuperior);
        this.pantalon = new TipoPrenda("pantalon",parteInferior);
        this.zapato = new TipoPrenda("zapato",calzado);
        this.remera = new TipoPrenda("remera",parteSuperior);
    }

    @Test

    public void test_tipoPrenda(){
        assertEquals("camisa",camisa.getTipo());
        assertEquals("pantalon",pantalon.getTipo());
        assertEquals("zapato",zapato.getTipo());
        assertEquals("remera",remera.getTipo());
     }

}
