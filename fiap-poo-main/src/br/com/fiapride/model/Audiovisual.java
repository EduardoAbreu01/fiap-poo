package br.com.fiapride.model;

public class Audiovisual {
    private int resolucao;
    private int capacidade;


    public Audiovisual(int capacidade, int resolucao){
        this.setResolucao(resolucao);
        this.capacidade = capacidade;
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


    private void setResolucao(int resolucao) {
        if(resolucao >= 144){
            this.resolucao = resolucao;
        }else{
            System.out.println("Resolução Mínima Aceita de 144p!!!");
        }

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
                ", capacidade=" + capacidade
                ;
    }
}

