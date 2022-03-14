package Lista5PolimorfismoHeranca;

public class Preguica extends Animais{
	
	public void movimento()
	{
		System.out.println("Escala");
	}
	
	@Override
	 public void nome()
	  {
		  System.out.println("zubumafoo");
	  }
	@Override
	  public void idade() {
		  System.out.println(35);
	  }
	@Override
	  public void som()
	  {
		  System.out.println("Expreguica");
	  }

}
