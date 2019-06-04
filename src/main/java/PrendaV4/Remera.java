package PrendaV4;

    public class Remera extends MoldePrendasTorso {



        private  String tipoPrenda ="remera";
        private String colorPrimario;
        private String colorSecundario;



    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
            this.tipoPrenda = tipoPrenda;
        }




   //CREACION DE PRENDA

    public Prenda generarPrenda(String tipoMaterial){
        ProveedorMaterial proveedor= new ProveedorMaterial();
        Prenda prenda = new Remera();
        proveedor.agregarMaterial(tipoMaterial,this);
        return this;
    }
    public Prenda colorearPrenda(String colorPrimario,String colorSecundario){


        return this;
    }

}
