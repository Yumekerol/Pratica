import static java.lang.Math.sin;

public class Triangular extends piramide{
    public Triangular (double altura, double lado_base){
        super(altura, lado_base);
        this.tipo = "triangular";
    }

    private double PI = 3.14159;
    public double getAreabase(){
        return getLado_base()*getLado_base()*sin(PI/3);
    }



}
