package foranidados;
import java.util.Scanner;
public class Foranidados {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Numero 1");
        
        for (int linea = 1; linea < 4; linea++) {
            for (int col = 0; col < linea; col++) {
                System.out.println("* ");
            }
            System.out.println("");
        }
        
        System.out.println("Numero 2");
        for (int linea = 1; linea < 4; linea++) {
            for (int col = 0; col < 4-linea; col++) {
                System.out.println("* ");
            }
            System.out.println("");
        }
        
        System.out.println("Numero 3");
        for (int linea = 1; linea < 4; linea++) {
            for (int col = 0; col < linea; col++) {
                System.out.println(" ");
            }
            for (int col = 0; col < linea; col++) {
                System.out.println("");
            }
            for (int col = 0; col <4- linea; col++) {
                System.out.println("* ");
            }
            System.out.println("");
        }
        
        System.out.println("Numero 4");
        for (int linea = 1; linea <4; linea++) {
            for (int col = 0; col <4-linea; col++) {
                System.out.println("  ");
            }
            for (int col = 0; col < linea; col++) {
                System.out.println("* ");
            }
        }
    }
    
}
