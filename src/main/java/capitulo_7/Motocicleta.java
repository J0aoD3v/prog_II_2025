package capitulo_7;

public class Motocicleta extends Veiculo{
    private Integer cilindradas; 

    public Motocicleta(){
        super();
        this.cilindradas = 0; 
    }
    
    public Motocicleta( String marca,Integer ano, 
            Double valor, String placa, Integer cilindradas) {
        super(marca, ano, valor, placa);
        this.cilindradas = cilindradas;
    }

    @Override
    public Double calcularIpva(){
        return getValor() * 0.02;
    }
    
    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }
    
       
}
