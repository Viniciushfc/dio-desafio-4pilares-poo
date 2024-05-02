package br.com.viniciushfc;

public interface ContaImpl {

    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
