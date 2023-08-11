package main.set.Ordenacao;

import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p22) {
        return Double.compare(p1.getPreco(), p22.getPreco());
    }
}
