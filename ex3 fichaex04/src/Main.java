import java.util.Date;

public class Main {
    public static void main(String[] args) {
    ColEmprestimos colemprestimos =  new ColEmprestimos();
        Date Date;
        Emprestimo emprestimo1 =new Emprestimo(1, new Date(), "Fernando");
        EmprestimoLivro emprestimo2 = new EmprestimoLivro(2, new Date(), "Fernando", "autor1", "era uma vez um coco");

        ColEmprestimos.addemprestimo(emprestimo1);
        ColEmprestimos.addemprestimo(emprestimo2);


    }
}