import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
        productos[0]= "Kingston pendrive";
        productos[1]= "Lapicero";
        productos[2]= "Macbook";
        productos[3]= "Pantalla lcd ";
        productos[4]= "Escritorio Brown";
        productos[5]= "Tecladoo mecanico gamer";
        productos[6]= "AMD Ryzen 5";

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        Arrays.sort(productos); // lo ordena de A-Z  o  numericamente  arrays es una clase de ayuda

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);
















        int[] enteros = new int[4];// inicializamos pero no instanciamos ya que no hay datos


        // asignamos valores a cada espacio en el arreglo enteros
        enteros[0] = 1;
        enteros[1] = Integer.valueOf("2"); // tambien un
        enteros[2] = 3;
        enteros[3] = 4;



        // los asignamos a un primitivo para poder verlos
        int i = enteros[0];
        int j = enteros[1];
        int k = enteros[2];
        int l = enteros[3];
        // mostramos en pantalla
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);





    }

}
