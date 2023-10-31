import org.w3c.dom.ls.LSOutput;

public class Produto {
    private double precoCusto;
    private double precoVenda;

    private String produto;

    Produto(){

    }

    Produto(String produto){
        this.produto = produto;
    }

    public String getProduto(){
        return produto;
    }
    public double getPrecoCusto()
    {
        return precoCusto;
    }
    public double getPrecoVenda(){
        return precoVenda;
    }

    public void setProduto(){
        this.produto = produto;
    }

    public void setPrecoVenda(){
        this.precoVenda = precoVenda;

    }

    public void setPrecoCusto(){
        this.precoCusto = precoCusto;
    }

    public double getMargemLucro(){
        double lucro = 0;
        lucro = precoVenda - precoCusto;
        return lucro;
    }

    public double getPercentMargemLucro(){
        double percent = 0;
        percent = (precoVenda/precoCusto) * 100;
        return percent;
    }

    public void getDescription(){
        System.out.println("Nome: "+getProduto());
        System.out.println("Custo: "+getPrecoCusto());
        System.out.println("Venda: "+getPrecoVenda());
        System.out.println("Lucro: "+getMargemLucro());
        System.out.println("Percentagem lucro: "+getPercentMargemLucro());

    }

}
