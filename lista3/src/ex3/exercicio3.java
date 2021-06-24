package ex3;

import java.util.function.Function;

public class exercicio3 {
	public static void main(String[] args) {
		Fatorial fatorial = new Fatorial();
		
		fatorial.f = (n) -> {
			if(n== 1) {
				return n;
			}
			return (n * fatorial.f.apply(n-1));
		};
		System.out.println(fatorial.f.apply(3));
		
	}
	
	
	public static class Fatorial{
		Function<Integer,Integer> f;
	}

}
