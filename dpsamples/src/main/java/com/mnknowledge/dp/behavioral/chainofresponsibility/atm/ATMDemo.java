package com.mnknowledge.dp.behavioral.chainofresponsibility.atm;

public class ATMDemo {
    public static void main(String[] args) {

        BGNATM atm = new BGNATM();

        System.out.println("\n ----------------Requested Amount 475-----------------------\n");

        atm.withdraw(475);

        System.out.println("\n ----------------Requested Amount 455-----------------------\n");

        atm.withdraw(455);

        System.out.println("\n ----------------Requested Amount 520-----------------------\n");

        atm.withdraw(520);

        System.out.println("\n ----------------Requested Amount 510-----------------------\n");

        atm.withdraw(510);
    }
}
