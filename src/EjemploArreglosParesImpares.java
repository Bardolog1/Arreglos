import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

       int cuentaPar=0;
       int cuentaImp=0;

        int [] a , pares, impares;
        a = new int[10];
        Scanner sca = new Scanner(System.in);

        try {
            System.out.println("Ingrese 10 numeros");
            for (int i = 0; i < a.length; i++) a[i] = sca.nextInt();

            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) cuentaPar++;
                else cuentaImp++;
            }

            pares = new int[cuentaPar];
            impares = new int[cuentaImp];

            int j = 0; // pares
            int k = 0;// impares

            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) pares[j++] = a[i];
                else impares[k++] = a[i];
            }
            System.out.println("Pares");
            for (int pa : pares) System.out.print(pa+" ");

            System.out.println("\r\nImpares");
            for (int impa : impares) System.out.print(impa+" ");
        }catch (Exception e){

            System.err.println("tipo de dato no valido: "+e);
        }



    }
}
