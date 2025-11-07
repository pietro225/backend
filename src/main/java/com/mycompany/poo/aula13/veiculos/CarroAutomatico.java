package com.mycompany.zoo.aula13.veiculos;

/**
 * Interfaces tem como objetivo fornecer um "esqueleto ou molde"
 * para serem implementados por outras classes.
 * * São muito similares a classes abstratas, com a diferença que
 * NÃO possuem atributos e nem implementam métodos.
 */
public interface Veiculo {

    public void seguirEmFrente();

    public void estacionar();

    public void re();
    
}