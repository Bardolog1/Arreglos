import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {



        String[] productos = new String[7];
        int j = productos.length-1;

        productos[0]= "Kingston pendrive";
        productos[1]= "Lapicero";
        productos[2]= "Macbook";
        productos[3]= "Pantalla lcd ";
        productos[4]= "Escritorio Brown";
        productos[5]= "Tecladoo mecanico gamer";
        productos[6]= "AMD Ryzen 5";

        Arrays.sort(productos);  // ordenamos antes de

        for (int i = 0; i <j; i++) {   // mostramos todos los indices

            System.out.println("paria indice "+i+" : "+productos[i]);
        }





        int[] enteros = new int[10];// inicializamos pero no instanciamos ya que no hay datos
        int k = enteros.length-1;
        for(int i=0; i<k; i++){
            enteros [i] = i*3;

        }
        for(int i=0; i<k; i++){
            System.out.println("enteros = " + i);

        }

    }

}
