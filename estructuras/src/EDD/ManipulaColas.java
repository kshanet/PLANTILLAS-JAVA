 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author PC
 */
public class ManipulaColas
{
    public static Cola prioridad(Cola c)
    {
        Auto arr[] = new Auto[c.getArr().length];
        Auto arr2[] = new Auto[c.getArr().length];
        Pilas<Auto> p1 = new Pilas<>(arr);
        Pilas<Auto> p2 = new Pilas<>(arr2);
        while (!c.vacia())
        {
            Auto cc =(Auto) c.elimina();
            while (!p1.vacia())
            {
                Auto ep = (Auto) p1.elimina();
                if (cc.getPlaca().charAt(0) <= ep.getPlaca().charAt(0))
                {
                    p1.inserta(ep);
                    break;
                }
                p2.inserta(ep);
            }
            p1.inserta(cc);
            while (!p2.vacia())
            {
                p1.inserta(p2.elimina());
            }
        }
        while (!p1.vacia())
        {
            c.inserta(p1.elimina());
        }
        return c;
    }
    
    public static ColaDinamica bicola(ColaDinamica cd)
    {
        PilaDinamica  p1 = new PilaDinamica();
        PilaDinamica  p2 = new PilaDinamica();
        while (!cd.vacia())
        {
            Nodo s = (Nodo) cd.elimina();
            if (((char)s.getObj())=='A' || ((char)s.getObj())=='E' || ((char)s.getObj()) == 'I' || ((char)s.getObj()) == 'O' || ((char)s.getObj())=='U')
            {
                p1.inserta(s);
                continue;
            }
            p2.inserta(s);
        }
        while (!p2.vacia())
        {
            cd.inserta((p1.vacia()?p2.elimina():p1.elimina()));
        }
        return cd;
    }
}
