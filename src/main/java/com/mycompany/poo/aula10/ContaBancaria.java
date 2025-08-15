package com.mycompany.poo.aula10;

public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Realizar depósito
    public void realizarDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Realizar saque
    public void realizarSaque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saque inválido ou saldo insuficiente.");
        }
    }

    // Realizar transferência
    public void realizarTransferencia(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência de R$ " + valor + " realizada para a conta " + contaDestino.numeroConta);
        } else {
            System.out.println("Transferência inválida ou saldo insuficiente.");
        }
    }

    // Mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo da conta " + numeroConta + ": R$ " + saldo);
    }

    // Fechar conta
    public boolean fecharConta() {
        if (saldo == 0) {
            System.out.println("Conta fechada.");
            return true;
        } else {
            System.out.println("Não é possível fechar a conta com saldo não zerado.");
            return false;
        }
    }
}
