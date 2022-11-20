package factorial;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        
        int numero = leer.nextInt();
        int factorial = 1;
        
        while(numero != 0){
            factorial*=numero;
            numero --;
        }
        System.out.println("El factorial es: "+factorial);
    }
    
}
