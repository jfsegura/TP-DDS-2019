package dominio;

public class UsuarioPremium implements TipoDeUsuario {
    private int maxPrendaEnGuardarropa;


    public UsuarioPremium(int maxPrenda) {
        this.maxPrendaEnGuardarropa = maxPrenda;
    }

    public int getMaxPrendaEnGuardarropa() {
        return maxPrendaEnGuardarropa;
    }
}
