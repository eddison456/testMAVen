import org.junit.Assert;
import org.junit.Test;

public class CronometroTest {

    @Test
    public void CronometroTEst() {

        final Cronometro cronometro = new Cronometro();

        int segundos = 300;

        int resultado = cronometro.crono(segundos);

       Assert.assertEquals(segundos, resultado);
    }
}
