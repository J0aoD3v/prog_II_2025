
package capitulo_6;

import java.time.LocalDate;


public class Util {
    
    public static String formatarData(LocalDate data){
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();
        String retorno = "" + dia + "/" + mes + "/"+ ano; 
        return retorno; 
    }
    
    
    public static int calcular(String operacao, int ... v){
        if ( operacao.equalsIgnoreCase("SOM")){
            int soma = 0;
            for (int i : v){
                soma += i;
            }
            return soma; 
        }
        if ( operacao.equalsIgnoreCase("MUL")){
            int produto = 1;
            for (int i : v){
                produto *= i;
            }
            return produto; 
        }
        return 0; 
    }
    
}
