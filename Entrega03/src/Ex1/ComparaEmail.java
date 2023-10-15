package Ex1;

import java.util.Comparator;

//Criação da classe ComparaEmail que implementa a interface Comparable.
public class ComparaEmail implements Comparator<Contato> {
    @Override
    public int compare(Contato o1, Contato o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}