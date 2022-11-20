package promedio;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Promedio {
    public static void main(String[] args) {
        double numero=1, elemento=0, suma=0, acumulacion=1, notas=0;
        int calificacionesnum = 1;
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Cuántas calificaciones se van a registrar?: ");
        calificacionesnum = lectura.nextInt();
        
        while(numero <= calificacionesnum){
            System.out.println("Ingrese la calificacion número: "+acumulacion);
            float n = lectura.nextFloat();
            notas += n;
            numero++;
        }
        double promedio = notas/ calificacionesnum;
        System.out.println("El promedio es: "+promedio);
    }
    
}
