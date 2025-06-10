package capitulo_8;

public class Triangulo implements IFigura {
   private Double altura;
   private Double base; 
   
   // construtores 

    @Override
    public Double calcularArea() {
        return base * altura /2; 
    }
    
}
