package com.utn.enunciado2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Factura {
    static private String id;
    private double total;
    private String date;
    private Cliente customer;

    public Factura (double total,Cliente customer){
        setId();
        this.total=total;
        this.customer=customer;
        setDate();
    }

    public static void setId() {
        Factura.id = UUID.randomUUID().toString().replace("-", "").substring(0, 5);///genero un UUID random, lo paso a string, reemplazo los simbolos - y limito la cadena a 9 caracteres
    }

    public static String getId() {
        return id;
    }

    static public String Fecha() {
        LocalDate localDate = LocalDate.now(); //Captura la fecha actual
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd LLLL yyyy"); // Le da formato de 28 MAY 2020
        return localDate.format(formato); //Devuelvo un string con la fecha
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date = Fecha();
    }

    public double montoDesc (){
        return (total-(customer.getDescuento()*total));
    }

    public void printFactura (){
        System.out.println("Factura[id="+id+", fecha="+date+", monto=$"+total+", montoDesc=$"+montoDesc()+", Cliente[id="+customer.getId()+", nombre="+customer.getNombre()+",\n" +
                "email="+customer.getEmail()+", descuento="+customer.getDescuento()+"]]");
    }

    public void printCompra (){
        System.out.println("Monto total de la Factura = $"+total);
        System.out.println("\nMonto Total con descuento aplicado = $"+montoDesc());
    }
}
