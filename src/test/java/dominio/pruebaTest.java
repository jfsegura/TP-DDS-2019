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
    private TipoPrenda calzado;
    private TipoPrenda remera;

    @Before
    public void setup() {
        this.seda = new TipoTela("seda");
        this.algodon = new TipoTela("algodon");
        this.camisa = new TipoPrenda("camisa");
        this.pantalon = new TipoPrenda("pantalon");
        this.calzado = new TipoPrenda("calzado");
        this.remera = new TipoPrenda("remera");
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
