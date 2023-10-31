import java.util.ArrayList;

public class ColEmprestimos {
    static ArrayList<Emprestimo> emprestimos;

    public ColEmprestimos(){
        emprestimos = new ArrayList<>();
    }

    public ArrayList<Emprestimo> getEmprestimos(){
        return emprestimos;
    }

    public static boolean verifySOCIO(String novo_socio){
        boolean dupe;
        for(Emprestimo i : emprestimos){
            if(i.getNomeSocio().equals(novo_socio)){
                return true;
            }
        }
        return false;
    }

    public static void addemprestimo(Emprestimo novo_emprestimo){
        if(verifySOCIO(novo_emprestimo.getNomeSocio())){
            System.out.println("Lamentamos, mas não existe socios com nomes iguais");
            return;
        }
        emprestimos.add(novo_emprestimo);
    }

    public int getnumempretimos(){
        int total = 0;
        for(Emprestimo i : emprestimos){
            total++;
        }
        return total;
    }

    public int getnumemprestimosLivro(){
    int total = 0;
    for(Emprestimo i : emprestimos){
        if(i instanceof EmprestimoLivro){
            total++;
        }
    }
    return total;
    }
    
}
