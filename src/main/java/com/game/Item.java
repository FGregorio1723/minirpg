package com.game;

public class Item {
    private String nome;
    private int quantidade;
    private double cura;

    public Item (String nome, int quantidade, int cura) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.cura = cura;

    }

    public void usar (Personagem alvo) {
        if (quantidade <= 0) {
            System.out.println("Voce possui :" + quantidade + " de " + nome);
            return;
        }
    }

    
}
