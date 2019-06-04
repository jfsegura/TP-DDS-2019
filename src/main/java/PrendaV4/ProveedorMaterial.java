package PrendaV4;

import java.util.ArrayList;


public class ProveedorMaterial {



     private ArrayList <Material>materiales=new ArrayList<Material>();//= new HashSet<Material>();

    ArrayList<Material> iniciar(){
        Material algodon = new Algodon();
        materiales.add(algodon);
        return materiales;
    }



    Material buscar(String _material){

        Material buscado=null;

        for(Material elemento:materiales){
            if(elemento.getTipoMaterial().equals(_material)){
                buscado=elemento;
            }
        }

        return buscado;

    }


    Prenda agregarMaterial(String tipoMaterial,Prenda prenda){

        this.buscar(tipoMaterial);                                      //buscar en la lista con el tipo de material



        //material le ordena a la prenda que se ponga ese tipo de material
        return prenda;
    }
}
