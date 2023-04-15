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
public class ListaDLC
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
            r.setAnt(n);
            return true;
        }
        if (r.getEt().compareTo(n.getEt()) > 0 || r.getAnt().getEt().compareTo(n.getEt()) < 0)
        {
            n.setSig(r);
            n.setAnt(r.getAnt());
            r.getAnt().setSig(n);
            r.setAnt(n);
            r= r.getEt().compareTo(n.getEt()) > 0? n: r;
            return true;
        }
        NodoListas a = r;
        while (true)
        {
            if (a.getSig().getEt().compareTo(n.getEt()) > 0)
            {
                n.setSig(a.getSig());
                n.setAnt(a);
                a.getSig().setAnt(n);
                a.setSig(n);
                return true;
            }
            a = a.getSig();
        }
    }
    
    public NodoListas elimina(String s)
    {
        if (r == null)
        {
            System.out.println("Lista vacia");
            return null;
        }
        if (r.getAnt().getEt().compareTo(s) < 0 || r.getEt().compareTo(s) > 0)
        {
            System.out.println("Dato no encontrado");
            return null;
        }
        NodoListas n = null;
        if (r.getEt().equals(s))
        {
            n = r;
            r = n.getSig();
            r.setAnt(n.getAnt());
            r.getAnt().setSig(r);
            n.setSig(null);
            n.setAnt(null);
            if (n == r)
            {
                r = null;
            }
            return n;
        }
        NodoListas aux = r;
        while (aux != r.getAnt())
        {
            if (aux.getSig().getEt().equals(s))
            {
                n = aux.getSig();
                aux.setSig(n.getSig());
                n.getSig().setAnt(aux);
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
        NodoListas aux =r.getAnt();
        do
        {
            s += aux.getEt() + "\n";
            aux = aux.getAnt();
        } while (aux != r.getAnt());
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
