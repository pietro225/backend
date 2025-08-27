package com.mycompany.poo.aula11;

public class Pessoa {
     /**
     * Encapsulamento (Métodos Acessores/Modificadores)
     *
     * Em projetos em grande escala, para mantermos a segurança de nossas classes,
     * Utilizamos o modificador de acesso privado, com uma maior frequência.
     *
     * Em muitas situações precisamos buscar e alterar uma ou mais informações,
     * e é nesse cenário que utilizamos os métodos:
     * - Getter: Acessar/Buscar
     * - Setter: Modificar/Alterar
     */

    private String nome;
    private int idade;
    private double salario;
    private double altura;

    // Declaramos sempre após a declaração dos atributos

    // Método acessor, sempre começa com get
    public String getNome() {
        return nome;
    }

    // Método modificador, sempre começa com set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSalario() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAltura() {
        return nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}