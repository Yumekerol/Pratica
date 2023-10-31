import java.util.Date;

public class EmprestimoAudioLivro extends Emprestimo{
    private String titulo;
    private float duracao;


    public EmprestimoAudioLivro(int numero, Date dtemp, String nomeSocio, String titulo, float duracao) {
        super(numero, dtemp, nomeSocio);
        this.duracao = duracao;
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(){
        this.titulo = titulo;
    }

    public float getDuracao(){
        return duracao;
    }

    public void setDuracao(){
        this.duracao = duracao;
    }
}
