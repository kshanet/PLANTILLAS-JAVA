/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LIPM
 */
public class ColaDinamica<T> implements Machote
{

    private Nodo f = null;
    private Nodo a = null;

    @Override
    public boolean vacia()
    {
        return f == null;
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
        if (f == null)
        {
            f = a = n;
            return true;
        }
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
        Nodo n = f;
        f = f.getSig();
        n.setSig(null);
        if (f == null)
        {
            a = null;
        }
        return n;

    }

    /**
     * @return the f
     */
    public Nodo getF()
    {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(Nodo f)
    {
        this.f = f;
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
