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
public class ColaCD implements Machote
{
    private Nodo a = null;
    
    @Override
    public boolean vacia()
    {
        return a==null;
    }

    @Override
    public boolean llena()
    {
        return false;
    }

    @Override
    public boolean inserta(Object obj)
    {
        Nodo n = (Nodo) obj;
        if (n == null)
        {
            System.out.println("Cola llena o no se puede insertar el objeto");
            return false;
        }
        if (a == null)
        {
            a = n;
            a.setSig(n);
            return true;
        }
        n.setSig(a.getSig());
        a.setSig(n);
        a = n;
        return true;
    }

    @Override
    public Object elimina()
    {
        if (vacia())
        {
            System.out.println("Cola vacia");
            return null;
        }
        Nodo n = a.getSig();
        if (a == n)
        {
            a = null;
        } else
        {
            a.setSig(n.getSig());
        }
        n.setSig(null);
        return n;
    }

    /**
     * @return the a
     */
    public Nodo getA()
    {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(Nodo a)
    {
        this.a = a;
    }
    
}
