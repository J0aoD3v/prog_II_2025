package capitulo_4;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro("Audi", "A3", 2025);
        
        for(int i=0; i < 1000; i++){
            carro.acelerar();
        }
        
        System.out.println("Velocidade: "+ carro.velocidade);
        
    }
}
