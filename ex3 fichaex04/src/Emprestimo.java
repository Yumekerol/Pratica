import java.util.Date;

public class Emprestimo {
    private int numero;
    private Date dtemp;
    private String nomeSocio;

    public Emprestimo(int numero, Date dtemp, String nomeSocio){
        this.numero = numero;
        this.dtemp = dtemp;
        this.nomeSocio = nomeSocio;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(){
        this.numero = numero;
    }

    public Date getDtemp(){
        return dtemp;
    }

    public void setDtemp(){
        this.dtemp = dtemp;
    }
    public String getNomeSocio(){
        return nomeSocio;
    }

    public void setNomeSocio(){
      this.nomeSocio = nomeSocio;
    }

}
