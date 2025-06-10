package capitulo_8;

import java.util.Objects;

public class Papagaio implements IComparavel {
    private Integer anilha;
    private String nome; 

    public Papagaio() {
        this.anilha = 0;
        this.nome = "";
    }

    public Papagaio(Integer anilha, String nome) {
        this.anilha = anilha;
        this.nome = nome;
    }
    
    public Integer getAnilha() {
        return anilha;
    }

    public void setAnilha(Integer anilha) {
        this.anilha = anilha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Boolean ehIgual(IComparavel outro) {
        Papagaio p = (Papagaio) outro;
        return p.getAnilha() == this.getAnilha();
    }

    
    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Papagaio other = (Papagaio) obj;
        return Objects.equals(this.anilha, other.anilha);
    }
    
    
}
