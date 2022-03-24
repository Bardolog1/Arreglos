public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a,b,c,d;
        a=new int[10];
        b=new int[10];
        c=new int[20];
        d=new int[20];

        // llenados de datos a y b

        for (int i = 0; i <a.length ; i++) {
            a[i]=i+1;
        }
        for (int i = 0; i <a.length ; i++) {
            b[i]=(i+1)*5;
        }


        // iteramos agregando a c de a un indice
        int au =0;
        for (int i = 0; i <b.length ; i++) {
            c[au++]=a[i];
            c[au++]=b[i];
        }
        System.out.println("");
        System.out.println("");
        for (int li :a) System.out.print(li+" ");
        System.out.println("");
        for (int li :b) System.out.print(li+" ");
        System.out.println("");
        for (int li :c) System.out.print(li+" ");
        System.out.println("");
        System.out.println("");



        // iteramos agregando a d de a 2 indices
        int au2 =0;
        for (int i = 0; i <b.length ; i+=2) {
            for (int j = 0; j < 2; j++) {
                d[au2++]=a[i+j];
            }
            for (int j = 0; j < 2; j++) {
                d[au2++]=b[i+j];
            }
        }
        //mostramos datos
        System.out.println("");
        System.out.println("");
        for (int li :a) System.out.print(li+" ");
        System.out.println("");
        for (int li :b) System.out.print(li+" ");
        System.out.println("");
        for (int li :d) System.out.print(li+" ");
        System.out.println("");
        System.out.println("");

    }
}
