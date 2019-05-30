package dominio;

public class Prenda {
    private String categoriaPrenda;
    private String tipoPrenda;
    private String tipoTela;
    private String colorPrincipal;
    private String colorSecundario;

    public void  cubreParte(){

    }

    public Prenda  (String categoriaPrenda, String tipoPrenda, String tipoTela,String colorPrincipal,String colorSecundario){
        this.categoriaPrenda = categoriaPrenda;
        this.tipoPrenda = tipoPrenda;
        this.tipoTela = tipoTela;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    public String getCategoriaPrenda(){
        return  categoriaPrenda;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }
}
