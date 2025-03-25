package capitulo_4;

/**
 * @author José
 */
class ProgramadorHorista {
    double valorHora;
    double horasTrabalhadas; 
    
    ProgramadorHorista(){
        valorHora = 0.0;
        horasTrabalhadas = 0.0;
    }

    ProgramadorHorista(double vh, double ht) {
        this.valorHora = vh;
        this.horasTrabalhadas = ht;
    }
    
    double calcularSalario(){
        return valorHora * horasTrabalhadas; 
    }
    
}
