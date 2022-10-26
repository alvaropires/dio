package desafio;

import java.util.List;
import java.util.Scanner;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
    }

    public static Conta criarConta(Integer tipoConta) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        String nome = scanner.next();

        if(tipoConta == 1){
            Conta contaCorrente = new ContaCorrente(new Cliente(nome));
            System.out.println("Conta Corrente criada com sucesso!");
            return contaCorrente;
        }
        else {
            Conta contaPoupanca = new ContaPoupanca(new Cliente(nome));
            System.out.println("Conta Poupança criada com sucesso!");
            return contaPoupanca;
        }
    }

    public static Integer indiceDeContaEmLista (Integer valorParaBusca,List<Conta> contas){
        Integer indice = null;
        for (Conta conta: contas) if(conta.getNumero() == valorParaBusca) indice = contas.indexOf(conta);
        return indice;
    }
}
