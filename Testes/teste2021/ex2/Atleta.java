package Testes.teste2021.ex2;

public class Atleta {
  private int numero;
  private String nome;

  public Atleta() {

  }
  public Atleta(String nome, int numero){
    this.nome = nome;
    this.numero = numero;
  }

  public int getNum(){
    return this.numero;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return this.nome;
  }
  public String getInfoAtleta(){
    return "Atleta com numero" +getNum() + " tem nome " + getNome();
  }
}
