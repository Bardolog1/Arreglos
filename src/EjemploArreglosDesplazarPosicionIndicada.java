import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionIndicada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = new int[10];

        for (int i = 0; i <a.length-1 ; i++) {
            System.out.print("Ingrese un numero:");
            a[i]= sc.nextInt();
        }

        int posicion=0;
        int elemento=0;

        System.out.print("ingrese el nuevo numero:");
        elemento= sc.nextInt();
        System.out.print("ingrese la posicion:");
        posicion= sc.nextInt();

        for (int i = a.length-2;i>=posicion; i--) {
            a[i+1]=a[i];
        }
        a[posicion]=elemento;

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }



    }
}
