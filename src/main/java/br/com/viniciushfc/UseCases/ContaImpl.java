package br.com.viniciushfc.UseCases;

import br.com.viniciushfc.entidades.Conta;

public interface ContaImpl {

    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
