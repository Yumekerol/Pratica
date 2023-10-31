
public class Main {
    public static void main(String[] args) {
      Ventoinha v1 = new Ventoinha();
      Aquecedor a1 = new Aquecedor();
      a1.ligarAquecimento();
      a1.setPotResistencia(Velocidade.media);
      v1.ligar();
      v1.setVelocidade(Velocidade.baixa);
      System.out.println(v1.toString());
      System.out.println(a1.toString());

    }
}