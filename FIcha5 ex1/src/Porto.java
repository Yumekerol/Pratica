import java.util.ArrayList;

public class Porto {

  ArrayList<Navio> navios;
  public Porto(){
    navios = new ArrayList<>();
  }

  public boolean verifyMatricula(String nova_matricula){
    boolean dupe;
    for(Navio i: navios){
      if(i.getMatricula().equals(nova_matricula)){
        return true;
      }

    }
    return false;
  }

  public void addNavio(Navio novo_navio){
    if(verifyMatricula(novo_navio.getMatricula())){
      System.out.println("Lamentamos mas nao pode haver matriculas repetidas");
      return;
    }
    navios.add(novo_navio);
  }

  public int getQtdPortaContentores(){
    int total = 0;
    for(Navio i: navios){
      if(i instanceof NavioPortaContentores){
        total++;
      }
    }
    return total;
  }

  public float getcapacidadetotal(){
    float totalc1 = 0;
    float totalc2 = 0;
    float total = 0;
    for(Navio i: navios){
      if(i instanceof NavioPortaContentores){
        totalc1 += ((((NavioPortaContentores)i).getN_max_contentor()) * 10);
      }
      if(i instanceof NavioPetroleiro){
        totalc2 += ((NavioPetroleiro)i).getCapacidade();
      }
    }
    total = totalc1 + totalc2;

    return total;
  }

  public void getInformation(){
    System.out.println("Total de navios porta contentores: " +getQtdPortaContentores());
    System.out.println("Capacidade Total: " +getcapacidadetotal());
  }
}
