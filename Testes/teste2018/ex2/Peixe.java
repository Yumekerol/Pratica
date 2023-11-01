package Testes.teste2018.ex2;

public class Peixe {
  private int cod;
  private String nome;
  private String especie;

  public Peixe(){

  }
  public Peixe(String especie, int cod){
    this.especie = especie;
    this.cod = cod;
  }
  public int getCod(){
    return cod;
  }
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getEspecie(){
    return especie;
  }
  public void setEspecie(String especie){
    this.especie = especie;
  }

}
