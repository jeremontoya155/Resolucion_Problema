package com.jma.resolucion;


import java.util.InputMismatchException;
import java.util.Scanner;

/*

En mi caso deje algo simple por consola sin esmerarme de mas en la interfaz grafica
simplemente dando como salida una respuesta correcta con las palabras de rojo y azul para cada caso

en este caso vamos a tener un ingreso por teclado con el que indicaremos la cantidad de elementos 
queremos tenga nuestro tablero

luego de ello se hace la carga 
la logica que implemente simplemente en cada vuelta del recorrido se ingrese un "extra" del color contrario
de manera que no solo no vamos a tener mismas filas de azules sino que tambien no
vamos a tener misma cantidad de columnas de rojos y   a su vez tampoco va a coincidir nunca la cantidad de elementos
en filas o columnas 




 */

public class test {

    public static void main(String[] args) {

        int cantidad = cargarNumero("Ingrese la cantidad de elementos para la matriz");

        String[][] matriz = new String[cantidad][cantidad];

        cargarMatriz(matriz, cantidad);

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j]);
            }
            System.out.println("");

        }

    }

    public static int cargarNumero(String texto) {

        try {

            Scanner sn = new Scanner(System.in);
            System.out.println(texto);
            return sn.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Se ingreso un caracter invalido");
            e.printStackTrace(System.out);
        }
        return 0;

    }

    public static void cargarMatriz(String[][] matriz, int cantidad) {

        int contador = 0;
        if (cantidad == 0) {

            System.out.println("Fin del programa, vuelva a ejecutar en caso de error");

        } else {
            
            
            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {

                    if (j <= contador) {
                        matriz[i][j] = "rojo ";
                    } else {
                        matriz[i][j] = "azul ";
                    }
                }
                contador += 1;

            }
            
            
            

        }
        
    }

}
