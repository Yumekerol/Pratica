
public class Main {
    public static void main(String[] args) {
        piramide piramide1 = new piramide();

        piramide1.setAltura(15);
        piramide1.setLado_base(5);
        Triangular piramide2 = new Triangular(20, 8);
        System.out.println(piramide2.toString());
        System.out.println(piramide1.toString());


    }
}