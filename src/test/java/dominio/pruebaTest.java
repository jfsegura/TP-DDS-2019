package dominio;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

public class pruebaTest {


    private TipoTela seda;
    private TipoTela algodon;
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
        this.seda = new TipoTela("seda");
        this.algodon = new TipoTela("algodon");
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
    public void test1() {


        Set<String> first = ImmutableSet.of(seda.getTipo(),algodon.getTipo());
        Set<String> second = ImmutableSet.of(camisa.getTipo(),pantalon.getTipo());
        Set<List<String>> result =
                Sets.cartesianProduct(ImmutableList.of(first, second));
        Iterator iter = result.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
