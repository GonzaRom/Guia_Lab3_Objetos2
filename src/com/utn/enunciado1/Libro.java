package com.utn.enunciado1;

import java.util.ArrayList;
import java.util.Iterator;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private ArrayList<Autor> escritor;


    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public Libro(String t, double prec, int cant, Autor autor) {
        titulo = t;
        precio = prec;
        stock = cant;
        escritor = new ArrayList<Autor>();
        escritor.add(autor);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEscritor(Autor escritor) {
        this.escritor.add(escritor);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void showBook() {
        System.out.println("\nLIBRO....................");
        System.out.println("Titulo   = " + titulo);
        System.out.println("Precio   = " + precio);
        System.out.println("Stock    = " + stock);
        System.out.println("Escritores = ");
        showAutorname();
    }

    public void showAutorname() {
        for (Autor dummy : escritor) { //for each element from the list "escritor" save it in a var. Autor type . until its empty.
            System.out.println(dummy.getNombre());  //get the name from the dummy var and print it.
        }
    }

    public void showAutorFull() {
        System.out.println("....." + titulo.toUpperCase() + "......");
        for (Autor dummy : escritor) {
            dummy.printAutor();
        }
    }

    public void costBook() {
        for (Autor dummy : escritor) {
            System.out.println("El libro, " + titulo + " de " + dummy.getNombre() + ". Se vende a $" + precio + " pesos.");
        }

    }


}
