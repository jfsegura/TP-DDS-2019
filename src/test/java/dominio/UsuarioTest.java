package dominio;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UsuarioTest {
    private Usuario usuario;
    private TipoDeUsuario tipoUsuario;
    @Before
    public void setup() {
        this.tipoUsuario = new UsuarioGratuito(13);
        this.usuario = new Usuario("Mati", "Lanne", tipoUsuario);
    }

    @Test

    public void test_atuendo(){
        assertEquals("Mati",usuario.getNombre());
    //assertTrue("test",usuario.getNombre()=="Mati");
    }


}
