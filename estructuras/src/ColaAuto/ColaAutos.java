/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ColaAuto;

/**
 *
 * @author agaud
 */
public class ColaAutos <T> implements Machote
{
    T arr[] = null;
    int atras = -1;
    int frente = atras = -1;
    
    public ColaAutos(T arr[])
    {
        this.arr =arr;
    }

    public int getFrente()
    {
        return frente;
    }

    public void setFrente(int frente)
    {
        this.frente = frente;
    }
    
    public T[] getArr()
    {
        return arr;
    }

    public void setArr(T[] ab)
    {
        this.arr = ab;
    }

    public int getatras()
    {
        return atras;
    }

    public void setatras(int atras)
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
        return (atras == arr.length-1 && frente==0) || (atras +1 == frente);
    }

    @Override
    public boolean inserta(Object obj)
    {
        if(!llena())
        {
            if(atras==-1)
            {
                atras = frente = 0;
            }else
            {
                if(atras == arr.length-1)
                {
                    atras=0;
                }else
                {
                    atras++;
                }
            }
            arr[atras] = (T)obj;   return true;
        }else
        {
            System.out.println("Cola llena");   return false;
        }
    }

    @Override
    public Object elimina()
    {
        if(!vacia())
        {
            Object obj = arr[frente];
            if(frente == atras)
            {
                frente = atras = -1;
            }else
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
    
    public Object busca(String nom)
    {
        boolean b= true;
        Object r=null;
        int a=getatras();
        int i= getFrente();
        do
        {
            Object x= elimina();
            /*
            if(x.getNombre().equals(nom) && b)
            {
                r=x;
                b=false;
            }else
            {
                inserta(x);
            }
*/
        }while(i!=a);
        return r;
    }
    
}