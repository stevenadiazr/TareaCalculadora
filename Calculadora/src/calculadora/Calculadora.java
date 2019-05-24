/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) throws VNV, EX{
            calculadora();
    }

    public static void calculadora() throws VNV, EX{
       boolean funciona= true;
       int opcion = 0;
       float valorA, valorB;
        do{
            try{
                System.out.println("Ingrese la accción que desea realizar: \n1. Realizar una suma. \n2. Realizar una resta. \n3. Realizar una multiplicacion \n4. Realizar una division \n5. Sacar raiz. \n6. Elevar un numero.");
                opcion = in.nextInt();
                if(opcion < 1 || opcion > 6){
                    throw new VNV();
                }
            funciona= false;
            }catch(InputMismatchException Ime){
                System.out.println("Usted no ha ingresado un numero, intente de nuevo por favor");
            }catch(VNV v){
                System.out.println("Usted ha ingresado un numero fuera de las opciones validas, intente de nuevo por favor");
            }finally{
                in.nextLine();
            }
        }while(funciona);
        funciona = true;
        do{
            try{
                System.out.println("Ingrese valor 1: ");
                valorA = in.nextInt();
                if(valorA > 1000 || valorA <-999){
                    throw new EX();
                }
                in.nextLine();
                System.out.println("Ingrese valor 2: ");
                valorB = in.nextInt();
                if(valorB > 1000 || valorB <-999){
                    throw new EX();
                }
                in.nextLine();
                switch(opcion){
                    case 1:{             
                        Calculos.Suma(valorA, valorB);
                        funciona = false;
                    }break;
                    case 2:{             
                        Calculos.Resta(valorA, valorB);
                        funciona = false;
                    }break;
                    case 3:{             
                        Calculos.Multiplicar(valorA, valorB);
                        funciona = false;
                    }break;
                    case 4:{             
                        Calculos.Dividir(valorA, valorB);
                        funciona = false;
                    }break;
                    case 5:{             
                        Calculos.Raiz(valorA, valorB);
                        funciona = false;
                    }break;
                    case 6:{             
                        Calculos.Elevar(valorA, valorB);
                        funciona = false;
                    }break;
                }
            }catch(InputMismatchException Ime){
                  Ime.getMessage();
                System.out.println("Usted no ha ingresado un numero, intente de nuevo por favor");
            }catch(EX ex){
                System.out.println("Usted ha ingresado un numero fuera de rango, introduzca un numero entre 1000 o -999");
            }
        }while(funciona);
        funciona = true;
        do{
            opcion = 0;
            System.out.println("1. Continuar. \n0.Salir. ");
            try{
                opcion = in.nextInt();
                if (opcion < 0 || opcion > 1){
                    throw new VNV();
                }
                funciona = false;
            }catch(InputMismatchException Ime){
                System.out.println("No ingreso un valor numerico, intente de nuevo");
            }catch(VNV vnv){
                System.out.println("No ingreso una opcion valida, intente de nuevo por favor");
            }finally{
                in.nextLine();
            }
        }while(funciona);
    }
}

