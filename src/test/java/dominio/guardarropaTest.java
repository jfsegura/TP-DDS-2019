package dominio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class guardarropaTest {

    private TipoPrenda camisa;
    private TipoPrenda pantalon;
    private TipoPrenda zapato;
    private TipoPrenda remera;
    private Categoria parteSuperior;
    private Categoria parteInferior;
    private Categoria accesorio;
    private Categoria calzado;
    private Guardarropa placard1;
    private Usuario usuario;
    private Prenda casmisaLarga;
    private Prenda pantalonGabi;
    private TipoTela seda;
    private TipoTela algodon;
    private Color rojo;

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
        this.seda = new TipoTela("seda");
        this.algodon = new TipoTela("algodon");
        this.rojo = new Color("rojo");

        //creo el usuario
        usuario = new Usuario("Gabriel","Figueroa");
        //creo el guardarropa asociado al usuario
        placard1 = new Guardarropa("Placard");

        //creo las prendas
        casmisaLarga = new Prenda(camisa,seda,rojo);

    }
    @Test

    public void test_tipoPrenda(){

        usuario.agregarGuardarropa(placard1);
        placard1.agregarPrendaGuardarropa(casmisaLarga);

        Prenda prenda1 = placard1.obtenerPrendas().get(0);


        assertEquals(casmisaLarga,prenda1);

    }




}
