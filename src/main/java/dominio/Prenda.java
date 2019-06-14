package dominio;



public class Prenda extends Validaciones {
    private TipoPrenda tipoPrenda;
    private TipoTela tipoTela;
    private Color colorPrincipal;
    private Color colorSecundario;



    public Prenda(TipoPrenda tipoPrenda, TipoTela tipoTela,Color colorPrincipal,Color colorSecundario){
         this.tipoPrenda = tipoPrenda;
        this.tipoTela = tipoTela;
        this.colorPrincipal = colorPrincipal;
        if (verificarCombinacionColores(colorPrincipal,colorSecundario)) {
            this.colorSecundario = colorSecundario;
        }
    }


    public Prenda(TipoPrenda tipoPrenda, TipoTela tipoTela,Color colorPrincipal){
         this.tipoPrenda = tipoPrenda;
        this.tipoTela = tipoTela;
        this.colorPrincipal = colorPrincipal;
    }

     public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public TipoTela getTipoTela() {
        return tipoTela;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }


}
