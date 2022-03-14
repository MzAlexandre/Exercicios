package Lista5PolimorfismoHeranca;

public class Cachorro extends Animais {
	
	public void movimento() {
		System.out.println("Correndo");
	}
	
	@Override
	public void nome() {
		System.out.println("Kobe");
	}
	
	@Override
	public void idade() {
		System.out.println(10);
	}
	
	@Override
	public void som() {
		System.out.println("Latido");
	}

}
