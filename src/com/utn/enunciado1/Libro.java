package com.utn.enunciado1;

import java.security.PublicKey;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor escritor;


    public String getTitulo(){return titulo;}
    public double getPrecio(){return precio;}
    public int getStock(){return stock;}

    public Libro (String t,double prec, int cant, Autor autor){
        titulo=t;
        precio=prec;
        stock=cant;
        escritor=autor;
    }

    public void setTitulo (String titulo){this.titulo=titulo;}

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void showBook(){
        System.out.println("LIBRO....................");
        System.out.println("Titulo   = " + titulo);
        System.out.println("Precio   = " + precio);
        System.out.println("Stock    = " + stock);
        System.out.println("Escritor = " + escritor.getNombre()+" "+escritor.getApellido());
    }

    public void showAutor(){
        System.out.println("....."+titulo.toUpperCase()+"......");
        escritor.printAutor();
    }

    public void costBook(){
        String writer=escritor.getNombre();
        System.out.println("El libro, "+titulo+" de "+writer+". Se vende a $"+precio+" pesos.");
    }



}
