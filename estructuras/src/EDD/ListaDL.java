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
public class ListaDL
{

    private NodoListas r;

    public boolean inserta(NodoListas n)
    {
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
            r.setAnt(n);
            r = n;
            return true;
        }
        NodoListas aux = r;
        while (aux.getSig() != null)
        {
            if (aux.getSig().getEt().compareTo(n.getEt()) > 0)
            {
                n.setSig(aux.getSig());
                aux.getSig().setAnt(n);
                n.setAnt(aux);
                aux.setSig(n);
                return true;
            }
            aux = aux.getSig();
        }
        aux.setSig(n);
        n.setAnt(aux);
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
            if (r != null)
            {
                r.setAnt(null);
            }
            return n;
        }
        NodoListas aux = r;
        while (aux.getSig() != null)
        {
            if (aux.getSig().getEt().equals(s))
            {
                n = aux.getSig();
                aux.setSig(n.getSig());
                if (n.getSig() != null)
                {
                    n.getSig().setAnt(aux);
                }
                n.setSig(null);
                n.setAnt(null);
                return n;
            }
            aux = aux.getSig();
        }
        return n;
    }

    public String desp(NodoListas n)
    {
        return (n != null ? n.getEt() + "\n" + desp(n.getSig()) : "");
    }

    private String despA2(NodoListas n)
    {
        return (n != null ? n.getEt() + "\n" + despA2(n.getAnt()) : "");
    }
    
    public String despA(NodoListas n)
    {
        if(n != null)
        {
            return (n.getSig() != null? despA(n.getSig()): despA2(n));
        }
        return "";
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
