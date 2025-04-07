package org.locadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class VeiculoTest {

    @Test
    public void testCustoSemDesconto() {
        Veiculo v = new Veiculo("Civic", 100);
        assertEquals(300, v.calcularCusto(3), 0.01);
    }

    @Test
    public void testCustoComDesconto() {
        Veiculo v = new Veiculo("Corolla", 100);
        assertEquals(630, v.calcularCusto(7), 0.01);
    }

    @Test
    public void testMulta() {
        Veiculo v = new Veiculo("Uno", 80);
        assertEquals(240, v.calcularMulta(2), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiasZero() {
        new Veiculo("HB20", 100).calcularCusto(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDiariaNegativa() {
        new Veiculo("Gol", -50).calcularCusto(5);
    }
}
