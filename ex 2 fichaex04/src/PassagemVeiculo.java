import java.time.LocalDate;
import java.util.Date;

public class PassagemVeiculo {
    private int codpass;
    private Date dthorapass;
    private String marca;
    private String matricula;

    public PassagemVeiculo(int codpass, Date dthorapass, String marca, String matricula){
        this.codpass = codpass;
        this.dthorapass = dthorapass;
        this.marca = marca;
        this.matricula = matricula;
    }
    public int getCodpass(){
        return codpass;

    }
    public void setCodpass(){
        this.codpass = codpass;
    }

    public Date getDthorapass(){
        return dthorapass;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(){
        this.marca = marca;
    }

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(){
        this.matricula = matricula;
    }



}
