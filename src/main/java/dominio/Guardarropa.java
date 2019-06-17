package dominio;


import java.util.ArrayList;
import java.util.List;
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





}
