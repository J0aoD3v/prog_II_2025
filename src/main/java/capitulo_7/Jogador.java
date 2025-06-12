package capitulo_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Jogador {
    private String nome;
    private int pontuacao;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    @Override
    public String toString() {
        return nome + " - Pontuação: " + pontuacao;
    }

    class ComparadorPontuacao implements Comparator<Jogador> {
        @Override
        public int compare(Jogador j1, Jogador j2) {
            return Integer.compare(j2.getPontuacao(), j1.getPontuacao()); // Ordem decrescente
        }
    }
}
