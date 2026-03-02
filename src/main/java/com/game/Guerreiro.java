package com.game;

public class Guerreiro {
                        //-> ATRIBUTOS BÁSICOS
    Private String nome;
    Private int nivel;
    Private int Experiencia;

                        //-> ATRIBUTOS DE COMBATE
    Private int hpMaximo;
    Private int hpAtual;
    Private int forca;
    Private int defesa;
    Private int agilidade;
    
    public Guerreiro(String nome){ //-> Construtor
        this.nome = nome;
        this.nivel = 1;
        this.Experiencia = 0;

                        //-> Valores iniciais 
        this.hpMaximo = 120;
        this.hpAtual = 120;
        this.forca = 15;
        this.defesa = 10;
        this.agilidade = 8;

    }

    public void atacar(Guerreiro alvo){//-> Metodo de combate
        Random random = new random();

        int danoBase = this.forca;

        
    } 
}