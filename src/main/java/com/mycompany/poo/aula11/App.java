package com.mycompany.poo.aula11;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // Modificar o valor
        pessoa.setNome("Pietro");
        pessoa.setIdade(1026);

        // Acessar o valor
        System.out.printf("%s tem %d anos de idade\n",
        pessoa.getNome(), pessoa.getIdade());
    }

}
