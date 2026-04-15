package br.com.fiapride.model;

public class Celular extends Audiovisual{
    private String sistemaOperacional;

    public Celular(int capacidade, int resolucao,String sistemaOperacional) {
        super(capacidade, resolucao);
        this.sistemaOperacional = sistemaOperacional;
    }

}