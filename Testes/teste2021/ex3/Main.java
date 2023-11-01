package Testes.teste2021.ex3;

import java.util.Date;

public class Main {
  public static void main(String[] args){
    Garrafeira garrafeira = new Garrafeira();
    Vinho vinho1 = new Vinho("vinhococo", 4, 4, new Date(), TipoVinho.TINTO);
    VinhoCorrente vinho2 = new VinhoCorrente("vinhoxixi", 3, 7, new Date(), TipoVinho.TINTO, 1, "vinhodoxixi");

    garrafeira.addvinho(vinho1);
    garrafeira.addvinho(vinho2);

    garrafeira.getInformacao();
  }
}
