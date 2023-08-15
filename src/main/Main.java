package main;

import main.list.Ordenacao.OrdenarPessoas;
import main.list.Pesquisa.CatalogoLivros;
import main.list.operacoesBasicas.ListaTarefa;
import main.map.Ordenacao.AgendaEventos;
import main.map.Pesquisa.Estoque;
import main.map.operacoesBasicas.AgendaContatos;
import main.set.Ordenacao.CadastroProdutos;
import main.set.Ordenacao.Produto;
import main.set.Pesquisa.ListaTarefas;
import main.set.Pesquisa.Tarefa;
import main.set.operacoesBasicas.ConjuntoConvidados;

import java.time.LocalDate;
import java.time.Month;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 15), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 17), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2001, Month.JANUARY, 10), "Evento 3", "Atração 3");


        agenda.exibirAgenda();
        agenda.obterProximoEvento();
    }
}