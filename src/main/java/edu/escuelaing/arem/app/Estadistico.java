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
public class Estadistico {

    private LinkedList elementsSet;

    public Estadistico(LinkedList elementsSet) {
        this.elementsSet = elementsSet;
    }

    /**
     * Calcular la media de un conjunto de elementos.
     *
     * @return El valor de la media de un conjunto de elmentos.
     */
    public float mean() {
        int sumatoria = 0;
        int elementsNumber = elementsSet.getNodos();
        if (elementsNumber == 0) {
            throw new RuntimeException("No hay elementos para realizar la operacion.");
        }
        elementsSet.setPointer(elementsSet.getFirst());
        for (int i = 0; i < elementsNumber; i++) {
            sumatoria += elementsSet.getPointer().getData();
            elementsSet.nextNode();
        }
        return (float) sumatoria / elementsNumber;
    }

    /**
     * Calcular la desviacion estandar de una coleccion de elementos.
     *
     * @return El valor de la desviacion estandar de una coleccion de elementos.
     */
    public float standardDeviation() {
        float mean = mean();
        float sumatoria = 0f;
        int elementsNumber = elementsSet.getNodos();
        if (elementsNumber < 2) {
            throw new RuntimeException("La cantidad de elementos debe ser mayor a uno.");
        }
        elementsSet.setPointer(elementsSet.getFirst());
        for (int i = 0; i < elementsNumber; i++) {
            sumatoria += (float) Math.pow(elementsSet.getPointer().getData() - mean, 2);
            elementsSet.nextNode();
        }
        return (float) Math.sqrt(sumatoria / (elementsNumber - 1));
    }
}
