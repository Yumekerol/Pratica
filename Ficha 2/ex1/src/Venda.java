import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private Date dataVenda;
    private ArrayList<Produto> produtos;

    private static double vendas = 0;
    

    Venda(){
        this.dataVenda = new Date();
        produtos = new ArrayList<>();

    }

    public Date getDataVenda(){
        return dataVenda;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void  adicionaProduto(Produto novoproduto){
        produtos.add(novoproduto);
    }

    public double calculaTotalVenda(){
        double totalvenda = 0;
        for(Produto produto : produtos){
            totalvenda += produto.getPrecoVenda();

        }
        return totalvenda;
    }
    public double totMargens(){
        double totalLucro = 0;
        for(Produto produto : produtos){
            totalLucro += produto.getMargemLucro();
        }
        return totalLucro;

    }




}
