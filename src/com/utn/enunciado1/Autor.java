package com.utn.enunciado1;

public class Autor {

    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor (String nombre, String apellido, String email, char genero){
        this.apellido=apellido;
        this.nombre=nombre;
        this.genero=genero;
        this.email=email;
    }

    public String getNombre (){
        return nombre;
    }
    public String getApellido(){return apellido;}

    public void printAutor (){
        System.out.println("AUTOR....................");
        System.out.println("Nombre   = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Email    = " + email);
        System.out.println("Genero   = " + genero);
    }
}
