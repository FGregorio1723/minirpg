package com.game;
import java.util.Random;

public class Guerreiro {
                        //-> ATRIBUTOS BÁSICOS
    Private int Experiencia;
    private String nome;
    private int nivel;
    private int experiencia;

                        //-> ATRIBUTOS DE COMBATE
    private int hpMaximo;
    private int hpAtual;
    private int forca;
    private int agilidade;
    
    public Guerreiro(String nome){ //-> Construtor
        this.nome = nome;
        this.nivel = 1;
        this.experiencia = 0;

                        //-> Valores iniciais 
        this.hpMaximo = 120;
        this.hpAtual = 120;
        this.forca = 15;
        this.agilidade = 8;

    }

    public void atacar(Guerreiro alvo){//-> Metodo de combate
        Random random = new Random();
        int danoBase = this.forca;
        int randomNum = random.nextInt(5) + 1;

        if (randomNum == 5){//-> gera acerto critico se gerar o valor 5
            danoBase += (randomNum * 2);
            System.out.println("⚡ ACERTO CRITICO ⚡");
            System.out.println(this.nome + " Causou " + danoBase + " De dano!" );

        }else { //-> dano normal gerando numero < 5
            danoBase += randomNum;
            System.out.println(this.nome + " Causou " + danoBase + " De dano!" );

        }
        alvo.receberDano(danoBase);
    }
    public void receberDano(int dano){ //-> Metodo para receber dano

        this.hpAtual -= dano;

        if (this.hpAtual < 0) hpAtual = 0;
        System.out.println(this.nome + " Recebeu " + dano + "de dano! [HP: "
            + this.hpAtual + "/" + this.hpMaximo + "]");
        } 

    public boolean estaVivo(){ //-> Verifica se está vivo
        return hpAtual > 0;
    }

    public void receberExperiencia(int xp){
        this.experiencia += xp;
    }
}