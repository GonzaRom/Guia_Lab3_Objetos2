package com.utn.enunciado2;

import java.util.UUID;

public class ItemVenta {
    private static String id;
    private String nombre;
    private String descripcion;
    private double precio;

    public ItemVenta(String name, String desc, double cost) {
        setId();
        nombre = name;
        descripcion = desc;
        precio = cost;
    }

    public static void setId() {
        ItemVenta.id = UUID.randomUUID().toString().replace("-", "").substring(0, 5);
        //Get a random UUID , transform it to String, reduce it to 5 character long and replace the " - " symbol in order to get a clean alphanumeric ID
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void printItemVenta() {
        System.out.println("\nITEM..............................");
        System.out.println("Id          = " + id);
        System.out.println("Nombre      = " + nombre);
        System.out.println("Descripcion = " + descripcion);
        System.out.println("Precio      = $" + precio);
    }

}


