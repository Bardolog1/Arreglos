import java.util.Scanner;

public class EjemploArreglosEliminar {
    public static void main(String[] args) {
        int[]a = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length ; i++) {
            System.out.print(" Ingrese un numero: ");
            a[i]=scanner.nextInt();
        }
        System.out.println("\n");
        System.out.println("Un numero entre 0 y 9");
        int posicion = scanner.nextInt();

        for (int i = posicion; i < a.length-1; i++) {
            a[i]=a[i+1];
            
        }

        int[] d = new  int[a.length-1];
        System.arraycopy(a,0,d,0,d.length);  // copiamos a un nuevo arreglo

        for (int i = 0; i < d.length; i++) {
            System.out.print(" "+d[i]);
        }
        
    }
}
