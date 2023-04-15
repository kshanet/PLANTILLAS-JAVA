
package EDD;

import java.util.Scanner;

/**
 *@author dell
 */
public class ColaPrioridad {

    public static void main(String[] args) {

    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1: Inserta");
        System.out.println("2: Elimina");
        System.out.println("3:muestra");
        System.out.println("4:salir");
        String var = teclado.nextLine();

        switch (var) {
            case "1":
                Auto a = new Auto();
                System.out.println("ingrese Marca");
                a.Marca = teclado.nextLine();
                System.out.println("Ingrese matricula");
                a.Matricula = teclado.nextLine();
                System.out.println("ingrese año");
                a.Year = Integer.parseInt(teclado.nextLine());
                System.out.println("Ingrese Prioridad");
                a.prioridad = Integer.parseInt(teclado.nextLine());
                Prioridad p = new Prioridad();
                p.inserta(a);
                System.out.println("Dato insertado");
                break;
            default:
                System.out.println("Opcion NO valida");
                menu();
        }
    }
}
