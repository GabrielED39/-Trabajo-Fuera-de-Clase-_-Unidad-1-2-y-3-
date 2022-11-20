package imc;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        float altura=0, peso=0, imc=0;
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Introduce tú altura en metros: ");
        altura = lectura.nextFloat();
        System.out.println("Introduce tú peso en Kg: ");
        peso = lectura.nextFloat();
        
       imc = peso/(altura * altura);
       
       if(imc <= 18.4){
           System.out.println("Peso Bajo, coma más");
       }
       else if(imc >= 18.5 && imc < 25){
           System.out.println("Peso Correcto");
       }
       else if(imc >= 25 && imc < 29){
           System.out.println("Alto, haga dieta y ejercicio");
       }
       else{
           System.out.println("Datos faltantes");
       }
        
    }
    
}
