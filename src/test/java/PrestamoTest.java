import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;
import java.util.logging.Logger;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PrestamoTest extends Prestamo {

    private final static Logger LOGGER = Logger.getLogger(Persona.class.getName());
    private Persona personaValida;
    private Persona personaNoValida;
    private Prestamo prestamo;

    @Before
    public void setUp() throws Exception {
        prestamo = new Prestamo();

        // simulamos los objetos
        personaValida = mock(Persona.class);
        personaNoValida = mock(Persona.class);

        // simulamos la funcionalidad
        when(personaValida.isAdult()).thenReturn(true);
        when(personaValida.isTall()).thenReturn(true);
        when(personaValida.getUuid()).thenReturn(UUID.randomUUID());
        when(personaValida.getFirstName()).thenReturn("Luis Conde");

        when(personaNoValida.isAdult()).thenReturn(false);
        when(personaNoValida.isTall()).thenReturn(false);
        when(personaNoValida.getUuid()).thenReturn(null);
        when(personaNoValida.getFirstName()).thenReturn("!#$%&/()=?¡´´++{}][`}.,-");

        prestamo.setCapital(50);
        prestamo.setCapital(20000);
        prestamo.setTasaInteres(30);
        prestamo.setUuid(UUID.randomUUID());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetPersona() {
        LOGGER.warning("lc: run testGetPersona");
        LOGGER.warning("lc: {persona.valid:" + true + "}");

        prestamo.setPersona(personaValida);
        verify(personaValida).isAdult();
        assertEquals(personaValida, prestamo.getPersona());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetPersona() {
        LOGGER.warning("lc: run testSetPersona");
        LOGGER.warning("lc: {persona.isAdult:" + false + "}");

        prestamo.setPersona(personaNoValida);
    }

    @Test
    public void testGetMontoPagar() {
    }

    @Test
    public void testGetMontoCuota() {
    }

    @Test
    public void testGetCapital() {
    }

    @Test
    public void testSetCapital() {
    }

    @Test
    public void testGetId() {
    }

    @Test
    public void testSetId() {
    }

    @Test
    public void testGetCuotas() {
    }

    @Test
    public void testSetCuotas() {
    }

    @Test
    public void testGetTasaInteres() {
    }

    @Test
    public void testSetTasaInteres() {
    }
}