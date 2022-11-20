package pago.vendedor;
import java.util.Scanner;

public class PagoVendedor {
    public static void main(String[] args) {
        double ventas=0, total=0;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Número de ventas: ");
        ventas = lectura.nextFloat();
        
        if(ventas >= 2000){
            total = ventas * (.20);
            System.out.println("Tu comision es de: " + total);
            
        }
        else if(ventas < 2000){
            total = ventas * (.10);
            System.out.println("Tu comision es de: " + total);
        }
        else{
            System.out.println("Datos faltantes");
        }
    }
    
}
