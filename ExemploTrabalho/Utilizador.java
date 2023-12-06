package ExemploTrabalho;

import java.io.Serial;

public class Utilizador implements AcessoInterface{
    private int id;
    private String name;
    private String email;
    private String password;
    @Serial
    private static final long serialVersionUID = 1L;
    public Utilizador(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String getLogin() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
