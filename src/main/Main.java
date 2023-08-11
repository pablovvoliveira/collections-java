package main;

import main.list.Ordenacao.OrdenarPessoas;
import main.list.Pesquisa.CatalogoLivros;
import main.list.operacoesBasicas.ListaTarefa;
import main.map.operacoesBasicas.AgendaContatos;
import main.set.Ordenacao.CadastroProdutos;
import main.set.Pesquisa.ListaTarefas;
import main.set.Pesquisa.Tarefa;
import main.set.operacoesBasicas.ConjuntoConvidados;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Pablo", 99998888);
        agenda.adicionarContato("Pablo", 35430295);
        agenda.adicionarContato("Darah", 77777717);
        agenda.adicionarContato("Maria", 48652954);
        agenda.adicionarContato("José", 99998887);
        agenda.adicionarContato("Pablo", 12345678);


        agenda.exibirContatos();
    }
}