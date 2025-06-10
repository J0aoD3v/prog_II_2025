package capitulo_7;


public class Carro extends Veiculo {
    private Integer portas; 

    public Carro() {
        super();
        this.portas = 2; 
    }

    public Carro(String marca, Integer ano, Double valor, 
            String placa, Integer portas ) {
        super(marca, ano, valor, placa);
        this.portas = portas; 
    }
    
   
    @Override
    public Double calcularIpva(){
        return getValor() * 0.04;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }
    
    
}
