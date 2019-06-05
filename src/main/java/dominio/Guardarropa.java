package dominio;


import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

    private List<Prenda> prendas = new ArrayList<Prenda>();

    private void agregaPrenda(Prenda prenda){
        this.prendas.add(prenda);

    }

    public List<Prenda>  obtenerPrendas(){
        return prendas;

    }


}
