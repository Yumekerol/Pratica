public class NavioPortaContentores extends Navio{
  private int n_max_contentor;

  public NavioPortaContentores(String matricula, String name, float comprimento, int n_max_contentor) {
    super(matricula, name, comprimento);
    this.n_max_contentor = n_max_contentor;
  }
  public int getN_max_contentor(){
    return n_max_contentor;
  }
  public void setN_max_contentor(int n_max_contentor){
    this.n_max_contentor = n_max_contentor;
  }
}
