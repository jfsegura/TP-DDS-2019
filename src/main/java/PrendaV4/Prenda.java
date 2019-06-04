package PrendaV4;

public interface Prenda {


    public Prenda generarPrenda(String tipoMaterial);
    void setTipoPrenda(String tipoPrenda);
    String getTipoPrenda();
    public Prenda colorearPrenda(String colorPrimario,String colorSecundario);


}
