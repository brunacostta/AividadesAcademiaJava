package Java2_poo_atp27.views;

import Java2_poo_atp27.controllers.FilmesController;
import Java2_poo_atp27.controllers.SeriesController;
import Java2_poo_atp27.models.Filmes;
import Java2_poo_atp27.models.Series;

public class Main {
    public static void main(String[] args) {
    //A view deve testar as operações de CRUD para cada controller (Utilize dados fixo, sem entrada do usuário).
    FilmesController filmeController = new FilmesController();
    
    Filmes filme = new Filmes();
    filme.id = 5236;
    filme.titulo_filme = "We We";
    filme.genero_filme = "Comédia";

    filmeController.create(filme);
    for (Filmes f : filmeController.read()) {
        System.out.printf("\nFilme criado com sucesso! %s\n", f);
    }

    Filmes filme2 = new Filmes();
    filme2.id = 5236;
    filme2.titulo_filme = "We";
    filme2.genero_filme = "Drama";

    filmeController.update(filme2);
    for (Filmes f : filmeController.read()) {
        System.out.printf("\nFilme criado com sucesso! %s\n", f);
    }

    filmeController.delete(filme);
    for (Filmes f : filmeController.read()) {
    }

    System.out.println("\n========================================================");
    System.out.println("========================================================");

    SeriesController serieController = new SeriesController();
    
    Series serie = new Series();
    serie.id = 2140;
    serie.titulo_serie = "Free Man";
    serie.genero_serie = "Romance";

    serieController.create(serie);
    for (Series s : serieController.read()) {
        System.out.printf("\nSérie criado com sucesso! %s\n", serie);
    }

    Series serie2 = new Series();
    serie2.id = 2145;
    serie2.titulo_serie = "Man";
    serie2.genero_serie = "Ação";

    serieController.update(serie2);
    for (Series s : serieController.read()) {
        System.out.printf("\nSérie criado com sucesso! %s\n", serie2);
    }
    serieController.delete(serie2);
    for (Series s : serieController.read()) { 
    }

    }
   
}
