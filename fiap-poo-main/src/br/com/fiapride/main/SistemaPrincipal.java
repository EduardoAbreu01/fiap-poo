package br.com.fiapride.main;

import br.com.fiapride.model.Camera;
import br.com.fiapride.model.Passageiro;

import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) throws InterruptedException {
        Scanner leitura = new Scanner(System.in);
//        Passageiro passageiro1 = new Passageiro();
//        passageiro1.nome = "Jurandir";
//        passageiro1.saldo = 70.66;
//
//        Passageiro passageiro2 = new Passageiro();
//        passageiro2.nome = "Paulo";
//        passageiro2.saldo = 66.44;
//
//        // Exibindo os dados no Console
//        System.out.println("--- Sistema FiapRide ---");
//        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
//        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        Camera camera1 = new Camera(720,500,"Wifi");
        camera1.comecarFilmagem();

        System.out.println("Deseja liberar espaço?(S/N): ");
        String opcao = leitura.nextLine().toUpperCase();
        if(opcao.equals("S")){
            camera1.limparHd();
        }

    }
}
