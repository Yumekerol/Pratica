public class Climatizador extends Aquecedor{
  private boolean refrigeracaoLigada = false;
  private Velocidade potRefrigerador = Velocidade.parada;

  public Climatizador(){

  }
  public Velocidade getPotRefrigerador(){
    return potRefrigerador;
  }
  public void setPotRefrigerador(Velocidade new_refrigerador){
    this.potRefrigerador = new_refrigerador;
  }
  public boolean isRefrigeracaoLigada(){
    return refrigeracaoLigada;
  }
  public void ligarRefrigeracao(){
    this.refrigeracaoLigada = true;
    this.desligarAquecimento();
  }
  public void desligarRefrigeracao(){
    this.refrigeracaoLigada = false;
  }

  @Override
  public void ligarAquecimento(){
    this.ligarAquecimento();
    this.refrigeracaoLigada = false;
  }
  public String toString(){
    return ("Refrigeracao ligada?: " +isRefrigeracaoLigada() +"\n" + "Potencia refrigeracao: " +getPotRefrigerador());
  }


}
