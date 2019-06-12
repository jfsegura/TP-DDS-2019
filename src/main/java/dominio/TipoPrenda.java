package dominio;

class TipoPrenda {
    private String tipo;
    private Categoria categoriaPrenda;

    public TipoPrenda(String tipo,Categoria categoriaPrenda){
        this.tipo = tipo;
        this.categoriaPrenda = categoriaPrenda;
    }


    public String getTipo() {
        return tipo;
    }


    public Categoria getCategoriaPrenda() {
        return categoriaPrenda;
    }


}
