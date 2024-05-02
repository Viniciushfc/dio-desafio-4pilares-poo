package br.com.viniciushfc.entidades;

import br.com.viniciushfc.UseCases.ContaImpl;

public abstract class Conta implements ContaImpl {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public  Conta(Cliente cliente){
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfo(){
        System.out.println(String.format("Nome do Cliente %s", this.getCliente().getNome()));
        System.out.println(String.format("Agencia %d", this.getAgencia()));
        System.out.println(String.format("Número %d", this.getNumero()));
        System.out.println(String.format("Saldo %.2f", this.getSaldo()));
    }
}
