package capitulo_6;


public class Robo {
    private String nome;
    private Ponto posicao; 
    
    public Robo(){
        nome = "";
        posicao = new Ponto(); 
    }
    
    public Robo(String nome, Ponto posicao){
        this.nome = nome;
        this.posicao = posicao; 
    }
    
    public Robo(String nome){
        this.nome = nome; 
        this.posicao = new Ponto(); 
    }
    
    public void andarDireita(){
        posicao.setX(posicao.getX() + 1);  
    }
    
    public void teletransportar(int x, int y){
        posicao.setX(x);
        posicao.setY(y);
    }
    
    public void teletransportar(Ponto p){
        posicao.setX(p.getX());
        posicao.setY(p.getY());
    }
    
    public boolean colidiu( Robo outroRobo ){
        if ( this.posicao.getX() == outroRobo.getPosicao().getX()
             && this.posicao.getY() == outroRobo.getPosicao().getY()){
            return true;
        }
        return false;    
    }
    
    // Sem parâmetros, volta à posição 0,0
    public void teletransportar(){
        posicao.setX(0);
        posicao.setY(0);
    }
    
    public String informarPosicao(){
        return "Posição: [" + posicao.getX() + "," + 
                posicao.getY() + "]";
    }
    
    public void setNome( String nome ){
        this.nome = nome; 
    }
    
    public String getNome(){
        return nome; 
    }
    
    public void setPosicao ( Ponto p ){
        this.posicao = p; 
    }
    
    public Ponto getPosicao(){
        return posicao; 
    }
    
}
