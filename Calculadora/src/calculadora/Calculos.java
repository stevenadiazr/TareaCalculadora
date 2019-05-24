/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Calculos {
    static Scanner in = new Scanner(System.in);
    
    public static void Suma(float valorA, float valorB) throws EX, VNV{
        float resultado = 0;
        try{
            resultado = valorA + valorB;
            if (resultado < -999 || resultado > 1000){
                throw new EX();
            }
        }catch(EX ex){
            System.out.println(ex);
            Calculadora.calculadora();
        }
        System.out.println("El resultado es: " + resultado);
    }
    
    public static void Resta(float valorA, float valorB) throws EX, VNV{
        float resultado = 0;
        try{
            resultado = valorA - valorB;
            if (resultado < -999 || resultado > 1000){
                throw new EX();
            }
        }catch(EX ex){
            System.out.println(ex);
            Calculadora.calculadora();
        }
        System.out.println("El resultado es: " + resultado);
    }
    
    public static void Multiplicar(float valorA, float valorB) throws EX, VNV{
        float resultado = 0;
        try{
            resultado = valorA * valorB;
            if (resultado < -999 || resultado > 1000){
                throw new EX();
            }
        }catch(EX ex){
            System.out.println(ex);
            Calculadora.calculadora();
        }
        System.out.println("El resultado es: " + resultado);
    }
    
    public static void Dividir(float valorA, float valorB) throws EX, VNV{
        float resultado = 0;
        try{
            if (valorB == 0){
                throw new ArithmeticException();
            }
            resultado = valorA / valorB;
            if (resultado < -999 || resultado > 1000){
                throw new EX();
            }
        }catch(EX ex){
            System.out.println(ex);
            Calculadora.calculadora();
        }catch(ArithmeticException ae){
            System.out.println("No se puede generar una division entre cero, inrtroduzca nuevos datos por favor.");
        }
        System.out.println("El resultado es: " + resultado);
    }
    
    public static void Elevar(double valorA, double valorB) throws EX, VNV{
        double resultado = 0;
        try{
            resultado = pow(valorA,valorB);
            if (resultado < -999 || resultado > 1000){
                throw new EX();
            }
        }catch(EX ex){
            System.out.println(ex);
            Calculadora.calculadora();
        }
        System.out.println("El resultado es: " + resultado);
    }
    
    public static void Raiz(float valorA, float valorB) throws EX, VNV{
        double resultado = 0;
        try{
            if (valorA < 0 && (valorB/2 == 0)){
                throw new ArithmeticException();
            }
            resultado = pow(valorA,1/valorB);
            if (resultado < -999 || resultado > 1000){
                throw new EX();
            }
        }catch(EX ex){
            System.out.println(ex);
            Calculadora.calculadora();
        }catch(ArithmeticException ae){
            System.out.println("No existen raices pares negativas, ingrese datos de nuevo.");
        }
        System.out.println("El resultado es: " + resultado);
    }
}
