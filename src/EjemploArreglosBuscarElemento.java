import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;

public class EjemploArreglosBuscarElemento {
    public static void main(String[] args) {
        String [] objetos = new String[10];
        for (int i = 0; i < objetos.length; i++) {
            objetos[i]=JOptionPane.showInputDialog(null, "Ingrese un objeto");
        }

        String buscar = JOptionPane.showInputDialog( null, "¿Qué desea buscar?" );


        int identi = 0;
        for (int i =0; i< objetos.length;i++){

            if (objetos[i].toLowerCase(Locale.ROOT).equalsIgnoreCase(buscar.toLowerCase(Locale.ROOT))){
                identi=i;
                break;
            }else{

                JOptionPane.showMessageDialog(null," ");
            }
        }
        for (int i = 0; i < objetos.length ; i++) {
            System.out.println( i+" "+objetos[i]);
        }


       JOptionPane.showMessageDialog(null,buscar+" se encuentra en el index " + identi);
        System.exit(0);
    }
}
