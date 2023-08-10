package main.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, Integer codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        if (!convidadosSet.isEmpty()) {
            for (Convidado c : convidadosSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadosSet.remove(convidadoParaRemover);
        }
    }

    public int contarConvidados() {
       return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }
}
