package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, Integer anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for(Livro l : listaLivros) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorPeriodo(Integer anoInicial, Integer anoFinal) {
        List<Livro> livrosPorPeriodo = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for(Livro l : listaLivros) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorPeriodo.add(l);
                }
            }
        }

        return livrosPorPeriodo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()) {
            for(Livro l : listaLivros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

}
