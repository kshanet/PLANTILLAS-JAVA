/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd;

/**
 *
 * @author LS
 */
public class Bicola <T> 
{
    private T bc[] = null;
    private int atras;
    private int atras2;
    private int frente;
    private int frente2;

    public Bicola(T bc[])
    {
        this.bc = bc;
        atras = -1;
        atras2 = bc.length;
        frente = 0;
        frente2 = bc.length-1;
    }

    public Bicola()
    {
    }
    
    

    /**
     * @return the bc
     */
    public T[] getBc()
    {
        return bc;
    }

    /**
     * @param bc the bc to set
     */
    public void setBc(T[] bc)
    {
        this.bc = bc;
    }

    /**
     * @return the atras
     */
    public int getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(int atras)
    {
        this.atras = atras;
    }

    /**
     * @return the atras2
     */
    public int getAtras2()
    {
        return atras2;
    }

    /**
     * @param atras2 the atras2 to set
     */
    public void setAtras2(int atras2)
    {
        this.atras2 = atras2;
    }

    /**
     * @return the frente
     */
    public int getFrente()
    {
        return frente;
    }

    /**
     * @param frente the frente to set
     */
    public void setFrente(int frente)
    {
        this.frente = frente;
    }

    /**
     * @return the frente2
     */
    public int getFrente2()
    {
        return frente2;
    }

    /**
     * @param frente2 the frente2 to set
     */
    public void setFrente2(int frente2)
    {
        this.frente2 = frente2;
    }
    
    public int inserta(int a, int lim, T dato, int factor)
    {
        if (a + factor == lim)
        {
            System.out.println("Cola llena");
        } else
        {
            a += factor;
            bc[a] = dato; 
        }
        return a;
    }
    
    public Object [] eliminar (int a, int lim, int factor)
    {
        Object r[] = new Object[2];
        if (a == lim - factor)
        {
            System.out.println("Cola vacia");
            r[1] = null;
        } else
        {
            r[1] = bc[lim];
            for (int i = lim; i != a; i += factor)
            {
                bc[i] = bc[i + factor];
            }
            a -= factor;
        }
        r[0] = (Integer) a;
        return r;
    }
}
