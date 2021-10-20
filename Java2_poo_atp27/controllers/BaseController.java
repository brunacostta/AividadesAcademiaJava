package Java2_poo_atp27.controllers;

import java.util.ArrayList;

//As controllers devem possuir os quatro métodos de CRUD e deve utilizar um ArrayList privado para manter os dados. (Utilize o conceito de Generics nas Controllers)
//Utilize o conceito de Generics nas Controllers
public class BaseController <T> {
    private ArrayList<T> dados;

    public BaseController(){
        this.dados = new ArrayList<>();
    }

    //As controllers devem possuir os quatro métodos de CRUD e deve utilizar um ArrayList privado para manter os dados. (Utilize o conceito de Generics nas Controllers)
    
    //create
    public void create(T obj) {
        this.dados.add(obj);
    }

    //read
    public ArrayList<T> read() {
        return this.dados;
    }

    //update
    public void update(T obj) {
        if(contains(obj)){
            this.delete(obj);
            this.create(obj);
        }  
    }

    //delete
    public void delete(T obj) {
        this.dados.remove(obj);
    }

    //verificar || existe
    public boolean contains(T obj) {
        return this.dados.contains(obj);
    }
}
