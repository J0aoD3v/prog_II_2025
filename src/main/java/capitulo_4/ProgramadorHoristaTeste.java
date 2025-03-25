package capitulo_4;

import java.util.Scanner;

/**
 *
 * @author José
 */
class ProgramadorHoristaTeste {
    
    
    public static void main(String[] args) {
        ProgramadorHorista th1 = new ProgramadorHorista();
        th1.valorHora = 80.0;
        th1.horasTrabalhadas = 20.0; 
        double salario = th1.calcularSalario();
        System.out.println("Salário do primeiro: " + salario);
                

        ProgramadorHorista th2 = new ProgramadorHorista( 82.5, 25.0);
        System.out.print("Salário do segundo: ");
        System.out.println(th2.calcularSalario());
        
    }
    
}
