package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        System.out.println("--- Sistema FiapRide ---");

        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        System.out.println("\n--- Testando Métodos ---");

        passageiro1.pagarCorrida(20);
        passageiro2.pagarCorrida(20);

        passageiro2.adicionarSaldo(30);

        System.out.println("\n--- Saldo Final ---");

        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
    }
}