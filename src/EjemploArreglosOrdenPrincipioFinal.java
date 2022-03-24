public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] num = new int[10];
        int[] a = new int[10];
        for (int i = 0; i <num.length ; i++) {
            num[i]=i+1;
        }

        int largo= num.length;
        int au= 0;
        for (int i = 0; i < largo-i; i++) {
            System.out.print(num[i]);
            System.out.print(num[num.length-1-i] +" ");
            System.out.println();
            a[au++]=num[i];
            a[au++]=num[num.length-1-i];
        }
        for (int nume: a) System.out.println("nume = " + nume);
    }
}
