import java.util.Date;

public class EmprestimoPeriodico extends Emprestimo{
    private String titulo;

    public EmprestimoPeriodico(int numero, Date dtemp, String nomeSocio, String titulo) {
        super(numero, dtemp, nomeSocio);
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }
}
