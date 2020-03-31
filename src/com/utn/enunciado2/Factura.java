package com.utn.enunciado2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Factura {
    static private String id;
    private double total;
    private String date;
    private Cliente customer;
    private ItemVenta[] items = new ItemVenta[10]; // 10 will be the maximum quantity of items you can buy
    private static int counter; //this static counter will be count the amount of items bought

    public Factura(double total, Cliente customer) {
        setId();
        this.total = total;
        this.customer = customer;
        setDate();
        counter = 0; //starting the counter in zero
    }

    //Exercise 2 - e
    //Add a new class "ItemVenta" with the information of a item. This constructor build a Factura with the given Item.
    public Factura(ItemVenta item, int quantity, Cliente customer) {
        setId();
        total = (item.getPrecio() * quantity);
        this.customer = customer;
        setDate();
        items[0] = item;
        counter = 0; //starting the counter in zero
    }

    public Factura(Cliente customer) {
        total = 0;
        setId();
        this.customer = customer;
        setDate();
        counter = 0; //starting the counter in zero
    }


    //Exercise 2 - a
    //Implementation of a UUID Class for random user ID
    public static void setId() {
        Factura.id = UUID.randomUUID().toString().replace("-", "").substring(0, 5);///genero un UUID random, lo paso a string, reemplazo los simbolos - y limito la cadena a 9 caracteres
        //Get a random UUID , transform it to String, reduce it to 5 character long and replace the " - " symbol in order to get a clean alphanumeric ID
    }

    public static String getId() {
        return id;
    }

    //Exercise 2 - a
    //Implementation of LocalDate class to get a set the local time
    static public String Fecha() {
        LocalDate localDate = LocalDate.now(); //Catch local time
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd LLLL yyyy"); // Setting the format like: DAY MONTH YEAR
        return localDate.format(formato); //Return the new string with the correct format and date
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        this.date = Fecha();
    }

    public double montoDesc() {
        return (total - (customer.getDescuento() * total));
    }

    public void printFactura() {
        System.out.println("\nFactura[id=" + id + ", fecha=" + date + ", monto=$" + total + ", montoDesc=$" + montoDesc() + ", Cliente[id=" + Cliente.getId() + ", nombre=" + customer.getNombre() + ",\n" +
                "email=" + customer.getEmail() + ", descuento=" + customer.getDescuento() + "]]");
    }

    public void printCompra() {
        System.out.println("\nMonto total de la Factura = $" + total);
        System.out.println("Monto Total con descuento aplicado = $" + montoDesc());
    }

    public void printCompraV2() {
        System.out.println(getDate());
        System.out.println("ITEM\t\tPRECIO");
        for (int i = 0; i < counter; i++) {
            System.out.println(items[i].getNombre() + "\t\t" + items[i].getPrecio());
        }
        System.out.println("\nTotal........= $" + total);
        System.out.println("Descuento....= $" + (customer.getDescuento() * total));
        System.out.println("Total a Pagar= $" + montoDesc());
    }

    public void buy(ItemVenta item, int quantity) {
        total += (item.getPrecio() * quantity);
        items[counter] = item; //placing the bought item in the array
        ++counter; //Increasing the counter by one
    }
}
