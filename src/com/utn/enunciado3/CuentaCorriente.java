package com.utn.enunciado3;


import java.util.UUID;

public class CuentaCorriente {
    private static String id;
    private double balance;
    private ClienteV2 client;
    private double[] historyDep = new double[10];
    private double[] historyWithd = new double[10];
    private static int counterDep = 0;
    private static int counterWithd = 0;

    public static final double MAX = -2000;             //Constant so you can change the limit in only one place

    public CuentaCorriente(ClienteV2 client, double balance) {
        this.id = UUID.randomUUID().toString().replace("-", "").substring(0, 5);
        this.client = client;
        this.balance = balance;
    }

    public void deposit(double toDepo) {
        System.out.println("\n.....Deposito Exitoso.");
        balance += toDepo;
        historyDep[counterDep] = toDepo;
        ++counterDep;
    }

    public void withdraw(double toWithd) {
        if (balance < toWithd) {
            System.out.println("\n......Saldo Insuficiente.");
        } else {
            System.out.println("\n.....Extracion Exitosa.");
            balance -= toWithd;
            historyWithd[counterWithd] = toWithd;
            ++counterWithd;
        }
    }

    public void withdrawV2(double toWithd) {
        if ((balance <= MAX) || (MAX > (balance - toWithd))) {  ///if the current balance is less than the MAX limit OR
            // the difference between the balance and the amount to
            // withdraw is less than the MAX limit
            System.out.println("\n......Saldo Insuficiente.");
        } else {
            System.out.println("\n.....Extracion Exitosa.");
            balance -= toWithd;
            historyWithd[counterWithd] = toWithd;
            ++counterWithd;
        }
    }

    public void printCtaCte() {
        System.out.println("\nCUENTA CORRIENTE:");
        System.out.println("id = " + id);
        System.out.println("client = " + client.getName());
        System.out.println("balance = $" + balance);
    }

    public void printMoves() {
        System.out.println("\nCUENTA CORRIENTE:");
        System.out.println("ID = " + id);
        for (int i = 0; i < counterDep; i++) System.out.println(client.getName() + ", deposito: $" + historyDep[i]);
        for (int i = 0; i < counterWithd; i++) System.out.println(client.getName() + ", retiro: $" + historyWithd[i]);
        System.out.println("Balance = $" + balance);
    }
}

