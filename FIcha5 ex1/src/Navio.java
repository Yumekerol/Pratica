public class Navio {
  private String matricula;
  private String name;
  private float comprimento;

  public Navio(String matricula, String name, float comprimento){
    this.matricula = matricula;
    this.name = name;
    this.comprimento = comprimento;
  }

  public String getMatricula(){
    return matricula;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public float getComprimento(){
    return comprimento;
  }
  public void setComprimento(float comprimento){
    this.comprimento = comprimento;
  }
}
