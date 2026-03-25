package br.com.fiapride.model;

import java.util.Scanner;

public class Camera {
    private int resolucao;
    private int capacidade;
    private String conectividade;


    public Camera(int capacidade, String conectividade,int resolucao){
        this.setResolucao(resolucao);
        this.capacidade = capacidade;
        this.setConectividade(conectividade);
    }

    public void limparHd(){
        System.out.println("Limpando nuvem...");
        setCapacidade(500);
        System.out.println("Capacidade Atual: " + getCapacidade());
    }

    public void comecarFilmagem() throws InterruptedException {
        System.out.println("Começando a filmagem...");

        while (this.capacidade > 0){
            System.out.println("Filmando... Capacidade atual: " + getCapacidade());
            Thread.sleep(10);
            this.capacidade -= 1;
        }
        System.out.println("Capacidade Atual: " + getCapacidade());
    }

    public int getResolucao() {
        return resolucao;
    }

    public void definirResolucao(int resolucao){
        setResolucao(resolucao);
    }

    public void setConectividade(String conectividade) {
        if(!conectividade.isEmpty()){
            this.conectividade = conectividade;
        }else{
            System.out.println("Insira a forma de conexão da Câmera!!!");
        }
    }

    private void setResolucao(int resolucao) {
        if(resolucao >= 144){
            this.resolucao = resolucao;
        }else{
            System.out.println("Resolução Mínima Aceita de 144p!!!");
        }

    }

    public String getConectividade() {
        return conectividade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    private void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Camera "+
                "resolucao=" + resolucao +
                ", capacidade=" + capacidade +
                ", conectividade='" + conectividade + '\''
                ;
    }
}
