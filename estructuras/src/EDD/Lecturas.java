/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author PC
 */
public class Lecturas
{

    public static InputStreamReader isr = new InputStreamReader(System.in);
    public static BufferedReader br = new BufferedReader(isr);

    public static int leerEntero()
    {
        do
        {
            try
            {
                return Integer.parseInt(br.readLine());
            } catch (Exception ex)
            {
                System.out.println("Dato incorrecto \nIntenta de nuevo");
            }
        } while (true);
    }
    public static String leerCadena()
    {
        do
        {
            try
            {
                return br.readLine();
            } catch (Exception ex)
            {
                System.out.println("Dato incorrecto \nIntenta de nuevo");
            }
        } while (true);
    }
}
