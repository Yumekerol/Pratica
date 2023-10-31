public class Ventoinha {
    private boolean ligado = false;
    private Velocidade velocidade = Velocidade.parada;

    public Ventoinha(){

    }

    public Velocidade getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(Velocidade new_velocidade){
        this.velocidade = new_velocidade;
    }

    public boolean isligado(){
        return ligado;
    }

    public void ligar(){
        this.ligado = true;
        velocidade = Velocidade.baixa;
    }
    public void desligar(){
        this.ligado = false;
        velocidade = Velocidade.parada;
    }
    public String toString(){
        return ("A maquina está ligada?: "+ isligado()+"\n"+"velocidade da maquina: "+ getVelocidade());

    }
}
