import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PersonaTest extends Persona {
    private final static Logger LOGGER = Logger.getLogger(Persona.class.getName());
    private Persona persona;
    private UUID uuid;

    @Before
    public void setUp() throws Exception {
        LOGGER.warning("lc: inicializando valores de las pruebas");
        persona = new Persona();
        persona.setFirstName("Luis Arturo");
        persona.setLastName("Conde");
        persona.setSecondLastName("Hernandez");
        persona.setAge(27);
        persona.setHeight(1.75);

        uuid = UUID.randomUUID();
        persona.setUuid(uuid);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetUuid() {
        LOGGER.warning("lc: run testGetUuid");
        LOGGER.warning("lc: {uuid:" + uuid + "}");
        LOGGER.warning("lc: {persona.uuid:" + persona.getUuid() + "}");

        assertEquals(uuid, persona.getUuid());
    }

    @Test
    public void testSetUuid() {
        uuid = UUID.randomUUID();
        LOGGER.warning("lc: run testSetUuid");
        LOGGER.warning("lc: {uuid:" + uuid + "}");

        persona.setUuid(uuid);
        assertNotNull(persona.getUuid());
        assertTrue(persona.getUuid() instanceof java.util.UUID);
    }

    @Test
    public void testGetFirstName() {
    }

    @Test
    public void testSetFirstName() {
    }

    @Test
    public void testGetLastName() {
    }

    @Test
    public void testSetLastName() {
    }

    @Test
    public void testGetSecondLastName() {
    }

    @Test
    public void testSetSecondLastName() {
    }

    @Test
    public void testGetAge() {
    }

    @Test
    public void testSetAge() {
    }

    @Test
    public void testGetHeight() {
    }

    @Test
    public void testSetHeight() {
    }

    @Test
    public void testIsAdult() {
        LOGGER.warning("lc: run testIsAdult");

        persona.setAge(17);
        LOGGER.warning("lc: {persona.age:" + persona.getAge() + "}");

        assertFalse(persona.isAdult());
    }

    @Test
    public void testIsTall() {
    }
}