package actividadfinalcs;

import org.example.OperacionesCadena;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class OperacionesCadenaTest {

    private OperacionesCadena opc;

    public OperacionesCadenaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        this.opc = new OperacionesCadena();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testValidacionDatos() {
        assertTrue(opc.validacionDatos("Hola Mundo", "Hola"));
        assertNotEquals(true, opc.validacionDatos("", ""));
        assertNotEquals(true, opc.validacionDatos("Hola", ""));
        assertNotEquals(true, opc.validacionDatos("", "Mundo"));
    }

    @Test
    public void testValidarCadena() {
        assertEquals("Hola", opc.validarCadena("Hola."));
        assertEquals("Hola Mundo", opc.validarCadena("Hola, Mundo!"));
        assertEquals("Java123", opc.validarCadena("Java-123#"));
        assertEquals("", opc.validarCadena("!@#$%^&*()"));
    }

    @Test
    public void testEsSubCadenaX() {
        assertTrue(opc.esSubCadenaX("Hola Mundo", "Mundo"));
        assertFalse(opc.esSubCadenaX("Hola Mundo", "Java")); // Caso donde y no es subcadena de x
        assertTrue(opc.esSubCadenaX("Hola Hola Hola", "Hola")); // Subcadena repetida
        assertFalse(opc.esSubCadenaX("Hola", "Hola Mundo")); // y es mayor que x
    }


    @Test
    public void testConcatenarCadena() {
        assertEquals("Hola  Mundo", opc.concatenarCadena("Hola", " Mundo"));
        assertEquals("Hello World", opc.concatenarCadena("Hello", "World"));
    }

    @Test
    public void testContarCadena() {
        assertEquals(1, opc.contarCadena("Hola", "Hola Mundo"));
        assertEquals(3, opc.contarCadena("Hola", "Hola Hola Hola"));
        assertEquals(0, opc.contarCadena("Java", "Hola Mundo"));
        assertEquals(2, opc.contarCadena("aa", "aaaa"));
    }
}
