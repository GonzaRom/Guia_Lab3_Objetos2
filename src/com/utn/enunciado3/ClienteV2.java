package com.utn.enunciado3;

import java.util.UUID;

public class ClienteV2 {
    private static String id;
    private String name;
    private char gender;

    public ClienteV2(String name, char gender) {
        this.gender = gender;
        this.name = name;
        setId();
    }

    public static void setId() {
        ClienteV2.id = UUID.randomUUID().toString().substring(0, 6).replace("-", "");
    }


    public static String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printClienteV2() {
        System.out.println("CLIENTE........");
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
    }
}
