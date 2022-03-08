package salariosBonificacoes;

public class Funcionario {

	String nome;
	int idade;
	double salario;
	
	double bonificacao() {
		return salario;
	}
	
	Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
}
