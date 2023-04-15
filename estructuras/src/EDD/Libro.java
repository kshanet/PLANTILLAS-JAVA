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
public class Libro
{
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(String autor, String titulo, String editorial)
    {
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Libro()
    {
    }

    @Override
    public String toString()
    {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", editorial=" + editorial + '}';
    }

    /**
     * @return the autor
     */
    public String getAutor()
    {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    /**
     * @return the titulo
     */
    public String getTitulo()
    {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    /**
     * @return the editorial
     */
    public String getEditorial()
    {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }
}
