import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a= new int[5];
        try {
            System.out.println("Ingrese 5 numeros");

            for (int i=0; i<a.length; i++) a[i]  =scan.nextInt();
            for (int aa:a) System.out.println("aa = " + aa);


            int max=0;
            for (int i = 1; i <a.length ; i++) {
                max=(a[max] > a[i])? max:i;
            }

            System.out.println("Mayor = " + a[max]);

        }catch (Exception e){
            System.err.println("Dato invalido: "+e);
        }
    }
}
