package br.com.fiapride.model;

public class Celular {

    private String cor;
    private int armazenamento;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {

        if (armazenamento < 0) {
            System.out.println("Erro: armazenamento não pode ser negativo.");
        } else {
            this.armazenamento = armazenamento;
        }
    }
}