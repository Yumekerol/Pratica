package Testes.teste2021.ex3;

import java.util.Date;

public class VinhoCorrente extends Vinho{
  private float numLitros;
  private String descr;


  public VinhoCorrente(String nome, int numLote, float grauAlcool, Date DtEngarrafamento, TipoVinho tipo, float numLitros, String descr) {
    super(nome, numLote, grauAlcool, DtEngarrafamento, tipo);
    this.numLitros = numLitros;
    this.descr = descr;
  }
  public void setnumLitros(float numLitros){
    this.numLitros = numLitros;
  }
  public float getNumLitros(){
    return this.numLitros;
  }
}
