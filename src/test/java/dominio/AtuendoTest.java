package dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

public class AtuendoTest {
    private Atuendo atuendo;

    @BeforeEach
    void init(){
        atuendo = new Atuendo();
    }

    @Test
    void test_esParteSuperior(){ assertTrue(atuendo.esParteSuperior(),"Atuendo es parte superior");}



}

