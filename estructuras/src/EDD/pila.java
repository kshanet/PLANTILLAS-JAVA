/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 *
 * @author LS
 */
public class pila<t>implements machote
{
t arr[]= null;
int tope=-1;

pila(t arr[]){
    this.arr=arr;
}

    public t[] getArr()
    {
        return arr;
    }

    public int getTope()
    {
        return tope;
    }

    public void setArr(t[] arr)
    {
        this.arr = arr;
    }

    public void setTope(int tope)
    {
        this.tope = tope;
    }

    public pila()
    {
    }

    @Override
    public String toString()
    {
        return "pila{" + "arr=" + arr + ", tope=" + tope + '}';
    }

    public boolean vacia()
    {
        return tope==-1;
        }

    @Override
    public boolean llena()
    {
    return tope== arr.length-1;
    }

    @Override
    public boolean inserta(Object obj)
    {
        if(!llena()) 
        {
             arr[++tope]=(t)obj; return true;
        }else{
            System.out.println("pila llena");
        }
    return false;
     }

    @Override
    public Object elimina()
    {
    if(!vacia()){
        return arr[tope--];
    }else{
        System.out.println("pila vacia");  
    }    
    return null;
    }
    
    
    

}
