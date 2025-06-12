package capitulo_7;

abstract class Bebida {
    protected String marca;
    protected String nome;

    public Bebida(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }

    public abstract String descricao();
}

interface IBebidaAlcoolica {
    double getTeorAlcoolico();
    String descricao();
}

class BebidaAlcoolica extends Bebida implements IBebidaAlcoolica {
    private final double teorAlcoolico;

    public BebidaAlcoolica(String marca, String nome, double teorAlcoolico) {
        super(marca, nome);
        this.teorAlcoolico = teorAlcoolico;
    }

    @Override
    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    @Override
    public String descricao() {
        return nome + " (" + marca + ") - Teor Alcoólico: " + teorAlcoolico + "%";
    }
}

class Refrigerante extends Bebida {
    private final String sabor;

    public Refrigerante(String marca, String nome, String sabor) {
        super(marca, nome);
        this.sabor = sabor;
    }

    @Override
    public String descricao() {
        return nome + " (" + marca + ") - Sabor: " + sabor;
    }
}

class Suco extends Bebida {
    private final String fruta;

    public Suco(String marca, String nome, String fruta) {
        super(marca, nome);
        this.fruta = fruta;
    }

    @Override
    public String descricao() {
        return nome + " (" + marca + ") - Fruta: " + fruta;
    }
}