package Testes.teste2018.ex3;

import java.util.Date;

public class EspetaculoFolclore extends Espetaculo{
  private String nome;
  private int num_grupos;
  private int num_dancarinos;

  public EspetaculoFolclore(int codEspetaculo, Date dtespetaculo, TipoEspetaculo tipo, String nome, int num_grupos, int num_dancarinos) {
    super(codEspetaculo, dtespetaculo, tipo);
    this.num_grupos = num_grupos;
    this.num_dancarinos = num_dancarinos;
  }
}
