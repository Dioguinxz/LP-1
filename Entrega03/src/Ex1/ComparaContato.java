package Ex1;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparaContato implements Comparator<Contato> {


	@Override
	public int compare(Contato o1, Contato o2) {
		// TODO Auto-generated method stub
		return 	o1.getDataNascimento().compareTo(o2.getDataNascimento());
		
	}
	
	
}
