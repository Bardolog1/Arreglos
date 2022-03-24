import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        int total2= arreglo.length;

        for (int i = 0; i <total2 ; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }
    public static void sortBurbuja (Object[] arreglo){
        int total = arreglo.length;

        for (int i = 0; i < total-1; i++) {

            for (int j = 0; j < total-1-i; j++) {  // al total le restamos 1 para no desbordar el array y le restamos i para no iterar los falores ultimos ya que de porsi ya estarian ordenados
                if (((Comparable)arreglo[j+1]).compareTo(arreglo[j])<0) {  // compareTo verifica 2 string y dice cual es su posicionamiento segun UNICODE  un entero negativo es inferior un positivo es superior a otro
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }





    }
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive","Lapicero", "Macbook","Pantalla lcd ","Escritorio Brown", "Tecladoo mecanico gamer","AMD Ryzen 5"}; //otra forma de declarar este arreglo, pero es meno dinamico
        /*
        //algoritmo burbuja no optimizado
        for (int i = 0; i < total; i++) {

            for (int j = 0; j < total; j++) {
                if (productos[i].compareTo(productos[j])<0) {  // compareTo verifica 2 string y dice cual es su posicionamiento segun UNICODE  un entero negativo es inferior un positivo es superior a otro
                    String aux = productos[i];
                    productos[i] = productos[j];
                    productos[j] = aux;
                }
            }
        }
         */
        /*
        // algoritmo burbuja optimizado solo itera en el segundo for
        for (int i = 0; i < total-1; i++) {

            for (int j = 0; j < total-1-i; j++) {  // al total le restamos 1 para no desbordar el array y le restamos i para no iterar los falores ultimos ya que de porsi ya estarian ordenados
                if (productos[j+1].compareTo(productos[j])<0) {  // compareTo verifica 2 string y dice cual es su posicionamiento segun UNICODE  un entero negativo es inferior un positivo es superior a otro
                    String aux = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = aux;
                }
            }
        }

*/
        //Arrays.sort(productos);  // ordenamos de la A-Z
        // arregloInverso(productos); // damos vuelta y mostramos de Z-A
        sortBurbuja(productos);  // Ordenamos indices de un array de A-Z con una clase propia

        for (String pro: productos) System.out.println("pro = " + pro);


    }
}
