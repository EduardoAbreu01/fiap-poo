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

    public void limparHd(){
        System.out.println("Limpando nuvem...");
        this.capacidade = 500;
        System.out.println("Capacidade Atual: " + this.capacidade);
    }

    public void comecarFilmagem() throws InterruptedException {
        System.out.println("Começando a filmagem...");

        while (this.capacidade > 0){
            System.out.println("Filmando... Capacidade atual: " + this.capacidade);
            Thread.sleep(10);
            this.capacidade -= 1;
        }
        System.out.println("Capacidade Atual: " + this.capacidade);

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
