package Testes.teste2018.ex3;

import java.util.Date;

public class Espetaculo {
  private int codEspetaculo;
  private Date dtespetaculo;
  private TipoEspetaculo tipo;

  public Espetaculo(int codEspetaculo, Date dtespetaculo, TipoEspetaculo tipo){
    this.codEspetaculo = codEspetaculo;
    this.dtespetaculo = dtespetaculo;
    this.tipo = tipo;
  }

  public int getCodEspetaculo(){
    return codEspetaculo;
  }
  public Date getDtespetaculo(){
    return dtespetaculo;
  }

  public void setDtespetaculo(Date new_dtespetaculo){
    this.dtespetaculo = dtespetaculo;
  }
  public TipoEspetaculo getTipo(){
    return tipo;
  }
  public void setTipo(TipoEspetaculo new_tipo){
    this.tipo = tipo;
  }
}
