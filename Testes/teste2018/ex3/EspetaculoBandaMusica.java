package Testes.teste2018.ex3;

import java.util.Date;

public class EspetaculoBandaMusica extends Espetaculo{
  private int num_bandas;
  private String descr;

  public EspetaculoBandaMusica(int codEspetaculo, Date dtespetaculo, TipoEspetaculo tipo, int num_bandas, String descr) {
    super(codEspetaculo, dtespetaculo, tipo);
    this.num_bandas = num_bandas;
    this.descr = descr;
  }

}
