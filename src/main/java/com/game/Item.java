package com.game;

public class Item {
    private String nome;
    private int quantidade;
    private int cura;

    public Item (String nome, int quantidade, int cura) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.cura = cura;

    }

    public void usar (Personagem alvo) {
        if (quantidade <= 0) {
            System.out.println("Você possui :" + quantidade + " de " + nome);
            return;
        }     
        if (alvo.hpAtual >= alvo.hpMaximo) {
            System.out.println(alvo.nome + " Já está com a vida cheia!");
            return;
        }

        alvo.hpAtual = alvo.hpAtual + cura;

        if (alvo.hpAtual > alvo.hpMaximo ) {
            alvo.hpAtual = alvo.hpMaximo;
        }
        
        System.out.println(alvo.nome + " usou " + nome +  " e recuperou " 
                            + cura + " HP! [HP: " + alvo.hpAtual + "/" +
                            alvo.hpMaximo + "]");
        quantidade --;
    }
    public String getNome() {
        return nome;

    }

    public int getQuantidade() {
        return quantidade;

    } 

    public int getCura() {
        return cura;

    }
    
}
