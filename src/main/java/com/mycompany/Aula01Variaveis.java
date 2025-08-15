package com.mycompany;

public class App {

    public static void main(string[] args)  {
       //variavel logica 

       //tipo primitivo
       boolean valorlogicoPrimitivo = true;

       //Exibe o Valor
       System.out.println(valorLogicoPrimitivo);

       //tipo abstrato
       boolean valorogicoAbstrato = false;

       //Exibe o texto
       System.out.println("O valor da variavel alorogicoAbstrato é: " + valorogicoAbstrato);

       //variaveis inteiras

       //tipo primitivo
       int valorInteiro = 10; // 32bits
       long valorInteiroLongo =10l; // 64bits

       //tipo abstrato
       Integer valorInteiroAbs = 20;
       Long valorLongoAbs = 20L;

       System.out.println("O valor do valorInteiro é: " + valorInteiro + ", e o valor de valorInteiroLongo é: " + valorInteiroLongo);

       //variaveis Decimais

       //tipo primitivo
       float numeroFloat = 10.5f; // 32bits
       double numeroDouble=10.5; // 64bits

       //tipo abstrato
       float numeroFloatAbs = 10.5f;
       double numeroDoubleAbs=10.5;
       
       

       System.out.println("O valor do numeroFloat é: " + numeroFloat + ", e o valor de numeroDouble é: " + numeroDouble);



    }
}