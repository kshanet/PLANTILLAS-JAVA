/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaAuto;

/**
 *
 * @author usuario
 */
public class prb
{
    public static void main(String[] args)
    {
        Libros objL[]= new Libros[4];
        Libros objLA[]= new Libros[4];
        //Pila <Libros> obj = new Pila <Libros>();
        ColaAutos <Libros> obj = new ColaAutos <Libros>(objL);
        ColaAutos <Libros> objA = new ColaAutos <Libros>(objLA);
        obj.inserta(new Libros("Limon", "comida", "ojo"));
        obj.inserta(new Libros("Pi", "a", "b"));
        obj.inserta(new Libros("Dino", "c", "d"));
        obj.inserta(new Libros("a", "b", "c"));
        
        String n= "Pi";
        //obj.busca(n);
        /*
        for (int i = 0; i < obj.getArr().length; i++)
        {
            System.out.println(i);
            if(n.equals(objL[i].getNombre()))
            {
                System.out.println("Si");
                obj.elimina();
            }else
            {
                System.out.println("No");
                objA.inserta(obj.elimina());
                obj.inserta(objA.elimina());
            }
        }
        obj.inserta(new Libros("ay", "by", "cy"));       
        */
    }
}
