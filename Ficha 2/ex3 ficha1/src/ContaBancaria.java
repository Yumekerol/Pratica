import java.util.Date;
public class ContaBancaria {
    private String titular;
    private double saldo = 0.0;
    private Date dataAbertura;


    ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = saldo;
        this.dataAbertura = new Date();
    }

    public double getSaldo(){

        return saldo;
    }
    public Date getDataAbertura(){
        return dataAbertura;
    }
    public String getTitular(){
        return titular;
    }
    public void setSaldo(){
        this.saldo = saldo;
    }

    public boolean getInformacaoConta(){
        System.out.println("Titular: "+getTitular());
        System.out.println("Saldo: "+String.format("%.2f", getSaldo()));
        System.out.println("Data de abertura: "+getDataAbertura());
        return false;
    }

    public void depositar(double depositar_valor){
        this.saldo += depositar_valor;
    }

    public void levantar(double levantar_valor){

        if(levantar_valor > this.saldo){
            System.out.println("Nao ~e possivel levantar.");
            return;
        }
        this.saldo -= levantar_valor;
    }
}
