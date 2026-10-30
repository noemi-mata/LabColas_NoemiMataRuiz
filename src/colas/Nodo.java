/*
*Noemi Mata Ruiz
*GTID244
*Viernes 30 Octubre 2026
*Cola con nodos enlazados
*/


package colas;

// Clase Nodo: guarda un dato y apunta al siguiente nodo
public class Nodo<T> {

    T dato;            // el valor que guarda el nodo
    Nodo<T> siguiente; // el nodo que sigue (null si es el último)

    // Constructor: crea el nodo con su dato
    Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}