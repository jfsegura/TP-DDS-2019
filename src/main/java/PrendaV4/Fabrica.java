package PrendaV4;

public class Fabrica {


    //CREA LA PRENDA
    public Prenda crearPrenda(String tipoMaterial,String colorPrimario, String colorSecundario){

        Prenda.generarPrenda(tipoMaterial);
        Prenda.colorearPrenda(colorPrimario,colorSecundario);                  //REFACTOR

        return prenda;
    }

























    /*
    *
    * CREA EL TIPO DE PRENDA Y EL MATERIAL
    public Prenda generarPrenda(String tipoMaterial){

        return prenda;
    }
    *
    *
    * */

    //CREA LOS COLORES PRIMARIO Y SECUNDARIO
    public Prenda colorearPrenda(Prenda prenda){           //completar
        return prenda;
    }           //REFACTOR
}
