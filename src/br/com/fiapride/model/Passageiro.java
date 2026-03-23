package br.com.fiapride.model;

public class Veiculo {

    private String proprietario;
    private String placa;
    private double combustivel;

    // Construtor
    public Veiculo(String proprietario, String placa) {
        this.proprietario = proprietario;
        this.placa = placa;
        this.combustivel = 0;
    }

    // Getter
    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCombustivel() {
        return combustivel;
    }

    // Setter com validação
    public void setCombustivel(double combustivel) {
        if (combustivel >= 0) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Valor de combustível inválido.");
        }
    }

    // Método para abastecer
    public void adicionarCombustivel(double valor) {
        if (valor > 0) {
            combustivel += valor;
        } else {
            System.out.println("Valor inválido para abastecimento.");
        }
    }

    // Método para gastar combustível
    public void gastarCombustivel(double valor) {
        if (valor <= combustivel) {
            combustivel -= valor;
        } else {
            System.out.println("Combustível insuficiente.");
        }
    }
}