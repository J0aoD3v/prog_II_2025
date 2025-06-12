package capitulo_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import capitulo_7.Jogador.ComparadorPontuacao;

public class JogadorTeste {
    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();
        jogadores.add(new Jogador("Alice", 50));
        jogadores.add(new Jogador("Bob", 75));
        jogadores.add(new Jogador("Carlos", 100));

        // Ordenando usando Comparator
        jogadores.sort(new ComparadorPontuacao());

        // Exibindo os jogadores ordenados
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }
}
