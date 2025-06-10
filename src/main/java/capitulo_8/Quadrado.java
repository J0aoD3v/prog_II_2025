package capitulo_8;


public class Quadrado implements IFigura {
    private Double lado; 
    
    // construtor 
    
    @Override
    public Double calcularArea(){
       return (lado * lado); 
    }
    
    // get - set 
}
