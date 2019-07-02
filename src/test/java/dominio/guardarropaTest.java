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
import java.util.*;

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
    private Prenda calzadoGabi;
    private TipoTela seda;
    private TipoTela algodon;
    private Color rojo;
    private List<Prenda> parteSuperiorUno = new ArrayList<Prenda>();
    private List<Prenda> parteInferiorUno = new ArrayList<Prenda>();
    private List<Prenda> parteCalzadoUno = new ArrayList<Prenda>();
    private Set<List<Prenda>> atuendos;
    private TipoDeUsuario tipoUsuario;

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
        this.tipoUsuario = new UsuarioGratuito(13);


        //creo el usuario
        usuario = new Usuario("Gabriel", "Figueroa", tipoUsuario);
        //creo el guardarropa asociado al usuario
        placard1 = new Guardarropa("Placard");
        //creo las prendas
        casmisaLarga = new Prenda(camisa,seda,rojo);
        //creo las prendas
        camisaCorta = new Prenda(camisa, algodon, rojo);
        pantalonGabi = new Prenda(pantalon, algodon, rojo);
        pantalonGabi2 = new Prenda(pantalon, seda, rojo);
        calzadoGabi = new Prenda(zapato, algodon, rojo);
    }
    @Test

    public void test_tipoPrenda() {

        usuario.agregarGuardarropa(placard1);


        placard1.agregarPrendaGuardarropa(casmisaLarga);
        placard1.agregarPrendaGuardarropa(camisaCorta);
        placard1.agregarPrendaGuardarropa(pantalonGabi);
        placard1.agregarPrendaGuardarropa(pantalonGabi2);
        placard1.agregarPrendaGuardarropa(calzadoGabi);


        Prenda prenda1 = placard1.obtenerPrendas().get(0);
        parteInferiorUno = placard1.prendaCubreParte(placard1, parteInferior);
        parteSuperiorUno = placard1.prendaCubreParte(placard1, parteSuperior);
        parteCalzadoUno = placard1.prendaCubreParte(placard1, calzado);

        atuendos = placard1.devolverPosiblesAtuendos(parteSuperiorUno, parteSuperiorUno, parteCalzadoUno, parteCalzadoUno);

        Iterator iter3 = atuendos.iterator();
        while (iter3.hasNext()) {
            System.out.println(iter3.next());

        }

    }
}
