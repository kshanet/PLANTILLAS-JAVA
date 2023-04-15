/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suma;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class s {

    public static int resultado ="";

    public static void main(String[] args) {
        menu();

    }

    public static void multiplicación() {
     
        String multiplicador = "";
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese cuantas veces sera multiplicado");
        multiplicador = lector.nextLine();
        int mlt = Integer.parseInt(multiplicador);//lo convierte a entero
        System.out.println("ingrese el numero a multiplicar \n");
        multiplicador = lector.nextLine();
        int lt = Integer.parseInt(multiplicador);
        for (int i = 0; i < mlt; i++) {
          
            resultado += lt;
          
        }
        System.out.println(" Resutado: \n" + resultado);

    }

    public static void división() {
        String multiplicador = "";
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el divisor");
        multiplicador = lector.nextLine();
        int slt = Integer.parseInt(multiplicador);//lo convierte a entero
        System.out.println("ingrese el dividendo \n");
        multiplicador = lector.nextLine();
        int dlt = Integer.parseInt(multiplicador);
        for (int i = 0; i < slt; i++) {
           
            resultado += dlt;
        }
        System.out.println(" Resutado: \n" + resultado);

         

    }

    
     public static  void cadena( int y,String tr, int i){
        String cad="";
        
        Scanner  leer= new Scanner(System.in);
        System.out.println(" ingrese las veces que desea repetir una cadena");
      