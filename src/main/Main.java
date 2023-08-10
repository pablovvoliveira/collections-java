package main;

import main.list.Ordenacao.OrdenarPessoas;
import main.list.Pesquisa.CatalogoLivros;
import main.list.operacoesBasicas.ListaTarefa;
import main.set.Pesquisa.AgendaContatos;
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
        */

        // Testando pesquisas com Set
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
    }
}