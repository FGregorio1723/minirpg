package com.game;

public class Guerreiro extends Personagem {

    public Guerreiro (String nome){
        super(nome);
    }

    protected void inicializarAtributos(){
        this.hpMaximo = 140;
        this.forca = 18;
        this.agilidade = 6;
    }

}