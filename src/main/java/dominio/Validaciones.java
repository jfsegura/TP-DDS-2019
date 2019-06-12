package dominio;

public class Validaciones{

    //valida colores primarios y scundario son iguales
    public boolean verificarCombinacionColores(Color colorPrimario,Color colorSecundario){
        return colorPrimario.getColor().contains(colorSecundario.getColor());

    }

}
