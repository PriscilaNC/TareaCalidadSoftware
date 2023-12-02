package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


public class NRTestSinMetodos {

    private String systemOut() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try {
            System.setOut(new PrintStream(outputStream));
            NumerosReales.main(null);
            System.setOut(originalOut);
            return outputStream.toString().trim();
        } finally {
            try {
                outputStream.close(); // Cerrar el stream después de obtener la salida
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void ParMayorQue10() {
        int numero = 12;
        String expected = "El número es par\r\nEl número es par y mayor que 10";
        NumerosReales.main(null);
        String actual = systemOut();
        assertEquals(expected, actual);
    }

    @Test
    public void ParMenorIgualQue10() {
        int numero = 8;
        String expected = "El número es par\r\nEl número es par y menor o igual que 10";
        NumerosReales.main(null);
        String actual = systemOut();

        assertEquals(expected, actual);
    }

    @Test
    public void testNumeroPositivoImparNegativo(){
        int numero = -3;
        String expected = "El número es negativo";
        NumerosReales.main(null);
        String actual = systemOut();

        assertEquals(expected, actual);
    }

    @Test
    public void testNumeroPositivoImparPositivo() {
        int numero = 7;
        String expected = "El número es impar\r\nEl número es impar y positivo";
        NumerosReales.main(null);
        String actual = systemOut();

        assertEquals(expected, actual);
    }

    @Test
    public void testNumeroCero() {
        int numero = 0;
        String expected = "El número es negativo";
        NumerosReales.main(null);
        String actual = systemOut();

        assertEquals(expected, actual);
    }

    @Test
    public void testNumeroNegativo() {
        int numero = -5;
        String expected = "El número es negativo";
        NumerosReales.main(null);
        String actual = systemOut();

        assertEquals(expected, actual);
    }
}


