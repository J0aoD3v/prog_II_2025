
package capitulo_6;


public class RoboTeste {
    public static void main(String[] args) {
        Robo robo = new Robo("Tomtom"); 
        robo.teletransportar(10, 35);        
        System.out.println(robo.informarPosicao()); 
        
        robo.teletransportar(new Ponto(7, 15));
        System.out.println(robo.informarPosicao()); 
        
        robo.teletransportar();
        System.out.println(robo.informarPosicao()); 
    }
}
