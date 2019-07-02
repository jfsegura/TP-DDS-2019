package dominio;

public class ReglaPrenda {
    private TipoTela tipoTela;
    private TipoPrenda tipoPrenda;

    TipoTela getTipoTela() {
        return tipoTela;
    }

    TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public ReglaPrenda(TipoPrenda tipoPrenda, TipoTela tipoTela) {
        this.tipoPrenda = tipoPrenda;
        this.tipoTela = tipoTela;
    }


}
