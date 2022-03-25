import java.util.Scanner;

public class EjemploArreglosOrdenFinalPrincipio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese un numero: ");
            num[i] = scanner.nextInt();
        }

        int largo = num.length;
        int au = 0;

        for (int i = 0; i < largo - i; i++) {
            a[au++] = num[num.length - 1 - i];
            a[au++] = num[i];

        }
        for (int nume : a)
            System.out.print(" " + nume);
    }


}
