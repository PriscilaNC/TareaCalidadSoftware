package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosRealesTest {

    @Test
    public void testNegativo() {
        assertEquals("El número es negativo", NumerosReales.clasificarReal(-5));
    }

    @Test
    public void testPar() {
        //esto pasa pk se salta el retorno de es par y lo toma como par pero tambien
        //lo evalua con el 10 por lo que no debiese salir el mensaje es par
        assertNotEquals("El número es par", NumerosReales.clasificarReal(10));
    }

    @Test
    public void testParMayorA10() {
        assertEquals("El número es par y mayor que 10", NumerosReales.clasificarReal(16));
    }

    @Test
    public void testParMenorIgualA10() {
        assertEquals("El número es par y menor o igual que 10", NumerosReales.clasificarReal(10));
    }

    @Test
    public void testImparNegativo() {
        //Como el primer if evalua el signo del numero el ciclo se cierra de inmediato al ser un negativo por lo que
        //a esta altura del ciclo ya no debiesen haber negativos
        assertNotEquals("El número es impar y negativo", NumerosReales.clasificarReal(-1));
    }

    @Test
    public void testImparPositivo() {
        assertEquals("El número es impar y positivo", NumerosReales.clasificarReal(7));
    }

}

