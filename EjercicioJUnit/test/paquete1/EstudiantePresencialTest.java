/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camil
 */
public class EstudiantePresencialTest {

    private EstudiantePresencial instance;

    public EstudiantePresencialTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new EstudiantePresencial();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerNumeroCreditos() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("establecerNumeroCreditos");
        int numero = 50;
        instance.establecerNumeroCreditos(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 50);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerCostoCredito() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("establecerCostoCredito");
        double valor = 60.0;
        instance.establecerCostoCredito(valor);
        Field field = instance.getClass().getDeclaredField("costoCredito");
        field.setAccessible(true);
        assertEquals(field.get(instance), 60.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calcularMatriculaPresencial method, of class
     * EstudiantePresencial.
     */
    @Test
    public void testCalcularMatriculaPresencial() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("calcularMatriculaPresencial");
        instance.establecerCostoCredito(60.0);
        instance.establecerNumeroCreditos(50);
        instance.calcularMatriculaPresencial();
        Field field = instance.getClass().getDeclaredField("matriculaPresencial");
        field.setAccessible(true);
        assertEquals(field.get(instance), 3000.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        int expResult = 50;
        instance.establecerNumeroCreditos(50);
        int result = instance.obtenerNumeroCreditos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testobtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        double expResult = 60.0;
        instance.establecerCostoCredito(60.0);
        double result = instance.obtenerCostoCredito();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");
        instance.establecerCostoCredito(60.0);
        instance.establecerNumeroCreditos(50);
        instance.calcularMatriculaPresencial();
        double expResult = 3000;
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

}
