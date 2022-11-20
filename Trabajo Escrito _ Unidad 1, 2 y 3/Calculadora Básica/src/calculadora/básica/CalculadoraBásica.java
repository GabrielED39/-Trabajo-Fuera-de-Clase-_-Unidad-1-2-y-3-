package calculadora.básica;
import java.util.Scanner;
public class CalculadoraBásica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1,num2,resultado;
        int opcion;
        boolean opc= true;
        while(opc){
            System.out.println("1: SUMAR");
            System.out.println("2: RESTAR");
            System.out.println("3: MULTIPLICAR");
            System.out.println("4: DIVIDIR");
            System.out.println("Selecciona un número: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingresar Primer Valor:");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresar Segundo Valor:");
                    num2 = entrada.nextDouble();
                    resultado = (num1+num2);
                    System.out.println("La suma es = "+resultado);
                    break;
                case 2:
                    System.out.println("Ingresar Primer Valor:");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresar Segundo Valor:");
                    num2 = entrada.nextDouble();
                    resultado = (num1-num2);
                    System.out.println("La resta es = "+resultado);
                    break;
                case 3:
                    System.out.println("Ingresar Primer Valor:");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresar Segundo Valor:");
                    num2 = entrada.nextDouble();
                    resultado = (num1*num2);
                    System.out.println("La multiplicacion es = "+resultado);
                    break;
                case 4:
                    System.out.println("Ingresar Primer Valor:");
                    num1 = entrada.nextDouble();
                    System.out.println("Ingresar Segundo Valor:");
                    num2 = entrada.nextDouble();
                    resultado = (num1/num2);
                    System.out.println("La division es = "+resultado);
                    break;
            }
        }
    }
}
