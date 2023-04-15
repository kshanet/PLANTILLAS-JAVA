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
public class NodoListas <T>
{
    private T obj;
    private String et;
    private NodoListas sig;
    private NodoListas ant;

    public NodoListas(T obj, String et)
    {
        this.obj = obj;
        this.et = et;
        this.sig = null;
        this.ant = null;
    }

    public NodoListas()
    {
    }

    @Override
    public String toString()
    {
        return "Nodo{" + "et=" + et + '}';
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the et
     */
    public String getEt()
    {
        return et;
    }

    /**
     * @param et the et to set
     */
    public void setEt(String et)
    {
        this.et = et;
    }

    /**
     * @return the sig
     */
    public NodoListas getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoListas sig)
    {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
    public NodoListas getAnt()
    {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(NodoListas ant)
    {
        this.ant = ant;
    }
    
    
}
