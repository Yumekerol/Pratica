public class piramide {
    private double altura;
    private double lado_base;

    protected String tipo = "quadrangular";

    public piramide() {

    }

    public String getTipo(){
        return tipo;
    }
    public piramide(double altura, double ladoBase) {
        this.lado_base = ladoBase;
        this.altura = altura;

    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getLado_base(){
        return lado_base;
    }
    public void setLado_base(double lado_base){
        this.lado_base = lado_base;
    }

    private double volume = 0;

    public double getareabase(){
        return (this.lado_base*this.lado_base);
    }
    public double getVolume() {
        return (getareabase()*this.altura)/3;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Piramide ").append(this.getTipo()).append(" com: \n");
        sb.append("\tArea base = ").append(this.getareabase()).append("\n");
        sb.append("\tVolume = ").append(this.getVolume()).append("\n");
        return sb.toString();
    }
}

