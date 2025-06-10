package capitulo_7;


public class VeiculoTeste {
    public static void main(String[] args) throws CloneNotSupportedException {       

        Motocicleta m1 = new Motocicleta("Honda", 2025, 25_000.0, "FZD4TR", 250);
        
        
        
    }
    
//    public static void ordenar(Veiculo frota[]){
//        int n = frota.length;
//        boolean trocou; 
//
//        for (int i = 0; i < n - 1; i++) {
//            trocou = false;
//            for (int j = 0; j < n - 1 - i; j++) {
//                // Compara as placas dos veículos adjacentes
//                // Se a placa do veículo atual for maior que a do próximo, troca-os de posição
//                if (frota[j].getPlaca().compareTo(frota[j + 1].getPlaca()) > 0) {
//                    // Realiza a troca
//                    Veiculo temp = frota[j];
//                    frota[j] = frota[j + 1];
//                    frota[j + 1] = temp;
//                    trocou = true;
//                }
//            }
//            // Se nenhuma troca ocorreu nesta passagem, o array já está ordenado
//            if (!trocou) {
//                break;
//            }
//        }
//        
//        for (Veiculo v : frota){
//            System.out.println(v.getPlaca());
//        }
//    }
 
    
    
    
//    public static void totalizarIpva( Veiculo frota[] ){
//        Double total = 0.0;
//        for ( Veiculo v : frota){
//            total += v.calcularIpva();
//        }
//        
//        System.out.println("\n" + total);
//    }
}
