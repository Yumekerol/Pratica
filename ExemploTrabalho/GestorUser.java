package ExemploTrabalho;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GestorUser implements Serializable {
    private Map<Integer, Utilizador> users;
    @Serial
    private static final long serialversionUID = 1L;

    public GestorUser(){
        users = new HashMap<>();
    }

    public int addUtilizador(String name,String email, String password){
        //String pass = Hash.hash(password);
        int id = GestorIDs.getInstance().getNextuserId();
        Utilizador utilizador = new Utilizador(id, name, email, pass);
        users.put(id,utilizador);
        return id;
    }

    public Utilizador getUtilizador(int id) throws NullPointerException{
        return this.users.get(id);
    }

}
