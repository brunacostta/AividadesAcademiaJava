package Java2_poo_atp28.controllers;

import java.util.ArrayList;

public class BaseController <T> {
    ArrayList<T> dados;

    public BaseController(){
        this.dados = new ArrayList<T>();
    }

    //create
    public void create(T obj) {
        this.dados.add(obj);
    }

    //read
    public ArrayList<T> read() {
        return this.dados;
    }

    //delete
    public void delete(T obj) {
        this.dados.remove(obj);
    }

    //update
    public void update(T obj) {
        if(contains(obj)){
            this.delete(obj);
            this.create(obj);
        }   
    }

    //verificar || existe
    public boolean contains(T obj) {
        return this.dados.contains(obj);
    }
}
