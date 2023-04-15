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
public class ColaCircular <T> implements Machote
{
    private T arr[] = null;
    private int atras = -1;
    private int frente = -1;

    public ColaCircular(T arr[])
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
        return (atras == arr.length-1 && frente == 0) || (atras + 1 == frente);
    }

    @Override
    public boolean inserta(Object obj)
    {
        if (!llena())
        {
            if (atras == -1)
            {
                atras =  frente = 0;
            }else
            {
                if (atras == arr.length -1)
                {
                    atras = 0;
                } else
                {
                    atras++;
                }
            }
            arr[atras] = (T) obj;
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
            Object obj = arr[frente];
            if (frente == atras)
            {
                frente = atras = -1;
            } else
            {
                if(frente == arr.length-1)
                {
                    frente = 0;
                }else
                {
                    frente++;
                }
            }
            return obj;
        }else
        {
            System.out.println("Cola vacia");
            return null;
        }
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
}
