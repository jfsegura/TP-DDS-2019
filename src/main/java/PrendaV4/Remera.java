package PrendaV4;

    public class Remera extends MoldePrendasTorso {

     private  String tipoPrenda;



    public String getTipoPrenda() {
        return tipoPrenda;
    }




   //CREACION DE PRENDA

    public Prenda generarPrenda(String tipoMaterial){
        ProveedorMaterial proveedor= new ProveedorMaterial();
        Prenda prenda = new Remera();
        this.tipoPrenda = "remera";
        proveedor.agregarMaterial(tipoMaterial,this);
        return this;
    }
    public Prenda colorearPrenda(Prenda prenda){
        return prenda;
    }

}
