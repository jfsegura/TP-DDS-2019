package dominio;


enum TipoTela{
    algodon,seda;
}

public class Prenda {
    private Categoria categoriaPrenda;
    private TipoPrenda tipoPrenda;
    private TipoTela tipoTela;
    private String colorPrincipal;
    private String colorSecundario;



    public void  cubreParte(){

    }

    public Prenda  (Categoria categoriaPrenda, TipoPrenda tipoPrenda, TipoTela tipoTela,String colorPrincipal,String colorSecundario){
        this.categoriaPrenda = categoriaPrenda;
        this.tipoPrenda = tipoPrenda;
        this.tipoTela = tipoTela;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoriaPrenda(){
        return  categoriaPrenda;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public TipoTela getTipoTela() {
        return tipoTela;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }
}
