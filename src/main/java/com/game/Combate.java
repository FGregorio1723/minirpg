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
            System.out.println("=== TURNO " + turno + " ===");
            
            if (jogador.agilidade > inimigo.agilidade) {
                jogador.atacar(inimigo);
                if (!inimigo.estaVivo()) {
                    break;
                }
                inimigo.atacar(jogador);
                if (!jogador.estaVivo()) {
                    break;
                }
                turno++;
            } else {
                inimigo.atacar(jogador);
                if (!jogador.estaVivo()) {
                    break;
                }
                jogador.atacar(inimigo);
                if (!inimigo.estaVivo()) {
                    break;
                }
                turno++;
            }
        }
        return jogador.estaVivo();
    }
    private void turnoJogador(){
        System.out.println();
        System.out.println();        
        System.out.println();
        int escolha = scanner.nextInt();
    }   
}