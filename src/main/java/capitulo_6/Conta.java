
package capitulo_6;

public class Conta {
    private static int contador = 0; 
    private int codigo; 
    private String nome; 
    
    public Conta(String nome){
        contador++;
        codigo = contador; 
        this.nome = nome; 
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Conta.contador = contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
