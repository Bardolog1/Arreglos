import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionIndicadaAumentar {
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




        int ultimo=a[a.length-1];
        for (int i = a.length-2;i>=posicion; i--) {
            a[i+1]=a[i];
        }
        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        b[posicion]=elemento;
        b[b.length-1]=ultimo;
        for (int i = 0; i <b.length ; i++) {
            System.out.print(b[i]+" ");
        }



    }
}
