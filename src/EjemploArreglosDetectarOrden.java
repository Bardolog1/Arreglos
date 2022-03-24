import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        int[] a =new int[7];

        Scanner sc = new  Scanner(System.in);
        System.out.println("Ingrese 7 datos");

        for (int i = 0; i <a.length ; i++) {
            a[i] = sc.nextInt();
        }


        boolean banderaAs= false;
        boolean banderaDe=false;
        for(int i=0; i<a.length-1;i++){
            if (a[i]>a[i+1]) {
                banderaDe=true;
            }
            if (a[i]<a[i+1]){
                banderaAs=true;
            }
        }
            if (banderaAs==true&&banderaDe==true){
                System.out.println("Arreglo desordenado");
            }
            if (banderaAs==false&&banderaDe==false){
                System.out.println("Arreglo todos iguales  ");
            }
            if (banderaAs==true&&banderaDe==false){
                System.out.println("Arreglo ascendente");
            }
            if (banderaAs==false&&banderaDe==true){
                System.out.println("Arreglo Desendente");
            }
    }
}
