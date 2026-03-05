package com.game;

public class Main {
    public static void main(String[] args) {
        
        // Criar personagens
        Guerreiro heroi = new Guerreiro("Conan");
        Zumbi inimigo = new Zumbi("Zumbi");
        
        // Mostrar status inicial
        heroi.exibirStatus();
        inimigo.exibirStatus();
        
        // Iniciar combate
        Combate combate = new Combate(heroi, inimigo);
        boolean venceu = combate.iniciar();
        
        // Resultado
        if (venceu) {
            System.out.println("\n🏆 PARABÉNS! Você venceu!");
            heroi.exibirStatus();
        } else {
            System.out.println("\n💀 GAME OVER!");
        }
    }
}