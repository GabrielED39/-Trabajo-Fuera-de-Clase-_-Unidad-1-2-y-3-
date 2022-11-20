package tablamulti;
import java.util.Scanner;
public class TablaMulti {
    public static void main(String[] args) {
        
        int numero;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Coloca el numero del cual quieres generar su tabla de multiplicar: ");
        numero = (int) lectura.nextFloat();
        for(int i = 0; i <= 10; i++){
            
            System.out.println(i+ "*" +numero+ "=" +numero*i);
        }
    }
    
}
