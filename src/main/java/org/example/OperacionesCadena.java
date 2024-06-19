package org.example;

public class OperacionesCadena {

    public OperacionesCadena (){
    }

    public boolean validacionDatos(String x, String y) {
        return (!x.isEmpty()) && (!y.isEmpty());
    }

    public String validarCadena(String cadena) {
        return cadena.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    public boolean esSubCadenaX(String x, String y) {
        String[] phrase = y.split("\\s+");

        for (String word : phrase) {
            if (!x.contains(word)) {
                return false;
            }
        }
        return true;
    }

    public String concatenarCadena(String x, String y) {
        return x + " " + y;
    }

    public int contarCadena(String x, String y) {
        int contadora = 0;
        int index = 0;
        while ((index = y.indexOf(x, index)) != -1) {
            contadora++;
            index += x.length();
        }
        return contadora;
    }
}
