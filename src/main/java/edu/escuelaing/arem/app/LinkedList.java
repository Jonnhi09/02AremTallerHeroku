/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.app;

/**
 *
 * @author Jonathan Prieto
 */
public class LinkedList {

    private int nodos;
    private Nodo first, last, pointer;

    /**
     * Implementa una lista doblemente encadenada.
     */
    public LinkedList() {
        nodos = 0;
        first = null;
        last = null;
        pointer = null;
    }

    /**
     * Agregar un nodo al final de la lista.
     *
     * @param num dato que se almacenara en el nuevo nodo a agregar
     */
    public void addNode(int num) {
        Nodo newNodo = new Nodo(num);
        if (nodos == 0) {
            first = newNodo;
            last = newNodo;
            pointer = newNodo;
        } else {
            newNodo.setPrior(last);
            last.setNext(newNodo);
            last = newNodo;
        }
        nodos++;
    }

    /**
     * Remover un nodo al final de la lista.
     */
    public void removeNode() {
        if (nodos > 1) {
            last = last.getPrior();
            last.setNext(null);
            pointer = first;
            nodos--;
        } else if (nodos == 1) {
            first = null;
            last = null;
            pointer = null;
            nodos--;
        }
    }

    /**
     * Apuntador se actualiza con el nodo siguiente.
     */
    public void nextNode() {
        if (pointer != null) {
            pointer = pointer.getNext();
        } else {
            pointer = first;
        }
    }

    /**
     * Apuntador se actualiza con el nodo anterior a este.
     */
    public void priorNode() {
        if (pointer != null) {
            pointer = pointer.getPrior();
        } else {
            pointer = last;
        }
    }

    public int getNodos() {
        return nodos;
    }

    public void setNodos(int nodos) {
        this.nodos = nodos;
    }

    public Nodo getFirst() {
        return first;
    }

    public void setFirst(Nodo first) {
        this.first = first;
    }

    public Nodo getLast() {
        return last;
    }

    public void setLast(Nodo last) {
        this.last = last;
    }

    public Nodo getPointer() {
        return pointer;
    }

    public void setPointer(Nodo pointer) {
        this.pointer = pointer;
    }

}
