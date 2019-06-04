package PrendaV4;

 public class Algodon implements Material {


     public String getTipoMaterial() {
         return "algodon";
    }


       //V2 LE INDICA EL TIPO DE TELA A LA PRENDA SI LA RESTRICCION LO PERMITE
        //V1 CREA MATERIAL ALGODON SI LO PERMITE LA RESTRICCION                      crear

        public Prenda colocarMaterial(Prenda prenda){
           if(this.condiciones(prenda)){
               //error
           }
           else prenda.setTipoPrenda(this.getTipoMaterial());

            return prenda;
        }

         public Boolean condiciones(Prenda prenda){
            return (prenda.getTipoPrenda()).equals("zapatos");

        }


}
