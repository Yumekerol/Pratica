import java.util.Date;

public class PassageVPesados extends PassagemVeiculo{
    private int num_eixos;

    public PassageVPesados(int codpass, Date dthorapass, String marca, String matricula, int num_eixos) {
        super(codpass, dthorapass, marca, matricula);
        this.num_eixos = num_eixos;
    }

    public int getNum_eixos(){
        return num_eixos;

    }
    public void setNum_eixos(){
        this.num_eixos = num_eixos;
    }

}
