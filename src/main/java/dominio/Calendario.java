package dominio;

import java.util.List;

// Calendario actuara de invoker
public class Calendario {

    private List<Evento> eventos;



    public void agregar(Evento nuevoEvento){
        eventos.add(nuevoEvento);
    }

    public void deshacer(Evento eventoEnLista){
        eventos.remove(eventoEnLista);
    }

    public void iniciar(Evento evento){
        evento.ejecutar();
    }
}
