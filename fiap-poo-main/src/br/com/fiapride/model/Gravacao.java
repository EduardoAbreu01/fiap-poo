package br.com.fiapride.model;

public class Gravacao {
    private String titulo;
    private double tamanho;
    private String data;
    private Camera camera;

    public Gravacao(String titulo, String data, double tamanho,Camera camera) {
        this.titulo = titulo;
        this.camera = camera;
        this.data = data;
        this.tamanho = tamanho;

        System.out.println("Gravação realizada \nTitulo: " + titulo );
    }

    public void exibeResumo(){
        System.out.println("---RESUMO DA GRAVAÇÂO---");
        System.out.println("Titulo: " + this.titulo + "\n" + "Data: " + this.data);
        System.out.println("Tamanho: " + this.tamanho + "\n"
                + "Resolução: " + this.camera.getResolucao() +"\n"
                + "Método de Salvamento: " + this.camera.getConectividade());


    }

}
