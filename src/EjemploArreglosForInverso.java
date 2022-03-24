import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = new String[7];
        int j = productos.length;

        productos[0]= "Kingston pendrive";
        productos[1]= "Lapicero";
        productos[2]= "Macbook";
        productos[3]= "Pantalla lcd ";
        productos[4]= "Escritorio Brown";
        productos[5]= "Tecladoo mecanico gamer";
        productos[6]= "AMD Ryzen 5";

        //String[] productos = {"Kingston pendrive","Lapicero", "Macbook" }; otra forma de declarar este arreglo, pero es meno dinamico

        Arrays.sort(productos);  // ordenamos antes de

        for (int i = 0; i <j; i++) {   // mostramos todos los indices

            System.out.println("paria indice "+i+" : "+productos[i]);
        }
        // for arreglo inverso
        for (int i = 0; i <j ; i++) {
            System.out.println("paria indice "+(j-1-i)+" : "+(productos[j-1-i]));
        }

        //for arreglo inverso 2
        for (int i = j-1; i >=0 ; i--) {
            System.out.println("paria indice "+i+" : "+(productos[i]));
        }

    }

}
