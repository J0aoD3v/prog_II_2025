package capitulo_7;

import java.time.LocalDate;

public abstract class Pessoa {
    private Integer codigo;
    private String nome; 
    private LocalDate dataNascimento;
    
    public Pessoa(){
        this.codigo = 0;
        this.nome = "";
        this.dataNascimento = null;       
    }

    public Pessoa(Integer codigo, String nome, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public abstract double mostrarSalario();
    

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    @Override
    public String toString(){
        return "Sou uma pessoa"; 
    }
    
    
}
