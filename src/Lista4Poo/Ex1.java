package Lista4Poo;

public class Ex1 {
	
	public static void main(String[] args) {
		Ex1Class cliente = new Ex1Class();
		
		//definindo valores a v�riavel do meu cliente
		cliente.cpf ="122.122.122-22";
		cliente.nome ="Jos�";
		cliente.rg="1234567";
		cliente.idade=18;
		
		//mostrando os valores do meu cliente 
		cliente.informarcpf();
		cliente.informarnome();
		cliente.informarrg();
		cliente.informaridade();

	}


}
