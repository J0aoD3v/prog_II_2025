package capitulo_6;

import java.time.DayOfWeek;
import java.time.LocalDate;



public class DataExplorer {
    public static void main(String[] args) {      
        LocalDate hoje = LocalDate.now();
        String extenso = Util.formatarData(hoje); 
        System.out.println(extenso);
        
        
    }
    
    public static String formatarData(LocalDate data){
        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();
        String retorno = "" + dia + "/" + mes + "/"+ ano; 
        return retorno; 
    }
    
}
