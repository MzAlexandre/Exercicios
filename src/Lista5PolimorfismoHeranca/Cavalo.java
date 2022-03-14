package Lista5PolimorfismoHeranca;

public class Cavalo extends Animais {
	
	public void movimento() {
		System.out.println("Trote");
	}
	
	@Override
	public void nome() {
		System.out.println("Beto");
	}
	
	@Override
	public void idade() {
		System.out.println(50);
	}
	
	@Override
	public void som() {
		System.out.println("Bufar");
	}

}
