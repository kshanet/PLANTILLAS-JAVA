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
public class Pilas <T> implements Machote
{
    private T arr[] = null;
    private int tope = -1;

    public Pilas(T arr[])
    {
        this.arr = arr;
    }

    /**
     * @return the arr
     */
    public T[] getArr()
    {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(T[] arr)
    {
        this.arr = arr;
    }

    /**
     * @return the tope
     */
    public int getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(int tope)
    {
        this.tope = tope;
    }

    @Override
    public boolean vacia()
    {
        return tope == -1;
    }

    @Override
    public boolean llena()
    {
        return tope == arr.length-1;
    }

    @Override
    public boolean inserta(Object obj)
    {
        if (!llena())
        {
            arr[++tope] = (T) obj;
            return true;
        }else
        {
            System.out.println("Pila llena");
            return false;
        }
    }

    @Override
    public Object elimina()
    {
        if (!vacia())
        {
            return arr[tope--];
        }else
        {
            System.out.println("Pila vacia");
            return null;
        }
    }
}
