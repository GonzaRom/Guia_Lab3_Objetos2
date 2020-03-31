package com.utn.enunciado2;

import java.util.UUID;

public class Cliente {
    private static String id;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente(String nombre, String email, double desc) {
        this.nombre = nombre;
        this.email = email;
        descuento = desc;
        setId();
    }

    //Exercise 2 - a
    //Implementation of UUID Class for a random user ID
    public static void setId() {
        Cliente.id = UUID.randomUUID().toString().replace("-", "").substring(0, 5);
        //Get a random UUID , transform it to String, reduce it to 5 character long and replace the " - " symbol in order to get a clean alphanumeric ID

    }

    public static String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getEmail() {
        return email;
    }

    public void printClient() {
        System.out.println("Cliente[id=" + id + ", nombre=" + nombre + ", email=" + email + ", descuento=%" + descuento + "]");
    }
}
