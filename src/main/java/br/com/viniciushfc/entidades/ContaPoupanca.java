package br.com.viniciushfc.entidades;

import br.com.viniciushfc.entidades.Cliente;
import br.com.viniciushfc.entidades.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
            System.out.println("Extrato Conta Poupança");
        super.imprimirInfo();
    }
}
