import java.util.Date;

public class EmprestimoLivro extends Emprestimo{
    private String autor;
    private String titulo;


    public EmprestimoLivro(int numero, Date dtemp, String nomeSocio, String autor, String titulo) {
        super(numero, dtemp, nomeSocio);
        this.autor = autor;
        this.titulo = titulo;
    }



    public String getAutor(){
        return autor;
    }
    public void setAutor(){
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }
}
