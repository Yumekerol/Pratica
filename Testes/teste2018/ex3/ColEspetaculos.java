package Testes.teste2018.ex3;

import java.util.ArrayList;

public class ColEspetaculos {
  ArrayList<Espetaculo> espetaculos;

  public ColEspetaculos(){
    espetaculos = new ArrayList<>();
  }

  public void addEspetaculos(Espetaculo new_espetaculo){
    espetaculos.add(new_espetaculo);
  }
  public int getTotalEspetaculosMusica(){
    int total = 0;
    for(Espetaculo i: espetaculos){
      if(i instanceof EspetaculoBandaMusica){
        total++;
      }
    }
    return total;
  }

  public int getTotalEspetaculosemSALA(){
    int total = 0;
    for(Espetaculo i: espetaculos){
      if(i.getTipo().equals(TipoEspetaculo.EM_SALA)){
        total++;
      }
    }
    return total;
  }

}
