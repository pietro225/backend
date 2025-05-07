package com.mycompany;

public class Aula03Operadores {
    public static void main(String[] args) {
        /**
        * tipos de Comentários 
        */

        //Comentários de uma linha   
         
        /**
        * Comentários
        * de multiplas 
        * linhas
        */

        /**
        * Declaração de variaveis 
        */

        String var1; // Toda variável declarada sem valor, automaticamente é null,
        String var2 = null; // Variável declarada com valor null 
        String var3 = ""; // variável declarada com valor vazio (diferente de null)

        /**
        * Operaores Matremáticos
        */

        int num1 = 10;
        int num2 = 2;

        // Soma
        int soma = num1 + num2;
        System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);

        // Subtração
        int subtração = num1 - num2;
        System.out.println("A subtração de " + num1 + " por " + num2 + " é: " + subtração);

        // Multiplicação
        int multiplicacao = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " por " + num2 + " é: " + multiplicacao);

        // Divisão
        int divisao = num1 / num2;
        System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + divisao);

    }

    
}