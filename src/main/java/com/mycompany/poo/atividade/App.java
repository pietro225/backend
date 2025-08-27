package com.mycompany.poo.atividade;

public class App {
    public static void main(String[] args) {
        Time time = new Time();

        // Modificar o valor
        time.setNome("Palmeiras");
        time.setAbreviacao("Pal");
        time.setTorcida(90);
        time.setEstado("São Paulo");
        time.setCidade("São Paulo");

        // Acessar o valor
        System.out.println(time.getNome());
        
    }
    
}
