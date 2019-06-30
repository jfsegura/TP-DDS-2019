package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Validaciones{
    List<ReglaPrenda> reglasPrendaValidas = new ArrayList<ReglaPrenda>();

    //valida colores primarios y scundario son iguales
    public boolean verificarCombinacionColores(Color colorPrimario,Color colorSecundario){
        return colorPrimario.getColor().contains(colorSecundario.getColor());

    }

    public void agregarReglaPrenda(ReglaPrenda reglaPrenda) {
        this.reglasPrendaValidas.add(reglaPrenda);

    }

    public List<ReglaPrenda> buscarReglaTipoPrenda(TipoPrenda tipoPrenda) {
        return reglasPrendaValidas.stream()
                .filter(regla -> regla.getTipoPrenda().getTipo().equals(tipoPrenda.getTipo()))
                .collect(Collectors.toList());

    }

    public List<ReglaPrenda> buscarReglaTipoTela(TipoTela tipoTela) {
        return reglasPrendaValidas.stream()
                .filter(regla -> regla.getTipoTela().getTipo().equals(tipoTela.getTipo()))
                .collect(Collectors.toList());

    }


    public List<ReglaPrenda> verificaTipoPrendayTipoTela(TipoPrenda tipoPrenda, TipoTela tipoTela) {

        return buscarReglaTipoPrenda(tipoPrenda).stream()
                .filter(regla -> regla.getTipoTela().getTipo().equals(tipoTela.getTipo()))
                .collect(Collectors.toList());

    }


}
