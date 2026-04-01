package br.com.fiapride.main;

import br.com.fiapride.model.Camera;
import br.com.fiapride.model.Gravacao;

import java.util.Scanner;

public class TesteMeuObjeto {
    public static void main(String[] args) throws InterruptedException {

        Scanner leitura = new Scanner(System.in);

        Camera camera1 = new Camera(500,"Wifi",360);

        Gravacao grava1 = new Gravacao("Passeio","01/04/2026",35.25,camera1);

        grava1.exibeResumo();
//        camera1.comecarFilmagem();
//
//        System.out.print("Deseja liberar espaço?(S/N): ");
//
//        String opcao = leitura.nextLine().toUpperCase();
//
//        if(opcao.equals("S")){
//            camera1.limparHd();
//        }
//        System.out.println(camera1);
    }
}
