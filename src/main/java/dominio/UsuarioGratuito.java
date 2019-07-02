package dominio;

public class UsuarioGratuito implements TipoDeUsuario {
    private int maxPrendaEnGuardarropa;

    public UsuarioGratuito(int maxPrenda) {
        this.maxPrendaEnGuardarropa = maxPrenda;
    }

    public int getMaxPrendaEnGuardarropa() {
        return maxPrendaEnGuardarropa;
    }
}
