/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LIPYM
 */
public class Lista
{

    private NodoListas r = null;

    public boolean inserta(Object obj)
    {
        NodoListas n = (NodoListas) obj;
        if (n == null)
        {
            System.out.println("Lista llena o no se puede insertar el objeto");
            return false;
        }
        if (r == null)
        {
            r = n;
            return true;
        }
        if (r.getEt().compareTo(n.getEt()) > 0)
        {
            n.setSig(r);
            r = n;
            return true;
        }
        NodoListas aux = r;
        while (aux.getSig() != null)
        {
            if (aux.getSig().getEt().compareTo(n.getEt()) > 0)
            {
                n.setSig(aux.getSig());
                aux.setSig(n);
                return true;
            }
            aux = aux.getSig();
        }
        aux.setSig(n);
        return true;
    }

    public NodoListas elimina(String s)
    {
        if (r == null)
        {
            System.out.println("Lista vacia");
            return null;
        }
        NodoListas n = null;
        if (r.getEt().equals(s))
        {
            n = r;
            r = r.getSig();
            return n;
        }
        NodoListas aux = r;
        while (aux.getSig() != null)
        {
            if (aux.getSig().getEt().equals(s))
            {
                n = aux.getSig();
                aux.setSig(n.getSig());
                n.setSig(null);
                return n;
            }
            aux = aux.getSig();
        }
        return n;
    }
    
    

    /**
     * @return the r
     */
    public NodoListas getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoListas r)
    {
        this.r = r;
    }

}
