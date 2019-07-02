package dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String apellido;
    private TipoDeUsuario tipoUsuario;

    private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();


    public TipoDeUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public Usuario(String nombre, String apellido, TipoDeUsuario tipoUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoUsuario = tipoUsuario;
      }

    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }


    public void agregarGuardarropa(Guardarropa guardarropa){
        this.guardarropas.add(guardarropa);

    }
}
