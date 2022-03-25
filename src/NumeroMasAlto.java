import java.util.Scanner;

public class NumeroMasAlto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[7];


        for (int i = 0; i < num.length; i++) {
            System.out.println("Ingrese un numero  entre 11 a 99: ");
            num[i] = sc.nextInt();
        }

        int aux = 0;


        for (int i = 0; i < num.length; i++) {
            aux = (aux > num[i])? aux: num[i];
        }
        System.out.println("El numero más alto es: " + aux);
    }
}

