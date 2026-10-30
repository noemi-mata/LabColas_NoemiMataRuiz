/*
*Noemi Mata Ruiz
*GTID244
*30 Octubre 2026
*/

package colas;

//Usar Queue de Java 
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
 

public class Main { 
	public static void main(String[] args) { 
	System.out.println("Entorno listo"); 

	//Probar la cola
	System.out.println("\n--- Parte 1.5: Probar la lista ---");
	System.out.println("Probar la cola"); 

	ColaArreglo cola = new ColaArreglo(3); 
	cola.encolar(10); 
	cola.encolar(20); 
	cola.encolar(30); 
	System.out.println("Sale: " + cola.desencolar()); // 10 
	cola.encolar(40); // reutiliza la posición 0
	System.out.println("Frente: " + cola.frente()); // 20 
	System.out.println("Tamaño: " + cola.tamanio()); // 3 
	System.out.println("¿Llena? " + cola.estaLlena()); // true 

	System.out.println("\n--- Parte 2.6: Probar con genericos ---");

	//Probar con genericos
	System.out.println("Probar con genericos");
	ColaEnlazada<String> nombres = new ColaEnlazada<>(); 
	nombres.encolar("Ana"); 
	nombres.encolar("Luis"); 
	nombres.encolar("María"); 
	System.out.println(nombres.desencolar()); // Ana 
	System.out.println(nombres.frente()); // Luis 
	System.out.println(nombres.tamanio()); // 2 


        System.out.println("\n--- Parte 3.1: LinkedList ---");
        Queue<String> cola1 = new LinkedList<>();
        cola1.offer("Ana");   // agrega al final
        cola1.offer("Luis");
        cola1.offer("María");
        System.out.println(cola1.peek()); // Ana (solo la muestra)
        System.out.println(cola1.poll()); // Ana (la saca)
        System.out.println(cola1.size()); // 2
        System.out.println(cola1);        // [Luis, María]

        System.out.println("\n--- Parte 3.1: ArrayDeque ---");
        Queue<String> cola2 = new ArrayDeque<>();
        cola2.offer("Ana");
        cola2.offer("Luis");
        cola2.offer("María");
        System.out.println(cola2.peek()); // Ana
        System.out.println(cola2.poll()); // Ana
        System.out.println(cola2.size()); // 2
        System.out.println(cola2);        // [Luis, María]

        System.out.println("\n--- Parte 3.2: cola vacía ---");
        Queue<String> vacia = new LinkedList<>();

        // remove() lanza excepción si está vacía
        try {
            vacia.remove();
        } catch (Exception e) {
            System.out.println("remove()  -> excepción " + e.getClass().getSimpleName());
        }

        // poll() regresa null si está vacía
        System.out.println("poll()    -> " + vacia.poll());

        // element() lanza excepción si está vacía
        try {
            vacia.element();
        } catch (Exception e) {
            System.out.println("element() -> excepción " + e.getClass().getSimpleName());
        }

        // peek() regresa null si está vacía
        System.out.println("peek()    -> " + vacia.peek());

        System.out.println("\n--- Parte 3.3: PriorityQueue ---");
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.poll()); // 10 (sale el más chico)
        System.out.println(pq.poll()); // 20
        System.out.println(pq.poll()); // 30


        System.out.println("\n--- Parte 5: Refuerzo ---");
        ColaEnlazada<Integer> numeros = new ColaEnlazada<>();
        numeros.encolar(1);
        numeros.encolar(2);
        numeros.encolar(3);
        numeros.encolar(4);
        numeros.encolar(5);

        // Ejercicio 1: imprimir sin destruir la cola
        System.out.print("Cola original: ");
        numeros.imprimirCola();
        System.out.println("Tamaño después de imprimir: " + numeros.tamanio());

        // Ejercicio 3: invertir con una pila
        Refuerzo.invertir(numeros);
        System.out.print("Cola invertida: ");
        numeros.imprimirCola();
	
	} 
} 