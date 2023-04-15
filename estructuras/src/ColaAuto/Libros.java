/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColaAuto;

/**
 *
 * @author LS
 */
public class Libros
{
    String nombre;
    String autor;
    String editorial;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getEditorial()
    {
        return editorial;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }

    public Libros(String nombre, String autor, String editorial)
    {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }
    
}
