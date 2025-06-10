package capitulo_8;


public class Util {
    
    // Este método pode receber objetos de qualquer classe que implementa IComparavel
    public static Boolean buscar( IComparavel [ ] lista, IComparavel buscado) { 
        Boolean achou = false;
        for (IComparavel i : lista){
            if (i.ehIgual(buscado)){
                achou = true;
            }
        }
        return achou;
    } 

    
}
