/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LIPIM
 */
public class PilaDinamica implements Machote
{
    private Nodo tope = null;

    @Override
    public boolean vacia()
    {
        return tope == null;
    }

    @Override
    public boolean llena()
    {
        return false;
    }

    @Override
    public boolean inserta(Object obj)
    {
        Nodo d = (Nodo) obj;
        if (d==null)
        {
            System.out.println("Pila llena o no se puede insertar el objeto");
            return false;
        }else
        {
            d.setSig(tope);
            tope = d;
            return true;
        }
    }

    @Override
    public Object elimina()
    {
        if (vacia())
        {
            System.out.println("Pila vacia");
            return null;
        }else
        {
            Nodo obj = tope;
            tope = tope.getSig();
            obj.setSig(null);
            return obj;
        }
    }

    /**
     * @return the tope
     */
    public Nodo getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(Nodo tope)
    {
        this.tope = tope;
    }
    
}
