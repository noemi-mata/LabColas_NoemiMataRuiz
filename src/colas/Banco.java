/*
*Noemi Mata Ruiz
*GTID244
*Viernes 30 Octubre 2026
* Problema integrador: simulación de fila de banco
*/


package colas;

import java.util.Scanner;

// Clase Banco: simula la fila de un banco con un solo cajero.
// Usa la ColaEnlazada para atender a los clientes en orden de llegada.
public class Banco {

    public static void main(String[] args) {
        ColaEnlazada<String> fila = new ColaEnlazada<>(); // la fila de clientes
        Scanner sc = new Scanner(System.in);              // para leer del teclado
        int opcion;

        do {
            // Menú
            System.out.println("\n1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpia el Enter que deja nextInt()

            switch (opcion) {
                case 1:
                    // Pide el nombre y lo forma en la fila
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    fila.encolar(nombre);
                    System.out.println(nombre + " se formó en la fila");
                    break;

                case 2:
                    // Atiende al primero, si hay alguien
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Atendiendo a: " + fila.desencolar());
                    }
                    break;

                case 3:
                    // Muestra quién sigue, sin sacarlo
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera");
                    } else {
                        System.out.println("Sigue: " + fila.frente());
                    }
                    break;

                case 4:
                    // Muestra cuántos hay en la fila
                    System.out.println("Clientes en espera: " + fila.tamanio());
                    break;

                case 5:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);

        sc.close();
    }
}