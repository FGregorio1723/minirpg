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
    
    
    public Personagem(String nome) { //-> Construtor

        this.nome = nome;
        this.nivel = 1;
        this.experiencia = 0;
        inicializarAtributos();
        this.hpAtual = this.hpMaximo;
    }

    public void atacar(Personagem alvo) { //-> Metodo para atacar

        Random random = new Random();
        int danoBase = this.forca;
        int randomNum = random.nextInt(5) + 1;

        if (randomNum == 5) {  //-> Acerto critico se o numero gerado for 5

            danoBase += (randomNum * 2);
            System.out.println("⚡ ACERTO CRITICO ⚡");
            System.out.println(this.nome + " Causou " + danoBase + " De dano!");

        } else {

            danoBase += randomNum;
            System.out.println(this.nome + " Causou " + danoBase + " De dano!");
        }
        alvo.receberDano(danoBase);
    }
    
    public void receberDano(int dano) { //-> metodo para receber o dano
        this.hpAtual -= dano;

        if (this.hpAtual < 0) 
            hpAtual = 0;
            
        System.out.println(this.nome + " Recebeu " + dano + "de dano! [HP: "
            + this.hpMaximo + "/" + this.hpAtual + "]");
            
    } 

    public boolean estaVivo() { //-> metodo para confirmar se esta vivo

        return hpAtual > 0;

    }


    public void exibirStatus(){ //-> Exibir status
        System.out.println("========================");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel + " Experiência :" + this.experiencia);
        System.out.println("[HP: " + hpMaximo + "/" + hpAtual + "]");
        System.out.println("Força: " + this.forca);
        System.out.println("Agilidade: " + this.agilidade);
        System.out.println("========================");
    }

}