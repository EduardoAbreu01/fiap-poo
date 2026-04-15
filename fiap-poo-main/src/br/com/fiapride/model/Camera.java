package br.com.fiapride.model;

public class Camera extends Audiovisual{

    private String conectividade;

    public Camera(int capacidade, int resolucao,String conectividade) {
        super(capacidade, resolucao);
        this.conectividade = conectividade;
    }

}