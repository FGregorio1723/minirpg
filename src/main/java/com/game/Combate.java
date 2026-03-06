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

    
    public boolean iniciar() {
        while (jogador.estaVivo() && inimigo.estaVivo()) { 


            System.out.println("O que você gostaria de fazer?");
            System.out.println("1. Atacar ");            
            System.out.println("2. Itens ");
            System.out.println("3. Fugir ");   

            boolean agiu = false;         
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if(jogador.agilidade > inimigo.agilidade) {

                        System.out.println("Turno de " + jogador.nome);
                        jogador.atacar(inimigo);

                        if (!inimigo.estaVivo()) {
                            System.out.println(inimigo.nome + "Foi Derrotado. ");
                        }else{
                            System.out.println("Turno de " + inimigo.nome);
                            inimigo.atacar(jogador);
                        }
                    

                    if (!jogador.estaVivo()) {
                        System.out.println(jogador.nome + "Morreu!");
                        }

                    }else{

                        inimigo.atacar(jogador);

                        if (!jogador.estaVivo()) {
                            System.out.println(jogador.nome + "Morreu!");   
                        }else{
                            System.out.println("Turno de " + jogador.nome);
                            jogador.atacar(inimigo);
                        }
                    

                    }
                    agiu = true;
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