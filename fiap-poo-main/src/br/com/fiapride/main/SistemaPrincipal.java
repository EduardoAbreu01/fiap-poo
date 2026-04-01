package br.com.fiapride.main;

import br.com.fiapride.model.Camera;
import br.com.fiapride.model.Passageiro;

import java.util.Scanner;

public class SistemaPrincipal {
    public static void main(String[] args) throws InterruptedException {
        Scanner leitura = new Scanner(System.in);

        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Regarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);


        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Regarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.getNome() + " | Saldo: R$ " + passageiro1.getSaldo() + " | CPF: " + passageiro1.getCpf());
        System.out.println("Passageiro: " + passageiro2.getNome() + " | Saldo: R$ " + passageiro2.getSaldo() + " | CPF: " + passageiro2.getCpf());

        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);




    }
}
