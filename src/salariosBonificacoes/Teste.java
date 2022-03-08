package salariosBonificacoes;

public class Teste {
public static void main(String[] args) {
	
	Gerente gerente = new Gerente("Gustavo", 26, 8500);
	
	Supervisor supervisor = new Supervisor("Lucas", 23, 5000);
	
	Vendedor vendedor = new Vendedor("Victor", 25, 3500);
	
	System.out.println(gerente.bonificacao());
	System.out.println(supervisor.bonificacao());
	System.out.println(vendedor.bonificacao());
	
}
}
