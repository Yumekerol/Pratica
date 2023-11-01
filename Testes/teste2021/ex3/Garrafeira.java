package Testes.teste2021.ex3;

import java.util.ArrayList;

public class Garrafeira {
  ArrayList<Vinho> vinhos;

  public Garrafeira(){
    vinhos = new ArrayList<>();
  }
  public void addvinho(Vinho new_vinho){
    vinhos.add(new_vinho);
  }
  public int getQtdVinhoReserva(){
    int total = 0;
    for(Vinho i: vinhos){
      if(i instanceof VinhoReserva){
        total++;
      }
    }
    return total;
  }

  public float getQtdLitrosVinhoCorrenteTINTO(){
    float total = 0;
    for(Vinho i: vinhos){
      if(i instanceof VinhoCorrente) {
        if (i.getTipo().equals(TipoVinho.TINTO)) {
          total += ((VinhoCorrente) i).getNumLitros();
        }
      }
    }
    return total;
  }

  public int getQtdGarrafas(){
    int total = 0;
    for(Vinho i: vinhos){
      if(i instanceof VinhoReserva){
        total += ((VinhoReserva)i).getNum_garrafas();
      }
    }
    return total;

  }

  public void getInformacao(){
    System.out.println("Qtd garrafas vinho reserva " +getQtdGarrafas());
    System.out.println("Qtd Litros vinho corrente: " +getQtdLitrosVinhoCorrenteTINTO());
  }
}
