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
public class Cola <T> implements Machote
{
    private T arr[] = null;
    private int atras = -1;

    public Cola(T arr[])
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

    @Override
    public boolean vacia()
    {
        return atras == -1;
    }

    @Override
    public boolean llena()
    {
        return atras == arr.length-1;
    }

    @Override
    public boolean inserta(Object obj)
    {
        if (!llena())
        {
            arr[++atras] = (T) obj;
            return true;
        }else
        {
            System.out.println("Cola llena");
            return false;
        }
    }

    @Override
    public Object elimina()
    {
        if (!vacia())
        {
            Object obj = arr[0];
            for (int i = 0; i < atras; i++)
            {
                arr[i] = arr[i+1];
            }
            atras--;
            return obj;
        }else
        {
            System.out.println("Cola vacia");
            return null;
        }
    }
}
