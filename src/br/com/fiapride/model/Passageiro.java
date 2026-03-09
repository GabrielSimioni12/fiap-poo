package br.com.fiapride.model;

public class Passageiro {

    public String nome;
    public double saldo;

    
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido para adicionar saldo.");
        }
    }

    
    public void pagarCorrida(double valorCorrida) {
        if (valorCorrida <= saldo) {
            saldo = saldo - valorCorrida;
            System.out.println("Corrida paga com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para pagar a corrida.");
        }
    }
}