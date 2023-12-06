package ExemploTrabalho;

import java.io.Serializable;

public class GestorIDs implements Serializable {
    private int userId;
    private static GestorIDs instance = null;
    private GestorIDs(){
        this.userId = 100000;
    }

    public static GestorIDs getInstance(){
        if(instance == null){
            instance = new GestorIDs();

        }
        return instance;
    }
    public synchronized int getNextuserId(){
        return ++userId;
    }
}
