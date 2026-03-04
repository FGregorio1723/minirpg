package com.game;
import java.util.Random;

public class Zumbi extends Personagem{
    public Zumbi (String nome){
        super(nome);
    }
    @Override
    protected void inicializarAtributos(){
        Random random = new Random();

        this.hpMaximo = random.nextInt(86, 121);
        this.forca = random.nextInt(11, 23);
        this.agilidade = random.nextInt(2, 7);
    }
}
