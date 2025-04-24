
package capitulo_6;


public class MostraRobos {

    public static void main(String[] args) {
        Robo robos[] = new Robo[5];
        robos[0] = new Robo();
        robos[0].setNome("Frajola");
        robos[1] = new Robo("Piu-Piu");
        robos[2] = new Robo("Lobo mau");
        robos[3] = new Robo("Chapeuzinho");
        robos[4] = new Robo("Juca Bala");
             
        for(Robo aux : robos){
            System.out.println(aux.getNome());
        }
    }
}
