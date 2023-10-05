package Ex1;

import java.util.Comparator;

public class ComparaPessoa implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa a, Pessoa b) {
        return a.getNome().compareTo(b.getNome());
    }
}
