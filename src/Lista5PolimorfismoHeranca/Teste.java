package Lista5PolimorfismoHeranca;

public class Teste {
	
public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.nome();
		cachorro.idade();
		cachorro.som();
		cachorro.movimento();
		
		System.out.println("---------------------------------------------");
		
		cavalo.nome();
		cavalo.idade();
		cavalo.som();
		cavalo.movimento();
		
		System.out.println("---------------------------------------------");
		
		preguica.nome();
		preguica.idade();
		preguica.som();
		preguica.movimento();

	}

}
