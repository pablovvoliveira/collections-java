package main;

import main.list.Ordenacao.OrdenarPessoas;
import main.list.Pesquisa.CatalogoLivros;
import main.list.operacoesBasicas.ListaTarefa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Testando operações básicas
        ListaTarefa list = new ListaTarefa();
        System.out.println("Total de tarefas: " + list.obterTotalTarefas());

        list.adicionarTarefa("Tarefa 1");
        list.adicionarTarefa("Tarefa 2");
        list.adicionarTarefa("Tarefa 3");
        list.adicionarTarefa("Tarefa 4");
        System.out.println("Total de tarefas: " + list.obterTotalTarefas());

        list.removerTarefa("Tarefa 3");
        System.out.println("Total de tarefas: " + list.obterTotalTarefas());

        list.obterDescricoesTarefas();



        Testando pesquisas
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivros("Livro 1", "Autor 1", 1996);
        catalogo.adicionarLivros("Livro 2", "Autor 2", 1932);
        catalogo.adicionarLivros("Livro 3", "Autor 4", 1987);
        catalogo.adicionarLivros("Livro 3", "Autor 4", 1940);
        catalogo.adicionarLivros("Livro 5", "Autor 5", 1975);

        System.out.println("Livros por autor: " + catalogo.pesquisarPorAutor("Autor 4"));
        System.out.println("Livros por período: " + catalogo.pesquisarPorPeriodo(1930, 1950));
        System.out.println("Livros por título: " + catalogo.pesquisarPorTitulo("Livro 3"));
        */

        // Testando ordenação
        OrdenarPessoas ordenar = new OrdenarPessoas();
        ordenar.AdicionarPessoa("Maria", 25, 1.60);
        ordenar.AdicionarPessoa("Ana", 21, 1.56);
        ordenar.AdicionarPessoa("Roberto", 27, 1.77);
        ordenar.AdicionarPessoa("Joao", 24, 1.80);

        System.out.println("Pessoas por idade: " + ordenar.ordenarPorIdade());
        System.out.println("Pessoas por altura: " + ordenar.ordenarPorAltura());
    }
}