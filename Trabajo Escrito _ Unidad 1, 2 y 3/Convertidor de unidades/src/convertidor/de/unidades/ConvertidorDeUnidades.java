package convertidor.de.unidades;

import java.util.Scanner;

public class ConvertidorDeUnidades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1,num2,resultado;
        int opcion;
        boolean opc= true;
        while(opc){
            System.out.println("*****Conversor de unidades*****");
            System.out.println("1: MILIMETROS");
            System.out.println("2: CENTIMETROS");
            System.out.println("3: METROS");
            System.out.println("4: YARDA");
            System.out.println("5: PIES (FT)");
            System.out.println("6: KILOMETROS");
            System.out.println("Selecciona que unidad quieres convertir: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    int opcionuno;
                    System.out.println("*****Conversor de MILIMETROS*****");
                    System.out.println("1: CENTIMETROS");
                    System.out.println("2: METROS");
                    System.out.println("3: YARDA");
                    System.out.println("4: PIES (FT)");
                    System.out.println("5: KILOMETROS");
                    System.out.println("Selecciona a que unidad quieres convertir los MILIMETROS: ");
                    opcionuno = entrada.nextInt();
                    switch(opcionuno){
                        case 1:
                            double mili;
                            System.out.println("Ingresa la cantidad de MILIMETROS a convertir:");
                            mili = entrada.nextDouble();
                            resultado = mili * 0.1;
                            System.out.println("La cantidad de " +mili+ " MILIMETROS es equivalente a "+resultado+"CENTIMETROS");
                            break;
                        case 2:
                            double mili1;
                            System.out.println("Ingresa la cantidad de MILIMETROS a convertir:");
                            mili1 = entrada.nextDouble();
                            resultado = mili1 * 0.01;
                            System.out.println("La cantidad de " +mili1+ " MILIMETROS es equivalente a "+resultado+"METROS");
                            break;
                        case 3:
                            double mili2;
                            System.out.println("Ingresa la cantidad de MILIMETROS a convertir:");
                            mili2 = entrada.nextDouble();
                            resultado = mili2 * 0.0109361;
                            System.out.println("La cantidad de " +mili2+ " MILIMETROS es equivalente a "+resultado+"YARDA");
                            break;
                        case 4:
                            double mili3;
                            System.out.println("Ingresa la cantidad de MILIMETROS a convertir:");
                            mili3 = entrada.nextDouble();
                            resultado = mili3 * 0.00328084;
                            System.out.println("La cantidad de " +mili3+ " MILIMETROS es equivalente a "+resultado+"PIES");
                            break;
                        case 5:
                            double mili4;
                            System.out.println("Ingresa la cantidad de MILIMETROS a convertir:");
                            mili4 = entrada.nextDouble();
                            resultado = mili4 * 0.000001;
                            System.out.println("La cantidad de " +mili4+ " MILIMETROS es equivalente a "+resultado+"KILOMETROS");
                            break;       
                    }
                    break;
                    
                case 2:
                    int opciondos;
                    System.out.println("*****Conversor de CENTIMETROS*****");
                    System.out.println("1: MILIMETROS");
                    System.out.println("2: METROS");
                    System.out.println("3: YARDA");
                    System.out.println("4: PIES (FT)");
                    System.out.println("5: KILOMETROS");
                    System.out.println("Selecciona a que unidad quieres convertir los CENTIMETROS: ");
                    opciondos = entrada.nextInt();
                    switch(opciondos){
                        case 1:
                            double mili;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili = entrada.nextDouble();
                            resultado = mili * 10;
                            System.out.println("La cantidad de " +mili+ " CENTIMETROS es equivalente a "+resultado+" MILIMETROS");
                            break;
                        case 2:
                            double mili1;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili1 = entrada.nextDouble();
                            resultado = mili1 * 0.01;
                            System.out.println("La cantidad de " +mili1+ " CENTIMETROS es equivalente a "+resultado+" METROS");
                            break;
                        case 3:
                            double mili2;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili2 = entrada.nextDouble();
                            resultado = mili2 * 0.0109361;
                            System.out.println("La cantidad de " +mili2+ " CENTIMETROS es equivalente a "+resultado+" YARDA");
                            break;
                        case 4:
                            double mili3;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili3 = entrada.nextDouble();
                            resultado = mili3 * 0.00328084;
                            System.out.println("La cantidad de " +mili3+ " CENTIMETROS es equivalente a "+resultado+" PIES");
                            break;
                        case 5:
                            double mili4;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili4 = entrada.nextDouble();
                            resultado = mili4 * 0.000001;
                            System.out.println("La cantidad de " +mili4+ " CENTIMETROS es equivalente a "+resultado+"KILOMETROS");
                            break;       
                    }
                    break;
                    
                case 3:
                    int opciontres;
                    System.out.println("*****Conversor de METROS*****");
                    System.out.println("1: MILIMETROS");
                    System.out.println("2: CENTIMETROS");
                    System.out.println("3: YARDA");
                    System.out.println("4: PIES (FT)");
                    System.out.println("5: KILOMETROS");
                    System.out.println("Selecciona a que unidad quieres convertir los METROS: ");
                    opciontres = entrada.nextInt();
                    switch(opciontres){
                        case 1:
                            double mili;
                            System.out.println("Ingresa la cantidad de METROS a convertir:");
                            mili = entrada.nextDouble();
                            resultado = mili * 1000;
                            System.out.println("La cantidad de " +mili+ " METROS es equivalente a "+resultado+" MILIMETROS");
                            break;
                        case 2:
                            double mili1;
                            System.out.println("Ingresa la cantidad de METROS a convertir:");
                            mili1 = entrada.nextDouble();
                            resultado = mili1 * 100;
                            System.out.println("La cantidad de " +mili1+ " METROS es equivalente a "+resultado+" CENTIMETROS");
                            break;
                        case 3:
                            double mili2;
                            System.out.println("Ingresa la cantidad de METROS a convertir:");
                            mili2 = entrada.nextDouble();
                            resultado = mili2 * 1.09361;
                            System.out.println("La cantidad de " +mili2+ " METROS es equivalente a "+resultado+" YARDA");
                            break;
                        case 4:
                            double mili3;
                            System.out.println("Ingresa la cantidad de METROS a convertir:");
                            mili3 = entrada.nextDouble();
                            resultado = mili3 * 3.28083;
                            System.out.println("La cantidad de " +mili3+ " METROS es equivalente a "+resultado+" PIES");
                            break;
                        case 5:
                            double mili4;
                            System.out.println("Ingresa la cantidad de METROS a convertir:");
                            mili4 = entrada.nextDouble();
                            resultado = mili4 * 0.001;
                            System.out.println("La cantidad de " +mili4+ " METROS es equivalente a "+resultado+"KILOMETROS");
                            break;       
                    }
                    break;
                    
                case 4:
                    int opcioncuatro;
                    System.out.println("*****Conversor de YARDA*****");
                    System.out.println("1: MILIMETROS");
                    System.out.println("2: CENTIMETROS");
                    System.out.println("3: METROS");
                    System.out.println("4: PIES (FT)");
                    System.out.println("5: KILOMETROS");
                    System.out.println("Selecciona a que unidad quieres convertir las YARDAS: ");
                    opcioncuatro = entrada.nextInt();
                    switch(opcioncuatro){
                        case 1:
                            double mili;
                            System.out.println("Ingresa la cantidad de YARDAS a convertir:");
                            mili = entrada.nextDouble();
                            resultado = mili * 914.4;
                            System.out.println("La cantidad de " +mili+ " YARDAS es equivalente a "+resultado+" MILIMETROS");
                            break;
                        case 2:
                            double mili1;
                            System.out.println("Ingresa la cantidad de YARDAS a convertir:");
                            mili1 = entrada.nextDouble();
                            resultado = mili1 * 91.44;
                            System.out.println("La cantidad de " +mili1+ " YARDAS es equivalente a "+resultado+" CENTIMETROS");
                            break;
                        case 3:
                            double mili2;
                            System.out.println("Ingresa la cantidad de YARDAS a convertir:");
                            mili2 = entrada.nextDouble();
                            resultado = mili2 * 0.9144;
                            System.out.println("La cantidad de " +mili2+ " YARDAS es equivalente a "+resultado+" METROS");
                            break;
                        case 4:
                            double mili3;
                            System.out.println("Ingresa la cantidad de YARDAS a convertir:");
                            mili3 = entrada.nextDouble();
                            resultado = mili3 * 3;
                            System.out.println("La cantidad de " +mili3+ " YARDAS es equivalente a "+resultado+" PIES");
                            break;
                        case 5:
                            double mili4;
                            System.out.println("Ingresa la cantidad de YARDAS a convertir:");
                            mili4 = entrada.nextDouble();
                            resultado = mili4 * 0.0009144;
                            System.out.println("La cantidad de " +mili4+ " YARDAS es equivalente a "+resultado+"KILOMETROS");
                            break;       
                    }
                    break;
                    
                case 5:
                    int opcioncinco;
                    System.out.println("*****Conversor de PIES*****");
                    System.out.println("1: MILIMETROS");
                    System.out.println("2: CENTIMETROS");
                    System.out.println("3: METROS");
                    System.out.println("4: YARDAS");
                    System.out.println("5: KILOMETROS");
                    System.out.println("Selecciona a que unidad quieres convertir los PIES: ");
                    opcioncinco = entrada.nextInt();
                    switch(opcioncinco){
                        case 1:
                            double mili;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili = entrada.nextDouble();
                            resultado = mili * 304.8;
                            System.out.println("La cantidad de " +mili+ " CENTIMETROS es equivalente a "+resultado+" MILIMETROS");
                            break;
                        case 2:
                            double mili1;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili1 = entrada.nextDouble();
                            resultado = mili1 * 30.48;
                            System.out.println("La cantidad de " +mili1+ " CENTIMETROS es equivalente a "+resultado+" CENTIMETROS");
                            break;
                        case 3:
                            double mili2;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili2 = entrada.nextDouble();
                            resultado = mili2 * 0.3048;
                            System.out.println("La cantidad de " +mili2+ " CENTIMETROS es equivalente a "+resultado+" METROS");
                            break;
                        case 4:
                            double mili3;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili3 = entrada.nextDouble();
                            resultado = mili3 * 0.333333;
                            System.out.println("La cantidad de " +mili3+ " CENTIMETROS es equivalente a "+resultado+" YARDAS");
                            break;
                        case 5:
                            double mili4;
                            System.out.println("Ingresa la cantidad de CENTIMETROS a convertir:");
                            mili4 = entrada.nextDouble();
                            resultado = mili4 * 0.0003048;
                            System.out.println("La cantidad de " +mili4+ " CENTIMETROS es equivalente a "+resultado+"KILOMETROS");
                            break;       
                    }
                    break;
                    
                case 6:
                    int opcionseis;
                    System.out.println("*****Conversor de KILOMETROS*****");
                    System.out.println("1: MILIMETROS");
                    System.out.println("2: CENTIMETROS");
                    System.out.println("3: METROS");
                    System.out.println("4: YARDA");
                    System.out.println("5: PIES (FT)");
                    System.out.println("Selecciona a que unidad quieres convertir los KILOMETROS: ");
                    opcionseis = entrada.nextInt();
                    switch(opcionseis){
                        case 1:
                            double mili;
                            System.out.println("Ingresa la cantidad de KILOMETROS a convertir:");
                            mili = entrada.nextDouble();
                            resultado = mili * 1000000;
                            System.out.println("La cantidad de " +mili+ " KILOMETROS es equivalente a "+resultado+" MILIMETROS");
                            break;
                        case 2:
                            double mili1;
                            System.out.println("Ingresa la cantidad de KILOMETROS a convertir:");
                            mili1 = entrada.nextDouble();
                            resultado = mili1 * 100000;
                            System.out.println("La cantidad de " +mili1+ " KILOMETROS es equivalente a "+resultado+" CENTIMETROS");
                            break;
                        case 3:
                            double mili2;
                            System.out.println("Ingresa la cantidad de KILOMETROS a convertir:");
                            mili2 = entrada.nextDouble();
                            resultado = mili2 * 1000;
                            System.out.println("La cantidad de " +mili2+ " KILOMETROS es equivalente a "+resultado+" METROS");
                            break;
                        case 4:
                            double mili3;
                            System.out.println("Ingresa la cantidad de KILOMETROS a convertir:");
                            mili3 = entrada.nextDouble();
                            resultado = mili3 * 1093.61;
                            System.out.println("La cantidad de " +mili3+ " KILOMETROS es equivalente a "+resultado+" YARDAS");
                            break;
                        case 5:
                            double mili4;
                            System.out.println("Ingresa la cantidad de KILOMETROS a convertir:");
                            mili4 = entrada.nextDouble();
                            resultado = mili4 * 3280.84;
                            System.out.println("La cantidad de " +mili4+ " KILOMETROS es equivalente a "+resultado+"PIES");
                            break;       
                    }
                    break;   
            }
        }
    }
}
