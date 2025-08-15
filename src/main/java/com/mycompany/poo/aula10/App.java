package com.mycompany.poo.aula10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando duas contas bancárias
        ContaBancaria conta1 = new ContaBancaria("12345", "João Silva");
        ContaBancaria conta2 = new ContaBancaria("67890", "Maria Oliveira");

        int opcao;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Transferência");
            System.out.println("4. Mostrar Saldo");
            System.out.println("5. Fechar Conta");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    conta1.realizarDeposito(deposito);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    conta1.realizarSaque(saque);
                    break;

                case 3:
                    System.out.print("Digite o valor para transferência: R$ ");
                    double transferencia = scanner.nextDouble();
                    conta1.realizarTransferencia(conta2, transferencia);
                    break;

                case 4:
                    conta1.mostrarSaldo();
                    break;

                case 5:
                    if (conta1.fecharConta()) {
                        System.out.println("Conta fechada com sucesso.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
