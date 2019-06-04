package PrendaV4;

import java.util.ArrayList;



public class ProveedorMaterial {

    private ArrayList <Material>materiales;//= new HashSet<Material>();

    public ProveedorMaterial(){
        this.materiales=this.iniciar();
    }

    private ArrayList<Material> iniciar(){

        Material algodon = new Algodon();
        this.materiales.add(algodon);
        return materiales;
    }



    private Material buscar(String _material){









        return  material;

    }


    Prenda agregarMaterial(String tipoMaterial,Prenda prenda){
        Material material =this.buscar(tipoMaterial);   //buscar en la lista con el tipo de material
        material.colocarMaterial(prenda);               //material le ordena a la prenda que se ponga ese tipo de material
        return prenda;
    }
}


