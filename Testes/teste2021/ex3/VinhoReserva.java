package Testes.teste2021.ex3;

import java.util.Date;

public class VinhoReserva extends Vinho{
  private int num_garrafas;
  private int num1garrafa;
  private String notasprova;

  public VinhoReserva(String nome, int numLote, float grauAlcool, Date DtEngarrafamento, TipoVinho tipo, int num_garrafas, int num1garrafa, String notasprova) {
    super(nome, numLote, grauAlcool, DtEngarrafamento, tipo);
    this.num_garrafas = num_garrafas;
    this.num1garrafa = num1garrafa;
    this.notasprova = notasprova;
  }

  public void setNum_garrafas(int num_garrafas){
    this.num_garrafas = num_garrafas;
  }

  public int getNum_garrafas(){
    return this.num_garrafas;
  }
}
