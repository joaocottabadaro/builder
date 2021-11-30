import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CasaBuilderTest{

    @Test
    public void deveRetornarExcecaoParaCasaSemTeto() {
        try {
            CasaBuilder cpuBuilder = new CasaBuilder();
            Casa minhaCasa = cpuBuilder
                    .setPortas(4)
                    .setAndares(3)
                    .setPiscina(true)
                    .setGaragem(true)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Casa não tem teto", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoParaCasaSemPorta() {
        try {
            CasaBuilder casaBuilder = new CasaBuilder();
            Casa minhaCasa = casaBuilder
                    .setAndares(3)
                    .setTeto(true)
                    .setPiscina(true)
                    .setGaragem(true)
                    .setPiscina(true)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Casa não tem porta", e.getMessage());
        }
    }

}