package dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;

    private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();


    public Usuario(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
      }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }

    private void agregarGuardarropa(Guardarropa guardarropa){
        this.guardarropas.add(guardarropa);

    }





}
