package capitulo_7;


public class Circulo {
    private double raio;
    
    public Circulo(){
        this.raio = 0.0;
    }
    
    public Circulo(double raio){
        this.raio = 0; 
    }
    
    public double calcularArea(){
        return Math.PI * raio * raio; 
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
