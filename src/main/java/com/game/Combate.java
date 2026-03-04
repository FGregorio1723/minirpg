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
    public boolean iniciar(){
        while (jogador.estaVivo() && inimigo.estaVivo()) { 
            System.out.println(turno);
            if ((this.jogador.agilidade) > (this.inimigo.agilidade)) {
                jogador.atacar(inimigo);
                inimigo.atacar(jogador);
            }else {
                inimigo.atacar(jogador);
                jogador.atacar(inimigo);
            }
        
         turno ++;   
        }
    }


}








//jogador e inimigo são os protagonistas da luta
//Eles têm métodos (atacar(), receberDano()) que fazem tudo acontecer
//A classe Combate só orquestra quem age quando
//scanner permite interação com o jogador
//random adiciona imprevisibilidade
//turno dá contexto visual

// Controlar a ordem dos turnos
// Verificar quem ataca primeiro
// Aplicar dano e verificar mortes
// Determinar vencedor
// Dar recompensa (XP) ao vencedor
// Tratar fugas (opcional)