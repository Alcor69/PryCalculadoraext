/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prycalculadoraext;

import java.util.Scanner;

/**
 *
 * @author rb940
 */

public class PryCalculadoraext {
    
    //metodo suma
    public static int suma(int valor1, int valor2){
       int resultado = valor1 + valor2;
       return resultado;
    }
    
    //metodo resta
    public static int resta(int numero1, int numero2){
       int result = numero1 - numero2;
       return result;
    }
    
    //metodo divicion
    public static double divicion(double numerouno, double numerodos){
       double respuesta = numerouno / numerodos;
       return respuesta;
    }
    
    //metodo multiplicacion
    public static int multiplicacion(int valoruno, int valordos){
       int producto = valoruno * valordos;
       return producto;
    }
    public static void main(String[] args) {
       
       
        
        Scanner scanner= new Scanner (System.in);
       
        //Suma
       System.out.println("ingrese un numero para la suma:" );
       int valor1=scanner.nextInt();   
       System.out.println("ingrese otro numero:" );
       int valor2=scanner.nextInt();
       
       int resultado = valor1 +valor2;
       
       System.err.println("el valor de la suma es: " + resultado);
       
      
      //Resta 
       System.out.println("ingrese un numero para la resta:" );
       int numero1=scanner.nextInt();
       System.out.println("ingrese otro numero:" );
       int numero2=scanner.nextInt();
       
       int result = numero1 - numero2;
       
       System.err.println("el valor de la resta es: " + result);
       
       
       //Divicion
       System.out.println("Ingrese un numero para la divicion: ");
       double numerouno = scanner.nextDouble();
       System.out.println("Ingrese otro numero: ");
       double numerodos = scanner.nextDouble();
       
       double respuesta = numerouno/numerodos;
       
       System.out.println("La respuesta de la divicion es: "+ respuesta);
       
       
       //Multiplicacion
       
      System.out.println("Ingrese un numero para la multiplicacion: ");
      int valoruno=scanner.nextInt();
      System.out.println("Ingrese otro numero: ");
      int  valordos=scanner.nextInt();
      
      int producto = valoruno * valordos;
      
      System.out.println("La respuesta de la multiplicacion es: "+ producto);
    }
}
