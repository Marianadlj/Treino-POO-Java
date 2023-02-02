package br.com.gft.model;

import java.util.List;

public class Personagem {
    String Nome;
    int Vida;
    int Mana;
    double Xp;
    int Inteligencia;
    int Forca;
    int Level;

    public Personagem(String nome, int vida, int mana, double xp, int inteligencia, int forca, int level) {
        Nome = nome;
        Vida = vida;
        Mana = mana;
        Xp = xp;
        Inteligencia = inteligencia;
        Forca = forca;
        Level = level;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public double getXp() {
        return Xp;
    }

    public void setXp(double xp) {
        Xp = xp;
    }

    public int getInteligencia() {
        return Inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        Inteligencia = inteligencia;
    }

    public int getForca() {
        return Forca;
    }

    public void setForca(int forca) {
        Forca = forca;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    void lvlUp() {

    }
}
