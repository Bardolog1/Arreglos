import java.util.Arrays;
import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] mate, hist, lengua;
        mate = new double[7];
        hist = new double[7];
        lengua = new double[7];

        double toMate=0, toHist=0, toLengua =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las 7 notas de matematicas");
        for (int i = 0; i < mate.length; i++) {
            mate[i]= sc.nextDouble();
        }
        System.out.println("Ingrese las 7 notas de Historia");
        for (int i = 0; i < hist.length; i++) {
            hist[i]= sc.nextDouble();
        }
        System.out.println("Ingrese las 7 notas de Lenguaje");
        for (int i = 0; i < lengua.length; i++) {
            lengua[i]= sc.nextDouble();
        }


        for (int i = 0; i < 7; i++) {
            toMate+=mate[i];
            toHist+=hist[i];
            toLengua+=lengua[i];
        }
        double proMate = toMate/mate.length;
        double proHisto = toHist/hist.length;
        double proLengua = toLengua/lengua.length;

        System.out.println("El promedio en matematicas es "+proMate);
        System.out.println("El promedio en historia es "+proHisto);
        System.out.println("El promedio en lenguaje es "+proLengua);
        System.out.println("El promedio del curso es = " + ((proMate+proHisto+proLengua)/3));

        System.out.println("ingrese el indice del alumno 0-6");
        int index = sc.nextInt();
        double mateIn   =mate[index];
        double histoIn  =hist[index];
        double lenguaIn =lengua[index];
        double promInd = (mateIn+histoIn+lenguaIn)/3;
        System.out.println("El estudiante "+
                index+" tiene promedio de "+promInd+"\nMatematicas: "
                +mateIn+"\nHistoria: "+histoIn+"\nLenguaje: "+lenguaIn);





    }
}
