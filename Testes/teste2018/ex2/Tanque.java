package Testes.teste2018.ex2;
import java.util.*;
public class Tanque {
  private String idTanque;
  private List<Peixe> peixes;

  public Tanque(String idTanque){
    peixes = new ArrayList<>();
    this.idTanque = idTanque;
  }
  public String getIdTanque(){
    return this.idTanque;
  }

  public boolean verifyCod(int new_cod){
    boolean dupe;
    for(Peixe i: peixes){
      if(i.getCod() == new_cod){
        return true;
      }
    }
    return false;
  }
  public void adicionaPeixe(Peixe new_peixe){
    if(verifyCod(new_peixe.getCod())){
      System.out.println("Nao pode haver codigos repetidos!");
      return;
    }
    peixes.add(new_peixe);
  }

  public int getQtdPeixes(){
    int total = 0;
    for(Peixe i: peixes){
      total++;
    }
    return total;
  }

  public Peixe getPeixes(int codPeixe){
    for(Peixe i: peixes){
      if(i.getCod() == codPeixe){
        return i;
      }
    }
    return null;
  }

}
