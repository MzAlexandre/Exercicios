package Lista6Collections;

import java.util.List;
import java.util.ArrayList;

public class ExContJava {
	
public static void main (String[] args) {
		
		List<String> itens = new ArrayList<>();
		
		itens.add("Mouse");
		itens.add("Teclado");
		itens.add("Notebook");
		itens.add("Placa - mãe");
		itens.add("Pen - Drive");
		
		System.out.println(itens);
		
		System.out.println(itens.size());
		
		itens.add(2,"Memoria Ram");
		System.out.println(itens);
		
		itens.clear();
		System.out.println(itens);
		
	}

}
