package br.com.fiapride.
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro();
        passageiro1.setNome("Ana Silva");
        passageiro1.setSaldo(50.0);

        Passageiro passageiro2 = new Passageiro();
        passageiro2.setNome("Carlos Souza");
        passageiro2.setSaldo(12.50);

        System.out.println("--- Sistema FiapRide ---");

        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$" + passageiro1.getSaldo());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$" + passageiro2.getSaldo());

        System.out.println("\n--- Testando Métodos ---");

        passageiro1.pagarCorrida(20);
        passageiro2.pagarCorrida(20);

        passageiro2.adicionarSaldo(30);

        System.out.println("\n--- Saldo Final ---");

        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$" + passageiro1.getSaldo());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$" + passageiro2.getSaldo());
    }
}