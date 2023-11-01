
public class Main {
    public static void main(String[] args) {
    Porto porto = new Porto();
    Navio navio1 = new Navio("134br234", "Roberto", 12346);
    NavioPetroleiro naviop1 = new NavioPetroleiro("8675boi432", "naviococo", 32545, 32453);
    NavioPortaContentores naviopc1 = new NavioPortaContentores("743645ol324", "navioxixi", 342234, 1000);

        porto.addNavio(navio1);
        porto.addNavio(naviop1);
        porto.addNavio(naviopc1);

        porto.getInformation();


}
}




