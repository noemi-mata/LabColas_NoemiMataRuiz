# ARCHIVO PDF - NOEMI MATA RUIZ
[Guía de Laboratorio Colas en Java.pdf](https://github.com/user-attachments/files/34201874/Guia.de.Laboratorio.Colas.en.Java.pdf)


# Laboratorio: Colas en Java

**Alumna:** Noemi Mata Ruiz
**Materia:** Estructuras de Datos

Implementación y uso de la estructura de datos **cola** (Queue), basada en el principio **FIFO** (First In, First Out). Todas las operaciones básicas (`encolar`, `desencolar`, `frente`, `estaVacia`, `tamanio`) tienen complejidad **O(1)**.

**ColaArreglo:** cola de enteros con capacidad fija implementada sobre un **arreglo circular**. Los índices `frente` y `fin` avanzan con aritmética modular (`(i + 1) % capacidad`), lo que permite reutilizar las posiciones liberadas. Lanza `IllegalStateException` si se intenta encolar con la cola llena o desencolar con la cola vacía.

**ColaEnlazada<T>:** cola **genérica** implementada con nodos enlazados (`Nodo<T>`) y referencias a `frente` y `fin`. No tiene límite de capacidad; al quedar vacía se reinicia `fin = null` para mantener la consistencia de la estructura.

**Interfaz Queue:** uso de `LinkedList`, `ArrayDeque` y `PriorityQueue`. Se compararon los métodos que lanzan excepción con la cola vacía (`remove`, `element` → `NoSuchElementException`) contra los que devuelven un valor especial (`poll`, `peek` → `null`). `PriorityQueue` ordena por prioridad natural (min-heap), no por orden de llegada.

**Banco:** simulación de una fila con un solo cajero usando `ColaEnlazada<String>` y `Scanner`, con un menú en ciclo `do-while` y validación de `estaVacia()` antes de atender o consultar.

**Refuerzo:**
- `imprimirCola()`: recorre los nodos del frente al final sin modificar la cola.
- `invertir()`: invierte la cola usando una pila (`Stack`, LIFO).
