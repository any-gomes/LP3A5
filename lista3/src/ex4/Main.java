package ex4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Avaliacao> listaAv = Arrays.asList(new Avaliacao("LP3","Maria", 8),new Avaliacao("LP3", "Fernando", 5),new Avaliacao("LP3", "Any", 10), new Avaliacao("LP3", "Nina", 9));
		
		Collections.sort(listaAv, new Comparator<Avaliacao>() {
			public int compare(Avaliacao av1,Avaliacao av2) {
				return av1.getNomeAluno().compareTo(av2.getNomeAluno());				
			}
		});
		
		List<Avaliacao> aprovados = listaAv.stream().filter(a -> a.getNota() >= 6).collect(Collectors.toList());
		aprovados.forEach(a -> System.out.println(a.getNomeAluno() + " - Nota: " + a.getNota() + " - APROVADO"));

	}

}
