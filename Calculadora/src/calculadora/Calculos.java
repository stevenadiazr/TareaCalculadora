/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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
    
    public static float Multiplicar(float valorA, float valorB) throws EX, VNV{
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
            resultado = valorA / valorB;
            if (resultado < -999 || resultado > 1000){
                throw new EX();
            }
        }catch(EX ex){
            System.out.println(ex);
            Calculadora.calculadora();
        }
        System.out.println("El resultado es: " + resultado);
    }
}
