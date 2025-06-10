package capitulo_8;

import java.util.Objects;


public class Carro implements IComparavel {
    private String placa; 
    
    public Boolean ehIgual( IComparavel outro ){
        Carro temp = (Carro) outro;
        return this.getPlaca() == temp.getPlaca(); 
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
}
