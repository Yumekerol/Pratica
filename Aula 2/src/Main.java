
public class Main {
    public static void main(String[] args) {
        Singleton single1 = Singleton.getInstance();
        single1.setName("Roberto");
        System.out.println(single1.getName());
    }
}