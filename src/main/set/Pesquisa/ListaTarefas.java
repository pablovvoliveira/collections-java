package main.set.Pesquisa;

import main.set.operacoesBasicas.Convidado;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefas = new HashSet<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if(!tarefas.isEmpty()) {
            for(Tarefa t : tarefas) {
                if(t.getDescricao() == descricao) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefas.remove(tarefaParaRemover);
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefas);
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefas) {
            if(t.getConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefas) {
            if(!t.getConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t: tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for(Tarefa t: tarefas) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.removeAll(tarefas);
    }

}

