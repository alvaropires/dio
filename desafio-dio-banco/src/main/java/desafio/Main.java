package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Digital Bank DIO");
        Scanner scanner = new Scanner(System.in);
        Boolean acessoAoBanco = true;
        Integer opcoes;
        List<Conta> contas = new ArrayList<>();

        while (acessoAoBanco){
            menuDeOpcoes(banco);
            opcoes = scanner.nextInt();
            switch (opcoes){
                case 1:
                case 2:
                    contas.add(Conta.criarConta(opcoes));
                    break;
                case 3:
                    System.out.println("Qual o número da conta que deseja acessar?");
                    Integer numeroDaConta = scanner.nextInt();
                    Integer indiceDaContaSolicitada = Conta.indiceDeContaEmLista(numeroDaConta, contas);
                    Conta contaParaAcessar = contas.get(indiceDaContaSolicitada);
                    Double valorDaOperacao = null;
                    Boolean condicao = true;
                    while (condicao){
                        menuDeOperacoesBancarias();
                        Integer opcaoMenuOperacoes = scanner.nextInt();
                        switch (opcaoMenuOperacoes){
                            case 1:
                                System.out.println("Digite o valor que deseja sacar: R$ ");
                                valorDaOperacao = scanner.nextDouble();
                                contaParaAcessar.sacar(valorDaOperacao);
                                break;
                            case 2:
                                System.out.println("Digite o valor que deseja depositar: R$ ");
                                valorDaOperacao = scanner.nextDouble();
                                contaParaAcessar.depositar(valorDaOperacao);
                                break;
                            case 3:
                                System.out.println("Digite o valor que deseja transferir: R$ ");
                                valorDaOperacao = scanner.nextDouble();
                                System.out.println("Digite o numero da conta destino: ");
                                Integer numeroContaDestino = scanner.nextInt();
                                Integer indiceContaDestino = Conta.indiceDeContaEmLista(numeroContaDestino,contas);
                                contaParaAcessar.transferir(valorDaOperacao, contas.get(indiceContaDestino));
                                break;
                            case 4:
                                contaParaAcessar.imprimirExtrato();
                                break;
                            case 5:
                                condicao = false;
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 4:
                    for (Conta conta : contas) {
                        conta.imprimirExtrato();
                        System.out.println("__________________________");
                    }
                    break;
                case 5:
                    System.out.println(String.format("Finalizando acesso ao %s...\n", banco.getNome()));
                    acessoAoBanco = false;
                    break;
//                    Teste para ver se está funcionando imprimir infos comuns.
                default:
                    System.out.println("Opção inválida!");
            }


        }
    }
    public static void menuDeOpcoes(Banco banco){
        System.out.println(String.format("\n--\t Seja bem-vindo ao %s.\t--\n", banco.getNome()));
        System.out.println("1 - Criar uma nova conta corrente.");
        System.out.println("2 - Criar uma nova conta poupança.");
        System.out.println("3 - Acessar uma conta (Realizar operações).");
        System.out.println("4 - Imprimir dados das contas.");
        System.out.println("5 - Finalizar acesso.");
        System.out.println("\nDigite sua opção: ");
    }

    public static void menuDeOperacoesBancarias(){
        System.out.println("\n-- MENU DE OPERAÇÕES BANCÁRIAS --\t");
        System.out.println("QUAIS OPERAÇÕES DESEJA REALIZAR?\n");
        System.out.println("1 - Sacar.");
        System.out.println("2 - Depositar.");
        System.out.println("3 - Transferir.");
        System.out.println("4 - Imprimir extrato.");
        System.out.println("5 - Voltar ao menu de opções.");

    }

}


