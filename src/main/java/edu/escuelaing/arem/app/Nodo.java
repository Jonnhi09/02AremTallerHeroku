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
public class Nodo {

    private Nodo next, prior;
    private int data;

    /**
     * Implementa un tipo de dato Nodo para construir una lista
     *
     * @param data valor que se almacenara en el nodo.
     */
    public Nodo(int data) {
        this.data = data;
        next = null;
        prior = null;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrior() {
        return prior;
    }

    public void setPrior(Nodo prior) {
        this.prior = prior;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
