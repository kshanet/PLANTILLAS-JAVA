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
public class ListaCircular
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
            r.setSig(n);
            return true;
        }
        if (r.getSig().getEt().compareTo(n.getEt()) > 0 || r.getEt().compareTo(n.getEt()) < 0)
        {
            n.setSig(r.getSig());
            r.setSig(n);
            r = r.getEt().compareTo(n.getEt()) < 0 ? n : r;
            return true;
        }
        NodoListas aux = r.getSig();
        while (true)
        {
            if (aux.getSig().getEt().compareTo(n.getEt()) > 0)
            {
                n.setSig(aux.getSig());
                aux.setSig(n);
                return true;
            }
            aux = aux.getSig();
        }
    }

    public NodoListas elimina(String s)
    {
        if (r == null)
        {
            System.out.println("Lista vacia");
            return null;
        }
        if (r.getSig().getEt().compareTo(s) > 0 || r.getEt().compareTo(s) < 0)
        {
            System.out.println("Dato no encontradio");
            return null;
        }
        NodoListas n = null;
        if (r.getSig().getEt().equals(s))
        {
            n = r.getSig();
            r.setSig(n.getSig());
            n.setSig(null);
            if (n == r)
            {
                r = null;
            }
            return n;
        }
        NodoListas aux = r.getSig();
        while (aux != r)
        {
            if (aux.getSig().getEt().equals(s))
            {
                n = aux.getSig();
                aux.setSig(n.getSig());
                if (n == r)
                {
                    r = aux;
                }
                n.setSig(null);
                return n;
            }
            if (aux.getSig().getEt().compareTo(s) > 0)
            {
                return null;
            }
            aux = aux.getSig();
        }
        return n;
    }

    public String desp()
    {
        String s = "";
        if (r == null)
        {
            NodoListas aux = r.getSig();
            do
            {
                s += aux.getEt() + "\n";
                aux = aux.getSig();
            } while (aux != r.getSig());
        }
        return s;
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
