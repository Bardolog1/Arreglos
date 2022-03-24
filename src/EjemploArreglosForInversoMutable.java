import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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
    public static void main(String[] args) {

        String[] productos = {"Kingston pendrive","Lapicero", "Macbook","Pantalla lcd ","Escritorio Brown", "Tecladoo mecanico gamer","AMD Ryzen 5"}; //otra forma de declarar este arreglo, pero es meno dinamico
        Arrays.sort(productos);  // ordenamos de la A-Z
        arregloInverso(productos); // damos vuelta y mostramos de Z-A
        for (String pro: productos) System.out.println("pro = " + pro);

        // volvemos a dar vuelta de la A-Z pero ahora con la API ya implementada en JAVA

        Collections.reverse(Arrays.asList(productos));  // convertimos el arreglo a una lista y luego la lista le damos reversa, la ponemos en orden contrario
        for (String pro: productos) System.out.println("pro = " + pro);

    }
}
