package Ex1;

import java.util.Comparator;

//Criação da classe ComparaContato que implementa a interface Comparable.

public class ComparaContato implements Comparator<Contato> {

	// Sobrepondo o método compareTo//Sobrepondo o método compareTo
	@Override
	public int compare(Contato o1, Contato o2) {
		return o1.getDataNascimento().compareTo(o2.getDataNascimento());

	}

}
