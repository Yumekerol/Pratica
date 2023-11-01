public class NavioPetroleiro extends Navio{
  private float capacidade;

  public NavioPetroleiro(String matricula, String name, float comprimento, float capacidade) {
    super(matricula, name, comprimento);
    this.capacidade = capacidade;
  }

  public float getCapacidade(){

    return capacidade;
  }

  public void setCapacidade(float capacidade){

    this.capacidade = capacidade;
  }
}
