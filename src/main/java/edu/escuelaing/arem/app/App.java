package edu.escuelaing.arem.app;

/**
 *
 * Jonathan Prieto.
 */
public class App {

    private static float mean, standardDeviation;

    public static void calculate(String numbers) throws NumberFormatException {
        String[] setNumbers = numbers.split(",");
        LinkedList numberList = new LinkedList();
        Estadistico statistical;
        for (String n : setNumbers) {
            numberList.addNode(Float.parseFloat(n)); //Agregar nodos a la LinkedList.
        }
        statistical = new Estadistico(numberList);
        mean = statistical.mean();
        standardDeviation = statistical.standardDeviation();

    }

    public static float getMean() {
        return mean;
    }

    public static float getStandardDeviation() {
        return standardDeviation;
    }
}
