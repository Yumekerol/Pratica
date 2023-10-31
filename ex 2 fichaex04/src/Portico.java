import java.util.ArrayList;
import java.util.Date;

public class Portico {

    ArrayList<PassagemVeiculo> passagens;

    public Portico(){
        passagens = new ArrayList<>();
    }

    public ArrayList<PassagemVeiculo> getPassagens(){
        return passagens;
    }

    public boolean verifycod(int cod){
    boolean dupe;
    for(PassagemVeiculo i : passagens){
        if(i.getCodpass() == cod) {
            return true;
        }
    }
    return false;
    }

    public void addPassagem(PassagemVeiculo nv_passagem){
        if(verifycod(nv_passagem.getCodpass())){
            System.out.println("ERRO codigo nao pode ser o mesmo");
            return;
        }
        passagens.add(nv_passagem);
    }

    public int getnumpassagem(Date dthorapass){
        int total = 0;
        for(PassagemVeiculo i : passagens){
            if(i.getDthorapass().equals(dthorapass)){
               total++;
            }

        }
        return total;
    }
    public int getnumpassPesado(Date dthorapass, int marca){
        int total = 0;
        for(PassagemVeiculo i : passagens){
            if(i instanceof PassageVPesados){
                if(((PassageVPesados)i).getMarca().equals(marca)){
                    total++;
                }
            }
        }
        return total;
    }


}
