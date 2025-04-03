package capitulo_4;

class Carro {
    String marca;
    String modelo;
    int ano; 
    int velocidade;

    Carro() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.velocidade = 0;
    }
    
    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }
    
    void acelerar(){
        if (velocidade < 200){
            velocidade += 10;
        }
    }
    
    void frear(){
        if (velocidade > 0){
            velocidade -= 10;
        }
    }
    
}
