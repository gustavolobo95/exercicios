package salariosBonificacoes;

public class Gerente extends Funcionario{

	Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	double bonificacao() {
		// TODO Auto-generated method stub
		return super.bonificacao() + 10000;
	}
	
	
	
}
