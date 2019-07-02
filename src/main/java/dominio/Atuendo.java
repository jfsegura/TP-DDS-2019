package dominio;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;

import java.util.*;
import java.util.stream.Collectors;

public class Atuendo{

    private Prenda accesorio;
    private Prenda calzado;
    private Prenda parteInferior;
    private Prenda parteSuperior;


    public Atuendo(Prenda parteSuperior, Prenda accesorio, Prenda parteInferior, Prenda calzado) {
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calzado = calzado;
        this.accesorio = accesorio;

    }

    public Atuendo(Prenda parteSuperior, Prenda parteInferior, Prenda calzado) {
        this.parteSuperior = parteSuperior;
        this.parteInferior = parteInferior;
        this.calzado = calzado;

    }


}
