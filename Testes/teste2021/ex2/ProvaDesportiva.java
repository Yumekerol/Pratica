package Testes.teste2021.ex2;

import java.util.*;

public class ProvaDesportiva {
  private String idProva;
  private List<Atleta> atletas;

  public ProvaDesportiva(String idProva){
    atletas = new ArrayList<>();
    this.idProva = idProva;
  }
  public String getIdProva(){
    return this.idProva;
  }
  public boolean verifynumero(int numero){
    boolean dupe;
    for(Atleta i: atletas){
      if(i.getNum() == numero){
        return true;
      }
    }
    return false;
  }
  public void inscreverAtleta(Atleta new_atleta){
    if(verifynumero(new_atleta.getNum())){
      System.out.println("lamentamos mas o numero nao pode ser repetido!");
    }
    atletas.add(new_atleta);
  }

  public int getQtdAtletasInscritos(){
    int total = 0;
    for(Atleta i: atletas){
      total++;
    }
    return total;
  }

  public Atleta getAtleta(int numAtleta){
    for(Atleta i: atletas){
      if(i.getNum() == numAtleta){
        return i;
      }
    }
    return null;
  }
}
