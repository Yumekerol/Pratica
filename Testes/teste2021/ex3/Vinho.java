package Testes.teste2021.ex3;

import Testes.teste2018.ex3.TipoEspetaculo;

import java.util.Date;

public class Vinho {
  private String nome;
  private int numLote;
  private float grauAlcool;
  private Date date;
  private TipoVinho tipo;

  public Vinho(String nome, int numLote, float grauAlcool, Date date, TipoVinho tipo){
    this.nome = nome;
    this.numLote = numLote;
    this.grauAlcool = grauAlcool;
    this.date = date;
    this.tipo = tipo;
  }
  public int getNumLote(){
    return this.numLote;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return nome;
  }
  public void setGrauAlcool(float grauAlcool){
    this.grauAlcool = grauAlcool;
  }
  public float getGrauAlcool(){
    return this.grauAlcool;
  }
  public void setTipo(TipoVinho tipo){
    this.tipo = tipo;
  }
  public TipoVinho getTipo(){
    return this.tipo;
  }
  public void setDtEngarrafamento(Date date){
    this.date = date;
  }
  public Date getDate(){
    return this.date;
  }



}
