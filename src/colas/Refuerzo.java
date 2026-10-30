/*
*Noemi Mata Ruiz
*GTID244
*Viernes 30 Octubre 2026
*Ejercicio de refuerzo
*/


package colas;

import java.util.Stack;

// Clase Refuerzo: ejercicio para invertir una cola usando una pila
public class Refuerzo {

    // Invierte la cola: el último queda primero y el primero queda al final
    public static <T> void invertir(ColaEnlazada<T> cola) {
        Stack<T> pila = new Stack<>();

        // 1. Pasa todos los elementos de la cola a la pila
        while (!cola.estaVacia()) {
            pila.push(cola.desencolar());
        }

        // 2. Los regresa a la cola; la pila los saca al revés
        while (!pila.isEmpty()) {
            cola.encolar(pila.pop());
        }
    }
}