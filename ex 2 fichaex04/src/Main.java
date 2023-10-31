import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Portico portico = new Portico();
        PassagemVeiculo passagem1 = new PassagemVeiculo(123, new Date(), "nissan", "2334354");
        PassageVPesados passagem2 = new PassageVPesados(123, new Date(), "chevrolet", "5654635",8);

        portico.addPassagem(passagem1);
        portico.addPassagem(passagem2);




    }
}