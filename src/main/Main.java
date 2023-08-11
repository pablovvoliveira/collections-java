package main;

import main.list.Ordenacao.OrdenarPessoas;
import main.list.Pesquisa.CatalogoLivros;
import main.list.operacoesBasicas.ListaTarefa;
import main.set.Ordenacao.CadastroProdutos;
import main.set.Pesquisa.AgendaContatos;
import main.set.Pesquisa.ListaTarefas;
import main.set.Pesquisa.Tarefa;
import main.set.operacoesBasicas.ConjuntoConvidados;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Testando operações básicas Set
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 5678);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 7958);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 5815);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 5118);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Total de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerPorCodigoConvite(7958);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Total de convidados: " + conjuntoConvidados.contarConvidados());


         Testando pesquisas com Set
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Pablo", 99958641);
        agenda.adicionarContato("Darah", 99958641);
        agenda.adicionarContato("Maria", 99958641);
        agenda.adicionarContato("José", 99958641);
        agenda.adicionarContato("Antonio", 99958641);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Pablo"));

        agenda.atualizarNumeroContato("Pablo", 1111111);

        agenda.exibirContatos();

        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa(new Tarefa("estudar", true));
        tarefas.adicionarTarefa(new Tarefa("trabalhar", false));
        tarefas.adicionarTarefa(new Tarefa("treinar", false));
        tarefas.adicionarTarefa(new Tarefa("almoçar", false));

        tarefas.exibirTarefas();
        System.out.println(tarefas.contarTarefas());
        tarefas.removerTarefa("trabalhar");
        System.out.println(tarefas.contarTarefas());
        System.out.println("Tarefas concluídas: " + tarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());

        tarefas.marcarTarefaConcluida("almoçar");
        tarefas.marcarTarefaPendente("estudar");

        tarefas.exibirTarefas();
        tarefas.limparListaTarefas();
        tarefas.exibirTarefas();

         */

        // Testando ordenação com Set
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1L, "Produto 1", 15.1, 6);
        cadastro.adicionarProduto(2L, "Produto 2", 27.9, 6);
        cadastro.adicionarProduto(3L, "Produto 3", 15.42, 6);
        cadastro.adicionarProduto(4L, "Produto 4", 1.25, 6);

        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println(cadastro.exibirProdutosPorPreco());

    }
}