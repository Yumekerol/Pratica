public class Aquecedor extends Ventoinha{
  private boolean resistenciaLigada = false;
  private Velocidade potResistencia = Velocidade.parada;

  public Aquecedor(){

  }
  public Velocidade getPotResistencia(){
    return potResistencia;
  }
  public void setPotResistencia(Velocidade new_resistencia){
    this.potResistencia = new_resistencia;
  }
  public boolean isResistenciaLigada(){
    return resistenciaLigada;
  }
  public void ligarAquecimento(){
    this.resistenciaLigada = true;
  }
  public void desligarAquecimento(){
    this.resistenciaLigada = false;
  }

  public String toString(){
    return ("aquecimento ligado?: " +isResistenciaLigada() +"\n"+ "Resistencia aquecedor: " +getPotResistencia());
  }
}
