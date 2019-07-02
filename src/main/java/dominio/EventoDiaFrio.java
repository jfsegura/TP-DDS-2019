package dominio;

public class EventoDiaFrio implements Evento {

    private Guardarropa guardarropa;

    private Temperatura temperaturaEvento;      // modificar el tipo de dato por el que devuelva la API

    public EventoDiaFrio(Temperatura temp) {    // modificar el tipo de dato por el que devuelva la API
        this.temperaturaEvento = temp;
    }

    public void ejecutar(){

        guardarropa.obtenerSugerencia(this.temperaturaEvento);  // metodo para obtener un atuendo con la temperatura que se pasa por parametro

    }
}
