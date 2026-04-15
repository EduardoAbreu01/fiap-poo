package br.com.fiapride.model;

public class Gravacao {
    private String titulo;
    private double tamanho;
    private String data;
    private Audiovisual audiovisual;

    public Gravacao(String titulo, String data, double tamanho, Audiovisual audiovisual) {
        this.titulo = titulo;
        this.audiovisual = audiovisual;
        this.data = data;
        this.tamanho = tamanho;

        System.out.println("Gravação realizada \nTitulo: " + titulo );
    }

    public void exibeResumo(){
        System.out.println("---RESUMO DA GRAVAÇÂO---");
        System.out.println("Titulo: " + this.titulo + "\n" + "Data: " + this.data);
        System.out.println("Tamanho: " + this.tamanho + "\n"
                + "Resolução: " + this.audiovisual.getResolucao());


    }

}
