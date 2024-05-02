package br.com.viniciushfc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Chosen One", "123.123.123-10");
        Cliente cliente2 = new Cliente("Chosen Two", "123.123.123-11");

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(100);
        Conta cc2 = new ContaCorrente(cliente2);
        cc.depositar(100);

        cc.transferir(100, cc2);

        System.out.println("------------------------------------");
        cc.imprimirInfo();
        System.out.println("------------------------------------");
        cc2.imprimirInfo();
        System.out.println("------------------------------------");

    }
}