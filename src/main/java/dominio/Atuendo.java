package dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Atuendo{

    private List<Prenda> accesorio = new ArrayList<Prenda>();
    private List<Prenda> calzado = new ArrayList<Prenda>();
    private List<Prenda> parteInferior = new ArrayList<Prenda>();
    private List<Prenda> torso = new ArrayList<Prenda>();
    private java.util.stream.Collectors Collectors;


    List<Prenda> cubreParte(Guardarropa guardarropa,Categoria categoria){
        List<Prenda> resultPrenda = guardarropa.obtenerPrendas().stream()
                .filter(v -> v.getCategoriaPrenda().equals(categoria.getCategoria()))
                .collect(Collectors.toList());
        
    }


}
