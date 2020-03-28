package com.utn;

import com.utn.enunciado1.Autor;
import com.utn.enunciado1.Libro;
import com.utn.enunciado2.Cliente;
import com.utn.enunciado2.Factura;

public class Main {

    public static void main(String[] args) {

        Autor joshuaB=new Autor("Joshua","Blosh","joshua@email.com",'M');
        Libro book=new Libro("Effective Java",450,150,joshuaB);

        joshuaB.printAutor();
        book.showBook();

        System.out.println("\nModifique el precio del libro “Effective Java” a 500 pesos y aumente la\n" +
                "cantidad en 50 copias.");
        book.setPrecio(500.00);
        book.setStock(50);
        book.showBook();
        System.out.println();
        book.showAutor();
        System.out.println();
        book.costBook();


        /////****ENUNCIADO 2
        System.out.println("\n");
        Cliente gonzalo= new Cliente("Gonzalo","rom.gonzalo88@gmail.com",0.25);
        Factura compra1= new Factura(1000,gonzalo);
        compra1.printFactura();
        compra1.printCompra();
    }
}
