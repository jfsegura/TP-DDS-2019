package dominio;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
    private Prenda camisaCorta;
    private Prenda pantalonGabi;
    private Prenda pantalonGabi2;
    private TipoTela seda;
    private TipoTela algodon;
    private Color rojo;
    private List<Prenda> parteSuperiorUno = new ArrayList<Prenda>();
    private List<Prenda> parteInferiorUno = new ArrayList<Prenda>();
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
        //creo las prendas
        camisaCorta = new Prenda(camisa, algodon, rojo);
        pantalonGabi = new Prenda(pantalon, algodon, rojo);
        pantalonGabi2 = new Prenda(pantalon, seda, rojo);
    }
    @Test

    public void test_tipoPrenda(){

        usuario.agregarGuardarropa(placard1);


        placard1.agregarPrendaGuardarropa(casmisaLarga);
        placard1.agregarPrendaGuardarropa(camisaCorta);
        placard1.agregarPrendaGuardarropa(pantalonGabi);
        placard1.agregarPrendaGuardarropa(pantalonGabi2);


        Prenda prenda1 = placard1.obtenerPrendas().get(0);
        parteInferiorUno = placard1.prendaCubreParte(placard1, parteInferior);
        parteSuperiorUno = placard1.prendaCubreParte(placard1, parteSuperior);

        /*
        Iterator iter = parteSuperiorUno.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());

        Iterator iter1 = parteCalzado.iterator();
        while (iter1.hasNext())
            System.out.println(iter1.next());

         */

        Set<List<List<Prenda>>> result = Sets.cartesianProduct(ImmutableList.of(ImmutableSet.of(parteSuperiorUno), ImmutableSet.of(parteInferiorUno)));
        Iterator iter3 = result.iterator();
        while (iter3.hasNext())
            System.out.println(iter3.next());

    }



}
