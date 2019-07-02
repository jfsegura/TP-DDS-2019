package dominio;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import java.util.*;
import java.util.stream.Collectors;

public class Guardarropa {

    private String nombreGuardarropa;
    private Usuario usuario;
    private List<Prenda> prendas = new ArrayList<Prenda>();

    public Guardarropa(String nombreGuardarropa){

        this.nombreGuardarropa = nombreGuardarropa;
    }

    public String getNombreGuardarropa() {
        return nombreGuardarropa;
    }

    public List<Prenda> obtenerPrendas(){
        return prendas;
    }

    public void agregarPrendaGuardarropa(Prenda prenda){
        this.prendas.add(prenda);

    }

    public List<Prenda> prendaCubreParte(Guardarropa guardarropa, Categoria categoria) {

        return guardarropa.obtenerPrendas().stream()
                .filter(prenda -> prenda.getTipoPrenda().getCategoriaPrenda().equals(categoria))
                .collect(Collectors.toList());

    }

    public Set<List<Prenda>> devolverPosiblesAtuendos(List<Prenda> parteSuperior, List<Prenda> parteInferior, List<Prenda> calzado, List<Prenda> accesorio) {
        return Sets.cartesianProduct(ImmutableList.of(new HashSet<>(parteSuperior), new HashSet<>(parteInferior), new HashSet<>(calzado), new HashSet<>(accesorio)));
    }


    public void generarAtuendoCuatroPiezas(List<Prenda> parteSuperior, List<Prenda> parteInferior, List<Prenda> calzado, List<Prenda> accesorio) {
        Set<List<Prenda>> atuendos = devolverPosiblesAtuendos(parteSuperior, parteInferior, calzado, accesorio);

        Iterator iterAtuendo = atuendos.iterator();
        while (iterAtuendo.hasNext()) {
        }

    }

    public void obtenerSugerencia(Temperatura temperatura) {

        //en base a la temperatura que toma de la api se generara la sugerencia de atuendo correspondiente

    }
}
