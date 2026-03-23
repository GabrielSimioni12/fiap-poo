package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {

        System.out.println("--- Sistema FiapRide ---");

        Veiculo v1 = new Veiculo("Carlos", "ABC-1234");

        // Tentativa de valor inválido
        v1.setCombustivel(-10); // deve bloquear

        // Operações
        v1.adicionarCombustivel(50);
        v1.gastarCombustivel(100); // deve bloquear

        // Exibição final
        System.out.println("Dono: " + v1.getProprietario() +
                " | Placa: " + v1.getPlaca() +
                " | Combustível: " + v1.getCombustivel());


    }
}