package pago.semanal;
import java.util.Scanner;
public class PagoSemanal {
    public static void main(String[] args) {
        double pago=0, horas=0, extradoble=0, extratriple=0;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Horas trabajadas: ");
        horas = lectura.nextFloat();
        
        if(horas <= 40 ){
            System.out.println("Pago NORMAL por hora: "+horas);
            
        }
        else if(horas <=47 && horas >= 41){
            System.out.println("Horas extras trabajadas: ");
            extradoble = lectura.nextFloat();
            if(extradoble <= 7){
                System.out.println("Pago DOBLE por hora: ");
                System.out.println("Pago Normal: 40");
                System.out.println("Pago Doble: "+extradoble);
            }else{
                System.out.println("Datos incorrectos, las horas extras deben ser menor o iguales a 7");
            }
            
            
        }else if(horas >= 48){
            System.out.println("Horas extras DOBLES trabajadas: ");
            extradoble = lectura.nextFloat();
            
            if(extradoble <= 7){
                System.out.println("Horas extras TRIPLES trabajadas: ");
                extratriple = lectura.nextFloat();
                System.out.println("Pago TRIPLE por hora: ");
                System.out.println("Pago Normal: 40.0");
                System.out.println("Pago DOBLE: "+extradoble);
                System.out.println("Pago TRIPLE: "+extratriple);
            }else{
                System.out.println("Datos incorrectos, las horas extras DOBLES deben ser menor o iguales a 7");
            }
            
        }
    }
    
}
