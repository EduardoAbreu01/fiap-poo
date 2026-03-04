package br.com.fiapride.model;

import java.util.Scanner;

public class Camera {
    public int resolucao;
    public int capacidade;
    public String conectividade;


    public Camera(int resolucao,int capacidade, String conectividade){

        this.resolucao = resolucao;
        this.capacidade = capacidade;
        this.conectividade = conectividade;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "resolucao=" + resolucao +
                ", capacidade=" + capacidade +
                ", conectividade='" + conectividade + '\'' +
                '}';
    }
}
