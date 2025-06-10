package capitulo_8;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList();
        nomes.add("Cebolinha");
        nomes.add("Cascão");
        nomes.add("Adolfinho");
       
        
        Collections.sort(nomes);
        
        for (String i : nomes){
            System.out.println(i);
        }
        
        
    }
    
}
