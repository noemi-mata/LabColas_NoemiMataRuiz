/*
*Noemi Mata Ruiz
*GTID244
*Viernes 30 Octubre 2026
*Cola con nodos enlazados
*/


package colas;

// Clase ColaEnlazada: cola hecha con nodos, sin límite de tamaño.
// El primero que entra es el primero que sale (FIFO).
public class ColaEnlazada<T> {

    private Nodo<T> frente; // primer nodo (el que sale)
    private Nodo<T> fin;    // último nodo (donde se agregan)
    private int tamanio;    // cuántos elementos hay

    // Regresa true si la cola no tiene elementos
    public boolean estaVacia() {
        return frente == null;
    }

    // Regresa cuántos elementos hay
    public int tamanio() {
        return tamanio;
    }

    // Agrega un elemento al final
    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (estaVacia()) {
            frente = nuevo;        // si está vacía, es el primero
        } else {
            fin.siguiente = nuevo; // si no, se pega al final
        }
        fin = nuevo;
        tamanio++;
    }

    // Saca y regresa el elemento del frente
    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato;
        frente = frente.siguiente; // el frente pasa al siguiente
        if (frente == null) {
            fin = null;            // la cola quedó vacía
        }
        tamanio--;
        return valor;
    }

    // Muestra el elemento del frente sin sacarlo
    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

	    // Muestra todos los elementos del frente al final, sin sacarlos
    public void imprimirCola() {
        Nodo<T> actual = frente; // empieza en el primero
        System.out.print("[");
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(", ");
            }
            actual = actual.siguiente; // pasa al siguiente nodo
        }
        System.out.println("]");
    }
}