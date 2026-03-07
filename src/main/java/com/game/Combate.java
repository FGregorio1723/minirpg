package com.game;
import java.util.Random;
import java.util.Scanner;

public class Combate {
    private Personagem jogador;
    private Personagem inimigo;
    private Scanner scanner;
    private Random random;
    private int turno = 1;
  

    public Combate(Personagem jogador, Personagem inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        this.turno = 1;
    }

    public boolean maisAgil () {

        return jogador.agilidade > inimigo.agilidade;

    }
    
    public boolean tentarFugir (){
        int chance;

        if (maisAgil()) {
            chance = 75;
        } else {
            chance = 50;
        }

        int rolagem = random.nextInt(100) + 1;
         
        if (rolagem <= chance) {

            System.out.println(jogador.nome + " Conseguiu fugir! ");
            return true;

        }else {

            return false;

        }

    }
    public boolean iniciar() {
        while (jogador.estaVivo() && inimigo.estaVivo()) { 


            System.out.println("O que você gostaria de fazer?");
            System.out.println("1. Atacar ");            
            System.out.println("2. Itens ");
            System.out.println("3. Fugir ");   

            boolean agiu = false;  

            int opcao = scanner.nextInt();

            switch (opcao) {
                case(1):
                    if (maisAgil()) {

                        jogador.atacar(inimigo);
                        agiu = true;

                        if (inimigo.estaVivo()) {

                            inimigo.atacar(jogador);
                        }

                    }else {

                        inimigo.atacar(jogador);
                        agiu = true;

                        if (jogador.estaVivo()) {

                            jogador.atacar(inimigo);
                        }
                        
                    }
            
                    break;

                case 2:

                    System.out.println("Menu não está pronto");
                    break;
                
                case 3:

                    boolean fugiu = tentarFugir();
                    if (fugiu){

                        return false;
                    }

                    agiu = true;
                    break;

            }

        }
    return jogador.estaVivo();  
    } 
}