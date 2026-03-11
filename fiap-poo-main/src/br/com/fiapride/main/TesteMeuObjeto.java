package br.com.fiapride.main;

import br.com.fiapride.model.Camera;

import java.util.Scanner;

public class TesteMeuObjeto {
    public static void main(String[] args) throws InterruptedException {

        Scanner leitura = new Scanner(System.in);

        Camera camera1 = new Camera(500,"Wifi");
        while (camera1.getResolucao() < 144){
            System.out.print("Digite a resolução da camêra: ");
            int resolucao = leitura.nextInt();
            leitura.nextLine();
            camera1.definirResolucao(resolucao);
        }
        camera1.comecarFilmagem();

        System.out.print("Deseja liberar espaço?(S/N): ");

        String opcao = leitura.nextLine().toUpperCase();

        if(opcao.equals("S")){
            camera1.limparHd();
        }
        System.out.println(camera1);
    }
}
