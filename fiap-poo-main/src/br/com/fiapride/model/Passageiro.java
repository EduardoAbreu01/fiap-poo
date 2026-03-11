package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private String cpf; // Novo Atributo
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf; // Novo Atributo
        this.saldo = 0.00;
    }

    public void adicionarSaldo(double valor) {
        // Regra de negócio: O valor da recarga deve ser positivo
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return; // Interrompe a execução do método
        }
        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {
        // Regra de negócio: O custo deve ser positivo e o saldo deve ser suficiente
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double valor) {
        if(valor >= 0){
            this.saldo = valor;
        }
        else{
            System.out.println("O valor a ser recarregado não pode ser negativo!");
        }

    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
}