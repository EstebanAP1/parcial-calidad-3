package org.example;

import java.util.Scanner;

public class Menu {
    OperacionesCadena opc;
    String x;
    String y;
    boolean sw;

    public Menu(){
    }

    public void mostrarMenu() {
        int op;
        boolean sw1 = true;

        opc = new OperacionesCadena();

        do {
            System.out.println("Menu: ");
            System.out.println("1. Ingresar parametros.");
            System.out.println("2. Indicar si y es sub-cadena de x.");
            System.out.println("3. Concatenar una cadena X con una cadena Y.");
            System.out.println("4. indicar cuantas veces un sub-cadena X se encuentra en una cadena Y.");
            System.out.println("5. Salir.");
            System.out.println();
            op = introducirOpcion();
            System.out.println("-----------------------------------------------------------------------");
            switch (op) {
                case 1:
                    ingresarCadena();
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                case 2:
                    esSubCadenaX();
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                case 3:
                    concatenarCadena();
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                case 4:
                    contarCadena();
                    System.out.println("-----------------------------------------------------------------------");
                    break;
                case 5:
                    sw1 = false;
                    break;
                default:
                    System.out.println("***Valor invalido***");
                    break;
            }
        } while (sw1);
    }

    public int introducirOpcion() {
        Scanner sc;
        int op;
        boolean sw1;

        sw1 = false;
        sc = new Scanner(System.in);
        op = 0;

        while (!sw1) {
            System.out.print("> Introduce un numero entero: ");
            if (sc.hasNextInt()) {
                op = sc.nextInt();
                sw1 = true;
            } else {
                System.out.println("> Entrada invalida. Por favor, introduce un numero entero.");
                sc.next();
            }
        }
        return op;
    }

    public void ingresarCadena() {
        Scanner sc = new Scanner(System.in);
        opc = new OperacionesCadena();
        this.sw = false;

        System.out.print("> Ingresa la primera cadena: ");
        this.x = opc.validarCadena(sc.nextLine());
        System.out.print("> Ingresa la segunda cadena: ");
        this.y = opc.validarCadena(sc.nextLine());

        if (!opc.validacionDatos(this.x, this.y)) {
            System.out.println("***Los valores introducidos no son validos***");
            this.sw = false;
        } else {
            System.out.println(this.x + "; " + this.y);
            System.out.println("- Valores captados");
            this.sw = true;
        }
    }

    public void esSubCadenaX() {
        opc = new OperacionesCadena();
        if (!this.sw) {
            System.out.println("***No ha ingresado valores***");
        } else {
            if (!opc.esSubCadenaX(this.x, this.y)) {
                System.out.println("- La sentencia Y NO es subcadena de X.");
            } else {
                System.out.println("- La sentencia Y SI es subcadena de X.");
            }
        }
    }

    public void concatenarCadena() {
        opc = new OperacionesCadena();

        if (!this.sw) {
            System.out.println("***No ha ingresado valores***");
        } else {
            System.out.println("- Resultado: " + opc.concatenarCadena(this.x, this.y));
        }
    }

    public void contarCadena() {
        opc = new OperacionesCadena();

        if (!this.sw) {
            System.out.println("***No ha ingresado valores***");
        } else {
            System.out.println("- Las veces que una sub-cadena X se encuentra en una cadena Y es: " + opc.contarCadena(this.x, this.y));
        }
    }
}
