package com.game;
import java.util.Random;

public abstract class Personagem {
    //-> ATRIBUTOS BÁSICOS
    protected String nome;
    protected int nivel;
    protected int experiencia;

    //-> ATRIBUTOS DE COMBATE
    protected int hpMaximo;
    protected int hpAtual;
    protected int forca;
    protected int agilidade;
    
    
    protected abstract void inicializarAtributos();
    
    
    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.experiencia = 0;
        inicializarAtributos();
        this.hpAtual = this.hpMaximo;
    }

    public void atacar(Personagem alvo) {
        Random random = new Random();
        int danoBase = this.forca;
        int randomNum = random.nextInt(5) + 1;

        if (randomNum == 5) {
            danoBase += (randomNum * 2);
            System.out.println("⚡ ACERTO CRITICO ⚡");
            System.out.println(this.nome + " Causou " + danoBase + " De dano!");
        } else {
            danoBase += randomNum;
            System.out.println(this.nome + " Causou " + danoBase + " De dano!");
        }
        alvo.receberDano(danoBase);
    }
    
    public void receberDano(int dano) {
        this.hpAtual -= dano;

        if (this.hpAtual < 0) 
            hpAtual = 0;
            
        System.out.println(this.nome + " Recebeu " + dano + "de dano! [HP: "
            + this.hpAtual + "/" + this.hpMaximo + "]");
    } 

    public boolean estaVivo() {
        return hpAtual > 0;
    }

    public void exibirStatus(){
        
    }

}