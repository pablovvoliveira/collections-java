package main;

import main.list.operacoesBasicas.ListaTarefa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Testando operações básicas
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

    }
}